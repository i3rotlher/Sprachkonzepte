package Aufgabe_2;// ExprBuilder.java
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class PrettySentenceBuilder extends KleinerSatzParserBaseListener {
    private Stack<Sentence> stack = new Stack<Sentence>();

    public Sentence build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitSentence(KleinerSatzParser.SentenceContext ctx) {
        String e = ctx.getText();
        if (ctx.getChildCount() == 3) {
            Sentence right = this.stack.pop();
            Sentence left = this.stack.pop();
            this.stack.push(new SentenceNode(left, ".[dot]\n", right));
        }
    }


    @Override
    public void exitLong(KleinerSatzParser.LongContext ctx) {
        if (ctx.getChildCount() == 2) {
            Sentence right = this.stack.pop();
            Sentence left = this.stack.pop();
//            String op = ctx.getChild(1).getText();
            this.stack.push(new SentenceNode(left, " ", right));
        }
    }

    @Override
    public void exitShort(KleinerSatzParser.ShortContext ctx) {
        if (ctx.getChildCount() == 2) {
            Sentence right = this.stack.pop();
            Sentence left = this.stack.pop();
//            String op = ctx.getChild(1).getText();
            this.stack.push(new SentenceNode(left, " ", right));
        }
    }

    public String translate(String s) {
        switch(s) {
            case "rennt":
                return "runs";
            case "geht":
                return "walks";
            case "sprintet":
                return "sprints";
            case "nach Hause":
                return "home";
            case "in die Schule":
                return "to school";
            case "zur Uni":
                return "to the university";
        }
        return s;
    }


    @Override
    public void exitValue(KleinerSatzParser.ValueContext ctx) {
        String s = "";
        switch (ctx.getStart().getType()) {
            case KleinerSatz.WHAT:
                s = translate(ctx.WHAT().getText()) + "[what]" + s;
                break;
            case KleinerSatz.NAME:
                s = translate(ctx.NAME().getText()) + "[name]" + s;
                break;
            case KleinerSatz.WHERE:
                s = translate(ctx.WHERE().getText()) + "[where]" + s;
                break;
        }

        this.stack.push(new Value(s));
    }

    @Override
    public void enterValue(KleinerSatzParser.ValueContext ctx) {
        if (ctx.getStart().getType() == KleinerSatz.NAME) {
            if (!Character.isUpperCase(ctx.getText().charAt(0))) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }
}

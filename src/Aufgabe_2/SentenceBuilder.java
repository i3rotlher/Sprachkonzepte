package Aufgabe_2;// ExprBuilder.java
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class SentenceBuilder extends KleinerSatzParserBaseListener {
    private Stack<Sentence> stack = new Stack<Sentence>();

    public Sentence build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitSentence(KleinerSatzParser.SentenceContext ctx) {
        int a = ctx.getChildCount();
        String e = ctx.getText();
        if (ctx.getChildCount() == 3) {
            Sentence right = this.stack.pop();
            Sentence left = this.stack.pop();
//            String op = ctx.getChild(1).getText();
            this.stack.push(new SentenceNode(left, "(.)", right));
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


    @Override
    public void exitValue(KleinerSatzParser.ValueContext ctx) {
        String s = "";
        switch (ctx.getStart().getType()) {
            case KleinerSatz.WHAT:
                s = ctx.WHAT().getText() + s;
                break;
            case KleinerSatz.NAME:
                s = ctx.NAME().getText() + s;
                break;
            case KleinerSatz.WHERE:
                s = ctx.WHERE().getText() + s;
                break;
        }

        this.stack.push(new Value(s));
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }
}

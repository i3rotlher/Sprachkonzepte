package Aufgabe_2;// ExprBuilder.java
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
    public void exitExpr(KleinerSatzParser.SentenceContext ctx) {
        if (ctx.getChildCount() == 3) {
            Sentence right = this.stack.pop();
            Sentence left = this.stack.pop();
            String op = ctx.getChild(1).getText();
            this.stack.push(new SentenceNode(left, right, op));
        }
    }

    @Override
    public void exitMultExpr(KleinerSatzParser.SentenceContext ctx) {
        if (ctx.getChildCount() == 3) {
            Sentence right = this.stack.pop();
            Sentence left = this.stack.pop();
            String op = ctx.getChild(1).getText();
            this.stack.push(new SentenceNode(left, right, op));
        }
    }

    @Override
    public void exitValue(KleinerSatzParser.SentenceContext ctx) {
        String s = ctx.Numbe.getText();
        switch (ctx.getStart().getType()) {
            case ExprLexer.PLUS:
                s = ctx.PLUS().getText() + s;
                break;
            case ExprLexer.MINUS:
                s = ctx.MINUS().getText() + s;
                break;
        }

        this.stack.push(new Value(s));
    }
}

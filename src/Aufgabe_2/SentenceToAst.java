package Aufgabe_2;
// ExprToAst.java
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public final class SentenceToAst {
    private SentenceToAst() { }

    public static void main(String[] args) throws Exception {
//        System.out.println("Insert Text to be analysed:");
//        Scanner sc = new Scanner(System.in);  // Create a Scanner object
//        String input = sc.nextLine();//read input string
//        KleinerSatz lexer = new KleinerSatz(CharStreams.fromStream(System.in));
        KleinerSatz lexer = new KleinerSatz(CharStreams.fromString("Tom rennt nach Hause. Max geht. nach Hause geht Tim. Peter geht"));
        KleinerSatzParser parser = new KleinerSatzParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.sentence();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }
        Sentence ast = new SentenceBuilder().build(tree);
        System.out.printf("Sentence.toString() = \"%s\"%n", ast);
    }
}
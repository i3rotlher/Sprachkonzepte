// Generated from java-escape by ANTLR 4.11.1
package Aufgabe_2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KleinerSatzParser}.
 */
public interface KleinerSatzParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KleinerSatzParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(KleinerSatzParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(KleinerSatzParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleinerSatzParser#long}.
	 * @param ctx the parse tree
	 */
	void enterLong(KleinerSatzParser.LongContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#long}.
	 * @param ctx the parse tree
	 */
	void exitLong(KleinerSatzParser.LongContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleinerSatzParser#short}.
	 * @param ctx the parse tree
	 */
	void enterShort(KleinerSatzParser.ShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#short}.
	 * @param ctx the parse tree
	 */
	void exitShort(KleinerSatzParser.ShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleinerSatzParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KleinerSatzParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KleinerSatzParser.ValueContext ctx);
}
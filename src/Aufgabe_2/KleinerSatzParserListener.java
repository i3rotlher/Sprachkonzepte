// Generated from java-escape by ANTLR 4.11.1
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
	 * Enter a parse tree produced by {@link KleinerSatzParser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(KleinerSatzParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(KleinerSatzParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleinerSatzParser#simple_where}.
	 * @param ctx the parse tree
	 */
	void enterSimple_where(KleinerSatzParser.Simple_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#simple_where}.
	 * @param ctx the parse tree
	 */
	void exitSimple_where(KleinerSatzParser.Simple_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleinerSatzParser#simple_with}.
	 * @param ctx the parse tree
	 */
	void enterSimple_with(KleinerSatzParser.Simple_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleinerSatzParser#simple_with}.
	 * @param ctx the parse tree
	 */
	void exitSimple_with(KleinerSatzParser.Simple_withContext ctx);
}
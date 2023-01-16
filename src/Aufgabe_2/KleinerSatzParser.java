package Aufgabe_2;
// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KleinerSatzParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHAT=1, WHERE=2, DOT=3, WITH=4, NAME=5, WS=6;
	public static final int
		RULE_sentence = 0, RULE_simple = 1, RULE_simple_where = 2, RULE_simple_with = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "simple", "simple_where", "simple_with"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", "'mit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHAT", "WHERE", "DOT", "WITH", "NAME", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KleinerSatzParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(KleinerSatzParser.DOT, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public Simple_whereContext simple_where() {
			return getRuleContext(Simple_whereContext.class,0);
		}
		public Simple_withContext simple_with() {
			return getRuleContext(Simple_withContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(8);
				simple();
				}
				break;
			case 2:
				{
				setState(9);
				simple_where();
				}
				break;
			case 3:
				{
				setState(10);
				simple_with();
				}
				break;
			}
			setState(13);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(KleinerSatzParser.NAME, 0); }
		public TerminalNode WHAT() { return getToken(KleinerSatzParser.WHAT, 0); }
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).exitSimple(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(NAME);
			setState(16);
			match(WHAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_whereContext extends ParserRuleContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(KleinerSatzParser.WHERE, 0); }
		public Simple_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).enterSimple_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).exitSimple_where(this);
		}
	}

	public final Simple_whereContext simple_where() throws RecognitionException {
		Simple_whereContext _localctx = new Simple_whereContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			simple();
			setState(19);
			match(WHERE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_withContext extends ParserRuleContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KleinerSatzParser.WITH, 0); }
		public TerminalNode NAME() { return getToken(KleinerSatzParser.NAME, 0); }
		public Simple_withContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).enterSimple_with(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleinerSatzParserListener ) ((KleinerSatzParserListener)listener).exitSimple_with(this);
		}
	}

	public final Simple_withContext simple_with() throws RecognitionException {
		Simple_withContext _localctx = new Simple_withContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_with);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			simple();
			setState(22);
			match(WITH);
			setState(23);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u0000\u0017\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000"+
		"\u0006\u0015\u0001\u0000\u0000\u0000\b\f\u0003\u0002\u0001\u0000\t\f\u0003"+
		"\u0004\u0002\u0000\n\f\u0003\u0006\u0003\u0000\u000b\b\u0001\u0000\u0000"+
		"\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\n\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e\u0001"+
		"\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010\u0011"+
		"\u0005\u0001\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0005"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0003\u0002\u0001\u0000\u0016\u0017"+
		"\u0005\u0004\u0000\u0000\u0017\u0018\u0005\u0005\u0000\u0000\u0018\u0007"+
		"\u0001\u0000\u0000\u0000\u0001\u000b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
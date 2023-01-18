// Generated from java-escape by ANTLR 4.11.1
package Aufgabe_2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KleinerSatz extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHAT=1, WHERE=2, DOT=3, NAME=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHAT", "WHERE", "DOT", "NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHAT", "WHERE", "DOT", "NAME", "WS"
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


	public KleinerSatz(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KleinerSatz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0005M\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u001d\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0004\u0003C\b\u0003\u000b\u0003\f\u0003D\u0001"+
		"\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004I\u0001\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u0001\u0000\u0003\u0001\u0000AZ\u0001\u0000az\u0003\u0000\t\n\r\r  R"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000\u0000\u0000\u0003"+
		"<\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007@\u0001"+
		"\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000b\f\u0005g\u0000\u0000"+
		"\f\r\u0005e\u0000\u0000\r\u000e\u0005h\u0000\u0000\u000e\u001d\u0005t"+
		"\u0000\u0000\u000f\u0010\u0005r\u0000\u0000\u0010\u0011\u0005e\u0000\u0000"+
		"\u0011\u0012\u0005n\u0000\u0000\u0012\u0013\u0005n\u0000\u0000\u0013\u001d"+
		"\u0005t\u0000\u0000\u0014\u0015\u0005s\u0000\u0000\u0015\u0016\u0005p"+
		"\u0000\u0000\u0016\u0017\u0005r\u0000\u0000\u0017\u0018\u0005i\u0000\u0000"+
		"\u0018\u0019\u0005n\u0000\u0000\u0019\u001a\u0005t\u0000\u0000\u001a\u001b"+
		"\u0005e\u0000\u0000\u001b\u001d\u0005t\u0000\u0000\u001c\u000b\u0001\u0000"+
		"\u0000\u0000\u001c\u000f\u0001\u0000\u0000\u0000\u001c\u0014\u0001\u0000"+
		"\u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f\u0005n\u0000"+
		"\u0000\u001f \u0005a\u0000\u0000 !\u0005c\u0000\u0000!\"\u0005h\u0000"+
		"\u0000\"#\u0005 \u0000\u0000#$\u0005H\u0000\u0000$%\u0005a\u0000\u0000"+
		"%&\u0005u\u0000\u0000&\'\u0005s\u0000\u0000\'=\u0005e\u0000\u0000()\u0005"+
		"i\u0000\u0000)*\u0005n\u0000\u0000*+\u0005 \u0000\u0000+,\u0005d\u0000"+
		"\u0000,-\u0005i\u0000\u0000-.\u0005e\u0000\u0000./\u0005 \u0000\u0000"+
		"/0\u0005S\u0000\u000001\u0005c\u0000\u000012\u0005h\u0000\u000023\u0005"+
		"u\u0000\u000034\u0005l\u0000\u00004=\u0005e\u0000\u000056\u0005z\u0000"+
		"\u000067\u0005u\u0000\u000078\u0005r\u0000\u000089\u0005 \u0000\u0000"+
		"9:\u0005U\u0000\u0000:;\u0005n\u0000\u0000;=\u0005i\u0000\u0000<\u001e"+
		"\u0001\u0000\u0000\u0000<(\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000"+
		"\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005.\u0000\u0000?\u0006\u0001"+
		"\u0000\u0000\u0000@B\u0007\u0000\u0000\u0000AC\u0007\u0001\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000E\b\u0001\u0000\u0000\u0000FH\u0007\u0002"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0006\u0004\u0000\u0000L\n\u0001\u0000\u0000\u0000\u0005\u0000\u001c"+
		"<DI\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
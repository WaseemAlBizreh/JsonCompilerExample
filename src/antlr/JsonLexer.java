// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, NULL=3, CM=4, LKB=5, RKB=6, LSB=7, RSB=8, COL=9, STRING=10, 
		DOUBLE=11, INT=12, WS=13, MULTILINECOMMENTS=14, COMMENTS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRUE", "FALSE", "NULL", "CM", "LKB", "RKB", "LSB", "RSB", "COL", "STRING", 
			"ESC", "UNICODE", "HEX", "DOUBLE", "INT", "NUM", "EXP", "DIGIT", "WS", 
			"MULTILINECOMMENTS", "COMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "','", "'{'", "'}'", "'['", "']'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "NULL", "CM", "LKB", "RKB", "LSB", "RSB", "COL", 
			"STRING", "DOUBLE", "INT", "WS", "MULTILINECOMMENTS", "COMMENTS"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonLexer.g4"; }

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
		"\u0004\u0000\u000f\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\tK\b\t\n\t\f\tN\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0003\r^\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rd\b\r\u0001"+
		"\u000e\u0003\u000eg\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000em\b\u000e\u0001\u000e\u0003\u000ep\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000fu\b\u000f\n\u000f\f\u000fx\t\u000f"+
		"\u0003\u000fz\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010~\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0085"+
		"\b\u0012\u000b\u0012\f\u0012\u0086\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u008f\b\u0013\n\u0013"+
		"\f\u0013\u0092\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u009d\b\u0014\n\u0014\f\u0014\u00a0\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0090\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u0000\u0017\u0000\u0019"+
		"\u0000\u001b\u000b\u001d\f\u001f\u0000!\u0000#\u0000%\r\'\u000e)\u000f"+
		"\u0001\u0000\t\u0002\u0000\"\"\\\\\u0006\u0000\"\"bbffnnrrtt\u0003\u0000"+
		"09AFaf\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00a9\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000"+
		"\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000"+
		"\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b?\u0001"+
		"\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000\u0000"+
		"\u0000\u0011E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015"+
		"Q\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019Z\u0001"+
		"\u0000\u0000\u0000\u001b]\u0001\u0000\u0000\u0000\u001do\u0001\u0000\u0000"+
		"\u0000\u001fy\u0001\u0000\u0000\u0000!{\u0001\u0000\u0000\u0000#\u0081"+
		"\u0001\u0000\u0000\u0000%\u0084\u0001\u0000\u0000\u0000\'\u008a\u0001"+
		"\u0000\u0000\u0000)\u0098\u0001\u0000\u0000\u0000+,\u0005t\u0000\u0000"+
		",-\u0005r\u0000\u0000-.\u0005u\u0000\u0000./\u0005e\u0000\u0000/\u0002"+
		"\u0001\u0000\u0000\u000001\u0005f\u0000\u000012\u0005a\u0000\u000023\u0005"+
		"l\u0000\u000034\u0005s\u0000\u000045\u0005e\u0000\u00005\u0004\u0001\u0000"+
		"\u0000\u000067\u0005n\u0000\u000078\u0005u\u0000\u000089\u0005l\u0000"+
		"\u00009:\u0005l\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005,\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=>\u0005{\u0000\u0000>\n\u0001\u0000"+
		"\u0000\u0000?@\u0005}\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005["+
		"\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005]\u0000\u0000D\u0010"+
		"\u0001\u0000\u0000\u0000EF\u0005:\u0000\u0000F\u0012\u0001\u0000\u0000"+
		"\u0000GL\u0005\"\u0000\u0000HK\b\u0000\u0000\u0000IK\u0003\u0015\n\u0000"+
		"JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\"\u0000\u0000P\u0014\u0001"+
		"\u0000\u0000\u0000QR\u0005\\\u0000\u0000RS\u0007\u0001\u0000\u0000S\u0016"+
		"\u0001\u0000\u0000\u0000TU\u0005u\u0000\u0000UV\u0003\u0019\f\u0000VW"+
		"\u0003\u0019\f\u0000WX\u0003\u0019\f\u0000XY\u0003\u0019\f\u0000Y\u0018"+
		"\u0001\u0000\u0000\u0000Z[\u0007\u0002\u0000\u0000[\u001a\u0001\u0000"+
		"\u0000\u0000\\^\u0005-\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0003\u001f\u000f\u0000"+
		"`a\u0005.\u0000\u0000ac\u0003\u001f\u000f\u0000bd\u0003!\u0010\u0000c"+
		"b\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u001c\u0001\u0000"+
		"\u0000\u0000eg\u0005-\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0003\u001f\u000f\u0000ij\u0003"+
		"!\u0010\u0000jp\u0001\u0000\u0000\u0000km\u0005-\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0003"+
		"\u001f\u000f\u0000of\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"p\u001e\u0001\u0000\u0000\u0000qz\u00050\u0000\u0000rv\u0007\u0003\u0000"+
		"\u0000su\u0003#\u0011\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000yr\u0001"+
		"\u0000\u0000\u0000z \u0001\u0000\u0000\u0000{}\u0007\u0004\u0000\u0000"+
		"|~\u0007\u0005\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u001d\u000e\u0000"+
		"\u0080\"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0006\u0000\u0000\u0082"+
		"$\u0001\u0000\u0000\u0000\u0083\u0085\u0007\u0007\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u0012\u0000\u0000\u0089&\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005/\u0000\u0000\u008b\u008c\u0005*\u0000"+
		"\u0000\u008c\u0090\u0001\u0000\u0000\u0000\u008d\u008f\t\u0000\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005*\u0000\u0000\u0094\u0095\u0005/\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0006\u0013\u0000\u0000\u0097(\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005/\u0000\u0000\u0099\u009a\u0005/\u0000"+
		"\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b\u009d\b\b\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0006\u0014\u0000\u0000\u00a2*\u0001\u0000\u0000\u0000\u000e"+
		"\u0000JL]cflovy}\u0086\u0090\u009e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
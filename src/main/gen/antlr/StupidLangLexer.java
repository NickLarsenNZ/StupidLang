// Generated from StupidLangLexer.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StupidLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPEAT=1, PRINT=2, NUMBER=3, LBRACE=4, RBRACE=5, SEMICOLON=6, DQUOTE=7, 
		WS=8, CHARACTER=9;
	public static final int
		STRING_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"REPEAT", "PRINT", "NUMBER", "LBRACE", "RBRACE", "SEMICOLON", "DQUOTE", 
		"WS", "S_DQUOTE", "CHARACTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'repeat'", "'print'", null, "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "REPEAT", "PRINT", "NUMBER", "LBRACE", "RBRACE", "SEMICOLON", "DQUOTE", 
		"WS", "CHARACTER"
	};
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


	public StupidLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StupidLangLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13B\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\'\n"+
		"\4\r\4\16\4(\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6\t\66\n\t\r"+
		"\t\16\t\67\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\2\2\f\4\3\6\4\b\5\n\6"+
		"\f\7\16\b\20\t\22\n\24\2\26\13\4\2\3\4\3\2\62;\5\2\13\f\17\17\"\"\2B\2"+
		"\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2"+
		"\2\2\20\3\2\2\2\2\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\4\30\3\2\2\2\6"+
		"\37\3\2\2\2\b&\3\2\2\2\n*\3\2\2\2\f,\3\2\2\2\16.\3\2\2\2\20\60\3\2\2\2"+
		"\22\65\3\2\2\2\24;\3\2\2\2\26@\3\2\2\2\30\31\7t\2\2\31\32\7g\2\2\32\33"+
		"\7r\2\2\33\34\7g\2\2\34\35\7c\2\2\35\36\7v\2\2\36\5\3\2\2\2\37 \7r\2\2"+
		" !\7t\2\2!\"\7k\2\2\"#\7p\2\2#$\7v\2\2$\7\3\2\2\2%\'\t\2\2\2&%\3\2\2\2"+
		"\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\t\3\2\2\2*+\7}\2\2+\13\3\2\2\2,-\7\177"+
		"\2\2-\r\3\2\2\2./\7=\2\2/\17\3\2\2\2\60\61\7$\2\2\61\62\3\2\2\2\62\63"+
		"\b\b\2\2\63\21\3\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\t\3\2:\23\3\2\2\2;<\7$\2\2<=\3\2\2"+
		"\2=>\b\n\4\2>?\b\n\5\2?\25\3\2\2\2@A\13\2\2\2A\27\3\2\2\2\6\2\3(\67\6"+
		"\7\3\2\2\3\2\t\t\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
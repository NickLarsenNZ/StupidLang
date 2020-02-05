// Generated from StupidLangParser.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StupidLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPEAT=1, PRINT=2, NUMBER=3, LBRACE=4, RBRACE=5, SEMICOLON=6, DQUOTE=7, 
		WS=8, CHARACTER=9;
	public static final int
		RULE_file = 0, RULE_statements = 1, RULE_statement = 2, RULE_repeat = 3, 
		RULE_times = 4, RULE_print = 5, RULE_string = 6;
	public static final String[] ruleNames = {
		"file", "statements", "statement", "repeat", "times", "print", "string"
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

	@Override
	public String getGrammarFileName() { return "StupidLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StupidLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StupidLangParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEAT || _la==PRINT) {
				{
				setState(14);
				statements();
				}
			}

			setState(17);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StupidLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StupidLangParser.SEMICOLON, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				statement();
				setState(20);
				match(SEMICOLON);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REPEAT || _la==PRINT );
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

	public static class StatementContext extends ParserRuleContext {
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				repeat();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(StupidLangParser.REPEAT, 0); }
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(StupidLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StupidLangParser.RBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(REPEAT);
			setState(31);
			times();
			setState(32);
			match(LBRACE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEAT || _la==PRINT) {
				{
				setState(33);
				statements();
				}
			}

			setState(36);
			match(RBRACE);
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

	public static class TimesContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(StupidLangParser.NUMBER, 0); }
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NUMBER);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(StupidLangParser.PRINT, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(StupidLangParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(StupidLangParser.DQUOTE, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PRINT);
			setState(41);
			match(DQUOTE);
			setState(42);
			string();
			setState(43);
			match(DQUOTE);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidLangParserVisitor ) return ((StupidLangParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(45);
					matchWildcard();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\3\2\3"+
		"\3\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\5"+
		"\5%\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\7\b\61\n\b\f\b\16\b\64"+
		"\13\b\3\b\3\62\2\t\2\4\6\b\n\f\16\2\2\2\63\2\21\3\2\2\2\4\30\3\2\2\2\6"+
		"\36\3\2\2\2\b \3\2\2\2\n(\3\2\2\2\f*\3\2\2\2\16\62\3\2\2\2\20\22\5\4\3"+
		"\2\21\20\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2"+
		"\2\25\26\5\6\4\2\26\27\7\b\2\2\27\31\3\2\2\2\30\25\3\2\2\2\31\32\3\2\2"+
		"\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\37\5\b\5\2\35\37\5\f\7"+
		"\2\36\34\3\2\2\2\36\35\3\2\2\2\37\7\3\2\2\2 !\7\3\2\2!\"\5\n\6\2\"$\7"+
		"\6\2\2#%\5\4\3\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\7\2\2\'\t\3\2\2\2"+
		"()\7\5\2\2)\13\3\2\2\2*+\7\4\2\2+,\7\t\2\2,-\5\16\b\2-.\7\t\2\2.\r\3\2"+
		"\2\2/\61\13\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\63\3\2\2\2\62\60\3\2\2"+
		"\2\63\17\3\2\2\2\64\62\3\2\2\2\7\21\32\36$\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
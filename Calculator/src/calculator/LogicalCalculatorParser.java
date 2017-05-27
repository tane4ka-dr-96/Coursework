package calculator;
// Generated from LogicalCalculator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicalCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, NOT=2, SCHAEFFER=3, PIERCE=4, CONJ=5, SUMMODULO=6, DIZJ=7, IMPL=8, 
		EQUIV=9, LPAREN=10, RPAREN=11;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_equivalence = 2, RULE_implication = 3, 
		RULE_sum = 4, RULE_dizjunction = 5, RULE_conjunction = 6, RULE_pierce = 7, 
		RULE_schaeffer = 8, RULE_not = 9, RULE_ckob = 10;
	public static final String[] ruleNames = {
		"start", "expression", "equivalence", "implication", "sum", "dizjunction", 
		"conjunction", "pierce", "schaeffer", "not", "ckob"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "NOT", "SCHAEFFER", "PIERCE", "CONJ", "SUMMODULO", "DIZJ", 
		"IMPL", "EQUIV", "LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "LogicalCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicalCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public EquivalenceContext equivalence() {
			return getRuleContext(EquivalenceContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			equivalence();
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

	public static class EquivalenceContext extends ParserRuleContext {
		public List<ImplicationContext> implication() {
			return getRuleContexts(ImplicationContext.class);
		}
		public ImplicationContext implication(int i) {
			return getRuleContext(ImplicationContext.class,i);
		}
		public List<TerminalNode> EQUIV() { return getTokens(LogicalCalculatorParser.EQUIV); }
		public TerminalNode EQUIV(int i) {
			return getToken(LogicalCalculatorParser.EQUIV, i);
		}
		public EquivalenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterEquivalence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitEquivalence(this);
		}
	}

	public final EquivalenceContext equivalence() throws RecognitionException {
		EquivalenceContext _localctx = new EquivalenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_equivalence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			implication();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUIV) {
				{
				{
				setState(27);
				match(EQUIV);
				setState(28);
				implication();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ImplicationContext extends ParserRuleContext {
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public List<TerminalNode> IMPL() { return getTokens(LogicalCalculatorParser.IMPL); }
		public TerminalNode IMPL(int i) {
			return getToken(LogicalCalculatorParser.IMPL, i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitImplication(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			sum();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPL) {
				{
				{
				setState(35);
				match(IMPL);
				setState(36);
				sum();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SumContext extends ParserRuleContext {
		public List<DizjunctionContext> dizjunction() {
			return getRuleContexts(DizjunctionContext.class);
		}
		public DizjunctionContext dizjunction(int i) {
			return getRuleContext(DizjunctionContext.class,i);
		}
		public List<TerminalNode> DIZJ() { return getTokens(LogicalCalculatorParser.DIZJ); }
		public TerminalNode DIZJ(int i) {
			return getToken(LogicalCalculatorParser.DIZJ, i);
		}
		public List<TerminalNode> SUMMODULO() { return getTokens(LogicalCalculatorParser.SUMMODULO); }
		public TerminalNode SUMMODULO(int i) {
			return getToken(LogicalCalculatorParser.SUMMODULO, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			dizjunction();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMMODULO || _la==DIZJ) {
				{
				{
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==SUMMODULO || _la==DIZJ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				dizjunction();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DizjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> DIZJ() { return getTokens(LogicalCalculatorParser.DIZJ); }
		public TerminalNode DIZJ(int i) {
			return getToken(LogicalCalculatorParser.DIZJ, i);
		}
		public DizjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dizjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterDizjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitDizjunction(this);
		}
	}

	public final DizjunctionContext dizjunction() throws RecognitionException {
		DizjunctionContext _localctx = new DizjunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dizjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			conjunction();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(DIZJ);
					setState(52);
					conjunction();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<PierceContext> pierce() {
			return getRuleContexts(PierceContext.class);
		}
		public PierceContext pierce(int i) {
			return getRuleContext(PierceContext.class,i);
		}
		public List<TerminalNode> CONJ() { return getTokens(LogicalCalculatorParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(LogicalCalculatorParser.CONJ, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			pierce();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJ) {
				{
				{
				setState(59);
				match(CONJ);
				setState(60);
				pierce();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PierceContext extends ParserRuleContext {
		public List<SchaefferContext> schaeffer() {
			return getRuleContexts(SchaefferContext.class);
		}
		public SchaefferContext schaeffer(int i) {
			return getRuleContext(SchaefferContext.class,i);
		}
		public List<TerminalNode> PIERCE() { return getTokens(LogicalCalculatorParser.PIERCE); }
		public TerminalNode PIERCE(int i) {
			return getToken(LogicalCalculatorParser.PIERCE, i);
		}
		public PierceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pierce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterPierce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitPierce(this);
		}
	}

	public final PierceContext pierce() throws RecognitionException {
		PierceContext _localctx = new PierceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pierce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			schaeffer();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIERCE) {
				{
				{
				setState(67);
				match(PIERCE);
				setState(68);
				schaeffer();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SchaefferContext extends ParserRuleContext {
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public List<TerminalNode> SCHAEFFER() { return getTokens(LogicalCalculatorParser.SCHAEFFER); }
		public TerminalNode SCHAEFFER(int i) {
			return getToken(LogicalCalculatorParser.SCHAEFFER, i);
		}
		public SchaefferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schaeffer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterSchaeffer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitSchaeffer(this);
		}
	}

	public final SchaefferContext schaeffer() throws RecognitionException {
		SchaefferContext _localctx = new SchaefferContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_schaeffer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			not();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCHAEFFER) {
				{
				{
				setState(75);
				match(SCHAEFFER);
				setState(76);
				not();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NotContext extends ParserRuleContext {
		public CkobContext ckob() {
			return getRuleContext(CkobContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LogicalCalculatorParser.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_not);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				ckob();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(NOT);
				setState(84);
				ckob();
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

	public static class CkobContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LogicalCalculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LogicalCalculatorParser.RPAREN, 0); }
		public TerminalNode VAR() { return getToken(LogicalCalculatorParser.VAR, 0); }
		public CkobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ckob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterCkob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitCkob(this);
		}
	}

	public final CkobContext ckob() throws RecognitionException {
		CkobContext _localctx = new CkobContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ckob);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(LPAREN);
				setState(88);
				expression();
				setState(89);
				match(RPAREN);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(VAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\ra\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\5\3\5\3\5"+
		"\7\5(\n\5\f\5\16\5+\13\5\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\7\3"+
		"\7\3\7\7\78\n\7\f\7\16\7;\13\7\3\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13\b\3\t"+
		"\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n\3"+
		"\13\3\13\3\13\5\13X\n\13\3\f\3\f\3\f\3\f\3\f\5\f_\n\f\3\f\2\2\r\2\4\6"+
		"\b\n\f\16\20\22\24\26\2\3\3\2\b\t\2^\2\30\3\2\2\2\4\32\3\2\2\2\6\34\3"+
		"\2\2\2\b$\3\2\2\2\n,\3\2\2\2\f\64\3\2\2\2\16<\3\2\2\2\20D\3\2\2\2\22L"+
		"\3\2\2\2\24W\3\2\2\2\26^\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\33\5\6"+
		"\4\2\33\5\3\2\2\2\34!\5\b\5\2\35\36\7\13\2\2\36 \5\b\5\2\37\35\3\2\2\2"+
		" #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\7\3\2\2\2#!\3\2\2\2$)\5\n\6\2%&\7"+
		"\n\2\2&(\5\n\6\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2\2\2"+
		"+)\3\2\2\2,\61\5\f\7\2-.\t\2\2\2.\60\5\f\7\2/-\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\13\3\2\2\2\63\61\3\2\2\2\649\5\16\b\2\65\66"+
		"\7\t\2\2\668\5\16\b\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\r"+
		"\3\2\2\2;9\3\2\2\2<A\5\20\t\2=>\7\7\2\2>@\5\20\t\2?=\3\2\2\2@C\3\2\2\2"+
		"A?\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CA\3\2\2\2DI\5\22\n\2EF\7\6\2\2FH\5\22"+
		"\n\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\21\3\2\2\2KI\3\2\2\2LQ\5"+
		"\24\13\2MN\7\5\2\2NP\5\24\13\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"R\23\3\2\2\2SQ\3\2\2\2TX\5\26\f\2UV\7\4\2\2VX\5\26\f\2WT\3\2\2\2WU\3\2"+
		"\2\2X\25\3\2\2\2YZ\7\f\2\2Z[\5\4\3\2[\\\7\r\2\2\\_\3\2\2\2]_\7\3\2\2^"+
		"Y\3\2\2\2^]\3\2\2\2_\27\3\2\2\2\13!)\619AIQW^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
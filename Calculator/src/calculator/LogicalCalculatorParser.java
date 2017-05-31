package calculator;
// Generated from C:\Users\intel\LogicalCalculator.g4 by ANTLR 4.1
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, NOT=2, SCHAEFFER=3, PIERCE=4, CONJ=5, SUMMODULO=6, DIZJ=7, IMPL=8, 
		EQUIV=9, LPAREN=10, RPAREN=11;
	public static final String[] tokenNames = {
		"<INVALID>", "VAR", "NOT", "SCHAEFFER", "PIERCE", "CONJ", "SUMMODULO", 
		"DIZJ", "IMPL", "EQUIV", "'('", "')'"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_equivalence = 2, RULE_implication = 3, 
		RULE_sum = 4, RULE_dizjunction = 5, RULE_conjunction = 6, RULE_pierce = 7, 
		RULE_schaeffer = 8, RULE_not = 9, RULE_ckob = 10, RULE_var = 11;
	public static final String[] ruleNames = {
		"start", "expression", "equivalence", "implication", "sum", "dizjunction", 
		"conjunction", "pierce", "schaeffer", "not", "ckob", "var"
	};

	@Override
	public String getGrammarFileName() { return "LogicalCalculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); expression();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); equivalence();
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
		public List<TerminalNode> EQUIV() { return getTokens(LogicalCalculatorParser.EQUIV); }
		public ImplicationContext implication(int i) {
			return getRuleContext(ImplicationContext.class,i);
		}
		public TerminalNode EQUIV(int i) {
			return getToken(LogicalCalculatorParser.EQUIV, i);
		}
		public List<ImplicationContext> implication() {
			return getRuleContexts(ImplicationContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitEquivalence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquivalenceContext equivalence() throws RecognitionException {
		EquivalenceContext _localctx = new EquivalenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_equivalence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); implication();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUIV) {
				{
				{
				setState(29); match(EQUIV);
				setState(30); implication();
				}
				}
				setState(35);
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
		public List<TerminalNode> IMPL() { return getTokens(LogicalCalculatorParser.IMPL); }
		public TerminalNode IMPL(int i) {
			return getToken(LogicalCalculatorParser.IMPL, i);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); sum();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPL) {
				{
				{
				setState(37); match(IMPL);
				setState(38); sum();
				}
				}
				setState(43);
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
		public List<TerminalNode> SUMMODULO() { return getTokens(LogicalCalculatorParser.SUMMODULO); }
		public TerminalNode DIZJ(int i) {
			return getToken(LogicalCalculatorParser.DIZJ, i);
		}
		public List<TerminalNode> DIZJ() { return getTokens(LogicalCalculatorParser.DIZJ); }
		public List<DizjunctionContext> dizjunction() {
			return getRuleContexts(DizjunctionContext.class);
		}
		public DizjunctionContext dizjunction(int i) {
			return getRuleContext(DizjunctionContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); dizjunction();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMMODULO || _la==DIZJ) {
				{
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==SUMMODULO || _la==DIZJ) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(46); dizjunction();
				}
				}
				setState(51);
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
		public TerminalNode DIZJ(int i) {
			return getToken(LogicalCalculatorParser.DIZJ, i);
		}
		public List<TerminalNode> DIZJ() { return getTokens(LogicalCalculatorParser.DIZJ); }
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitDizjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DizjunctionContext dizjunction() throws RecognitionException {
		DizjunctionContext _localctx = new DizjunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dizjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); conjunction();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(53); match(DIZJ);
					setState(54); conjunction();
					}
					} 
				}
				setState(59);
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
		public PierceContext pierce(int i) {
			return getRuleContext(PierceContext.class,i);
		}
		public List<PierceContext> pierce() {
			return getRuleContexts(PierceContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); pierce();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJ) {
				{
				{
				setState(61); match(CONJ);
				setState(62); pierce();
				}
				}
				setState(67);
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
		public TerminalNode PIERCE(int i) {
			return getToken(LogicalCalculatorParser.PIERCE, i);
		}
		public SchaefferContext schaeffer(int i) {
			return getRuleContext(SchaefferContext.class,i);
		}
		public List<TerminalNode> PIERCE() { return getTokens(LogicalCalculatorParser.PIERCE); }
		public List<SchaefferContext> schaeffer() {
			return getRuleContexts(SchaefferContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitPierce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PierceContext pierce() throws RecognitionException {
		PierceContext _localctx = new PierceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pierce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); schaeffer();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIERCE) {
				{
				{
				setState(69); match(PIERCE);
				setState(70); schaeffer();
				}
				}
				setState(75);
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
		public TerminalNode SCHAEFFER(int i) {
			return getToken(LogicalCalculatorParser.SCHAEFFER, i);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public List<TerminalNode> SCHAEFFER() { return getTokens(LogicalCalculatorParser.SCHAEFFER); }
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitSchaeffer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchaefferContext schaeffer() throws RecognitionException {
		SchaefferContext _localctx = new SchaefferContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_schaeffer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); not();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCHAEFFER) {
				{
				{
				setState(77); match(SCHAEFFER);
				setState(78); not();
				}
				}
				setState(83);
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
		public TerminalNode NOT() { return getToken(LogicalCalculatorParser.NOT, 0); }
		public CkobContext ckob() {
			return getRuleContext(CkobContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_not);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case VAR:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); ckob();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(NOT);
				setState(86); ckob();
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LogicalCalculatorParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitCkob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CkobContext ckob() throws RecognitionException {
		CkobContext _localctx = new CkobContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ckob);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); match(LPAREN);
				setState(90); expression();
				setState(91); match(RPAREN);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); var();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LogicalCalculatorParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicalCalculatorListener ) ((LogicalCalculatorListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicalCalculatorVisitor ) return ((LogicalCalculatorVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(VAR);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\re\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4\3"+
		"\5\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\3\6\3\6\7\6\62\n\6\f\6\16\6\65"+
		"\13\6\3\7\3\7\3\7\7\7:\n\7\f\7\16\7=\13\7\3\b\3\b\3\b\7\bB\n\b\f\b\16"+
		"\bE\13\b\3\t\3\t\3\t\7\tJ\n\t\f\t\16\tM\13\t\3\n\3\n\3\n\7\nR\n\n\f\n"+
		"\16\nU\13\n\3\13\3\13\3\13\5\13Z\n\13\3\f\3\f\3\f\3\f\3\f\5\fa\n\f\3\r"+
		"\3\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\b\ta\2\32\3\2\2\2"+
		"\4\34\3\2\2\2\6\36\3\2\2\2\b&\3\2\2\2\n.\3\2\2\2\f\66\3\2\2\2\16>\3\2"+
		"\2\2\20F\3\2\2\2\22N\3\2\2\2\24Y\3\2\2\2\26`\3\2\2\2\30b\3\2\2\2\32\33"+
		"\5\4\3\2\33\3\3\2\2\2\34\35\5\6\4\2\35\5\3\2\2\2\36#\5\b\5\2\37 \7\13"+
		"\2\2 \"\5\b\5\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2"+
		"%#\3\2\2\2&+\5\n\6\2\'(\7\n\2\2(*\5\n\6\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,\t\3\2\2\2-+\3\2\2\2.\63\5\f\7\2/\60\t\2\2\2\60\62\5\f\7"+
		"\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\13\3\2\2\2"+
		"\65\63\3\2\2\2\66;\5\16\b\2\678\7\t\2\28:\5\16\b\29\67\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\r\3\2\2\2=;\3\2\2\2>C\5\20\t\2?@\7\7\2\2@B\5\20"+
		"\t\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\17\3\2\2\2EC\3\2\2\2FK\5"+
		"\22\n\2GH\7\6\2\2HJ\5\22\n\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L"+
		"\21\3\2\2\2MK\3\2\2\2NS\5\24\13\2OP\7\5\2\2PR\5\24\13\2QO\3\2\2\2RU\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2T\23\3\2\2\2US\3\2\2\2VZ\5\26\f\2WX\7\4\2\2"+
		"XZ\5\26\f\2YV\3\2\2\2YW\3\2\2\2Z\25\3\2\2\2[\\\7\f\2\2\\]\5\4\3\2]^\7"+
		"\r\2\2^a\3\2\2\2_a\5\30\r\2`[\3\2\2\2`_\3\2\2\2a\27\3\2\2\2bc\7\3\2\2"+
		"c\31\3\2\2\2\13#+\63;CKSY`";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
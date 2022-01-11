// Generated from F:/Labs/HLEF/src/main/resources/antlr\Hlef.g4 by ANTLR 4.9.2
package me.salmonmoses.hlef;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HlefParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, END=3, ELSE=4, ELIF=5, TRUE=6, FALSE=7, EMPTY=8, AND=9, 
		OR=10, NOT=11, ERROR=12, CELL_ID=13, ID=14, NUMBER=15, STRING=16, SHEET_ID=17, 
		WS=18, COMMENT=19, DOLLAR=20, AT=21, COLON=22, LPAREN=23, RPAREN=24, ASSIGN=25, 
		EQUAL=26, NOT_EQUAL=27, PLUS=28, MINUS=29, STAR=30, SLASH=31, GREATER_EQUAL=32, 
		LESS_EQUAL=33, GREATER=34, LESS=35, COMMA=36, EXCLAMATION_POINT=37;
	public static final int
		RULE_argName = 0, RULE_macroUseName = 1, RULE_argUse = 2, RULE_rangeLiteral = 3, 
		RULE_grouping = 4, RULE_primary = 5, RULE_macroUse = 6, RULE_call = 7, 
		RULE_functionArguments = 8, RULE_unary = 9, RULE_factor = 10, RULE_term = 11, 
		RULE_comparison = 12, RULE_equality = 13, RULE_logicAnd = 14, RULE_logicOr = 15, 
		RULE_errorHandler = 16, RULE_argumentsDecl = 17, RULE_decl = 18, RULE_block = 19, 
		RULE_ifExpr = 20, RULE_expr = 21, RULE_formula = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"argName", "macroUseName", "argUse", "rangeLiteral", "grouping", "primary", 
			"macroUse", "call", "functionArguments", "unary", "factor", "term", "comparison", 
			"equality", "logicAnd", "logicOr", "errorHandler", "argumentsDecl", "decl", 
			"block", "ifExpr", "expr", "formula"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'end'", "'else'", "'elif'", "'true'", "'false'", 
			"'empty'", "'and'", "'or'", "'not'", "'error'", null, null, null, null, 
			null, null, null, "'$'", "'@'", "':'", "'('", "')'", "':='", "'='", "'<>'", 
			"'+'", "'-'", "'*'", "'/'", "'>='", "'<='", "'>'", "'<'", "','", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "END", "ELSE", "ELIF", "TRUE", "FALSE", "EMPTY", 
			"AND", "OR", "NOT", "ERROR", "CELL_ID", "ID", "NUMBER", "STRING", "SHEET_ID", 
			"WS", "COMMENT", "DOLLAR", "AT", "COLON", "LPAREN", "RPAREN", "ASSIGN", 
			"EQUAL", "NOT_EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "GREATER_EQUAL", 
			"LESS_EQUAL", "GREATER", "LESS", "COMMA", "EXCLAMATION_POINT"
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
	public String getGrammarFileName() { return "Hlef.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HlefParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArgNameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(HlefParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(HlefParser.ID, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitArgName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitArgName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_argName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DOLLAR);
			setState(47);
			match(ID);
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

	public static class MacroUseNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(HlefParser.AT, 0); }
		public TerminalNode ID() { return getToken(HlefParser.ID, 0); }
		public MacroUseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroUseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterMacroUseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitMacroUseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitMacroUseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroUseNameContext macroUseName() throws RecognitionException {
		MacroUseNameContext _localctx = new MacroUseNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macroUseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(AT);
			setState(50);
			match(ID);
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

	public static class ArgUseContext extends ParserRuleContext {
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ArgUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterArgUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitArgUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitArgUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgUseContext argUse() throws RecognitionException {
		ArgUseContext _localctx = new ArgUseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			argName();
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

	public static class RangeLiteralContext extends ParserRuleContext {
		public List<TerminalNode> CELL_ID() { return getTokens(HlefParser.CELL_ID); }
		public TerminalNode CELL_ID(int i) {
			return getToken(HlefParser.CELL_ID, i);
		}
		public TerminalNode SHEET_ID() { return getToken(HlefParser.SHEET_ID, 0); }
		public TerminalNode EXCLAMATION_POINT() { return getToken(HlefParser.EXCLAMATION_POINT, 0); }
		public TerminalNode COLON() { return getToken(HlefParser.COLON, 0); }
		public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitRangeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitRangeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHEET_ID) {
				{
				setState(54);
				match(SHEET_ID);
				setState(55);
				match(EXCLAMATION_POINT);
				}
			}

			setState(58);
			match(CELL_ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(59);
				match(COLON);
				setState(60);
				match(CELL_ID);
				}
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

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HlefParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlefParser.RPAREN, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			match(LPAREN);
			setState(64);
			expr();
			setState(65);
			match(RPAREN);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HlefParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HlefParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(HlefParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HlefParser.STRING, 0); }
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ArgUseContext argUse() {
			return getRuleContext(ArgUseContext.class,0);
		}
		public TerminalNode EMPTY() { return getToken(HlefParser.EMPTY, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primary);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(FALSE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(STRING);
				}
				break;
			case CELL_ID:
			case SHEET_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				rangeLiteral();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				grouping();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				argUse();
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				match(EMPTY);
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

	public static class MacroUseContext extends ParserRuleContext {
		public FunctionArgumentsContext args;
		public MacroUseNameContext macroUseName() {
			return getRuleContext(MacroUseNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlefParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlefParser.RPAREN, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public MacroUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterMacroUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitMacroUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitMacroUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroUseContext macroUse() throws RecognitionException {
		MacroUseContext _localctx = new MacroUseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_macroUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			macroUseName();
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
				match(LPAREN);
				setState(79);
				((MacroUseContext)_localctx).args = functionArguments();
				setState(80);
				match(RPAREN);
				}
				break;
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

	public static class CallContext extends ParserRuleContext {
		public FunctionArgumentsContext args;
		public TerminalNode ID() { return getToken(HlefParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HlefParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlefParser.RPAREN, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(LPAREN);
			setState(86);
			((CallContext)_localctx).args = functionArguments();
			setState(87);
			match(RPAREN);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HlefParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HlefParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << EMPTY) | (1L << NOT) | (1L << CELL_ID) | (1L << ID) | (1L << NUMBER) | (1L << STRING) | (1L << SHEET_ID) | (1L << DOLLAR) | (1L << AT) | (1L << LPAREN) | (1L << MINUS))) != 0)) {
				{
				setState(89);
				((FunctionArgumentsContext)_localctx).expr = expr();
				((FunctionArgumentsContext)_localctx).args.add(((FunctionArgumentsContext)_localctx).expr);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					((FunctionArgumentsContext)_localctx).expr = expr();
					((FunctionArgumentsContext)_localctx).args.add(((FunctionArgumentsContext)_localctx).expr);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HlefParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(HlefParser.NOT, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MacroUseContext macroUse() {
			return getRuleContext(MacroUseContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unary);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				unary();
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				call();
				}
				break;
			case TRUE:
			case FALSE:
			case EMPTY:
			case CELL_ID:
			case NUMBER:
			case STRING:
			case SHEET_ID:
			case DOLLAR:
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				primary();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				macroUse();
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

	public static class FactorContext extends ParserRuleContext {
		public UnaryContext left;
		public Token SLASH;
		public List<Token> op = new ArrayList<Token>();
		public Token STAR;
		public Token _tset463;
		public UnaryContext unary;
		public List<UnaryContext> right = new ArrayList<UnaryContext>();
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(HlefParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(HlefParser.SLASH, i);
		}
		public List<TerminalNode> STAR() { return getTokens(HlefParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HlefParser.STAR, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((FactorContext)_localctx).left = unary();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(107);
				((FactorContext)_localctx)._tset463 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
					((FactorContext)_localctx)._tset463 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((FactorContext)_localctx).op.add(((FactorContext)_localctx)._tset463);
				setState(108);
				((FactorContext)_localctx).unary = unary();
				((FactorContext)_localctx).right.add(((FactorContext)_localctx).unary);
				}
				}
				setState(113);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext left;
		public Token PLUS;
		public List<Token> op = new ArrayList<Token>();
		public Token MINUS;
		public Token _tset488;
		public FactorContext factor;
		public List<FactorContext> right = new ArrayList<FactorContext>();
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HlefParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HlefParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HlefParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HlefParser.MINUS, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((TermContext)_localctx).left = factor();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					((TermContext)_localctx)._tset488 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((TermContext)_localctx)._tset488 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((TermContext)_localctx).op.add(((TermContext)_localctx)._tset488);
					setState(116);
					((TermContext)_localctx).factor = factor();
					((TermContext)_localctx).right.add(((TermContext)_localctx).factor);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TermContext left;
		public Token GREATER;
		public List<Token> op = new ArrayList<Token>();
		public Token GREATER_EQUAL;
		public Token LESS;
		public Token LESS_EQUAL;
		public Token _tset513;
		public TermContext term;
		public List<TermContext> right = new ArrayList<TermContext>();
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> GREATER() { return getTokens(HlefParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(HlefParser.GREATER, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(HlefParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(HlefParser.GREATER_EQUAL, i);
		}
		public List<TerminalNode> LESS() { return getTokens(HlefParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(HlefParser.LESS, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(HlefParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(HlefParser.LESS_EQUAL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((ComparisonContext)_localctx).left = term();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_EQUAL) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << LESS))) != 0)) {
				{
				{
				setState(123);
				((ComparisonContext)_localctx)._tset513 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_EQUAL) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << LESS))) != 0)) ) {
					((ComparisonContext)_localctx)._tset513 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ComparisonContext)_localctx).op.add(((ComparisonContext)_localctx)._tset513);
				setState(124);
				((ComparisonContext)_localctx).term = term();
				((ComparisonContext)_localctx).right.add(((ComparisonContext)_localctx).term);
				}
				}
				setState(129);
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

	public static class EqualityContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token EQUAL;
		public List<Token> op = new ArrayList<Token>();
		public Token NOT_EQUAL;
		public Token _tset546;
		public ComparisonContext comparison;
		public List<ComparisonContext> right = new ArrayList<ComparisonContext>();
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(HlefParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(HlefParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(HlefParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(HlefParser.NOT_EQUAL, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((EqualityContext)_localctx).left = comparison();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOT_EQUAL) {
				{
				{
				setState(131);
				((EqualityContext)_localctx)._tset546 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((EqualityContext)_localctx)._tset546 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((EqualityContext)_localctx).op.add(((EqualityContext)_localctx)._tset546);
				setState(132);
				((EqualityContext)_localctx).comparison = comparison();
				((EqualityContext)_localctx).right.add(((EqualityContext)_localctx).comparison);
				}
				}
				setState(137);
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

	public static class LogicAndContext extends ParserRuleContext {
		public EqualityContext left;
		public EqualityContext equality;
		public List<EqualityContext> right = new ArrayList<EqualityContext>();
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(HlefParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(HlefParser.AND, i);
		}
		public LogicAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitLogicAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitLogicAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAndContext logicAnd() throws RecognitionException {
		LogicAndContext _localctx = new LogicAndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((LogicAndContext)_localctx).left = equality();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(139);
				match(AND);
				setState(140);
				((LogicAndContext)_localctx).equality = equality();
				((LogicAndContext)_localctx).right.add(((LogicAndContext)_localctx).equality);
				}
				}
				setState(145);
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

	public static class LogicOrContext extends ParserRuleContext {
		public LogicAndContext left;
		public LogicAndContext logicAnd;
		public List<LogicAndContext> right = new ArrayList<LogicAndContext>();
		public List<LogicAndContext> logicAnd() {
			return getRuleContexts(LogicAndContext.class);
		}
		public LogicAndContext logicAnd(int i) {
			return getRuleContext(LogicAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(HlefParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(HlefParser.OR, i);
		}
		public LogicOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitLogicOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitLogicOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOrContext logicOr() throws RecognitionException {
		LogicOrContext _localctx = new LogicOrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((LogicOrContext)_localctx).left = logicAnd();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(147);
				match(OR);
				setState(148);
				((LogicOrContext)_localctx).logicAnd = logicAnd();
				((LogicOrContext)_localctx).right.add(((LogicOrContext)_localctx).logicAnd);
				}
				}
				setState(153);
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

	public static class ErrorHandlerContext extends ParserRuleContext {
		public LogicOrContext expression;
		public ExprContext handler;
		public LogicOrContext logicOr() {
			return getRuleContext(LogicOrContext.class,0);
		}
		public TerminalNode IF() { return getToken(HlefParser.IF, 0); }
		public TerminalNode ERROR() { return getToken(HlefParser.ERROR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ErrorHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterErrorHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitErrorHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitErrorHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorHandlerContext errorHandler() throws RecognitionException {
		ErrorHandlerContext _localctx = new ErrorHandlerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_errorHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((ErrorHandlerContext)_localctx).expression = logicOr();
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(155);
				match(IF);
				setState(156);
				match(ERROR);
				setState(157);
				((ErrorHandlerContext)_localctx).handler = expr();
				}
				break;
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

	public static class ArgumentsDeclContext extends ParserRuleContext {
		public List<ArgNameContext> argName() {
			return getRuleContexts(ArgNameContext.class);
		}
		public ArgNameContext argName(int i) {
			return getRuleContext(ArgNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HlefParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HlefParser.COMMA, i);
		}
		public ArgumentsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterArgumentsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitArgumentsDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitArgumentsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsDeclContext argumentsDecl() throws RecognitionException {
		ArgumentsDeclContext _localctx = new ArgumentsDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			argName();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				argName();
				}
				}
				setState(167);
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

	public static class DeclContext extends ParserRuleContext {
		public MacroUseNameContext name;
		public ExprContext body;
		public TerminalNode ASSIGN() { return getToken(HlefParser.ASSIGN, 0); }
		public MacroUseNameContext macroUseName() {
			return getRuleContext(MacroUseNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlefParser.LPAREN, 0); }
		public ArgumentsDeclContext argumentsDecl() {
			return getRuleContext(ArgumentsDeclContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlefParser.RPAREN, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((DeclContext)_localctx).name = macroUseName();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(169);
				match(LPAREN);
				setState(170);
				argumentsDecl();
				setState(171);
				match(RPAREN);
				}
			}

			setState(175);
			match(ASSIGN);
			setState(176);
			((DeclContext)_localctx).body = expr();
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

	public static class BlockContext extends ParserRuleContext {
		public DeclContext decl;
		public List<DeclContext> decls = new ArrayList<DeclContext>();
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					((BlockContext)_localctx).decl = decl();
					((BlockContext)_localctx).decls.add(((BlockContext)_localctx).decl);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(184);
			expr();
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

	public static class IfExprContext extends ParserRuleContext {
		public ExprContext cond;
		public BlockContext thenBlock;
		public ExprContext expr;
		public List<ExprContext> elifCond = new ArrayList<ExprContext>();
		public BlockContext block;
		public List<BlockContext> elifExpr = new ArrayList<BlockContext>();
		public BlockContext elseBlock;
		public TerminalNode IF() { return getToken(HlefParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HlefParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HlefParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HlefParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HlefParser.RPAREN, i);
		}
		public TerminalNode END() { return getToken(HlefParser.END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(HlefParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(HlefParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(HlefParser.ELSE, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IF);
			setState(187);
			match(LPAREN);
			setState(188);
			((IfExprContext)_localctx).cond = expr();
			setState(189);
			match(RPAREN);
			setState(190);
			((IfExprContext)_localctx).thenBlock = block();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(191);
				match(ELIF);
				setState(192);
				match(LPAREN);
				setState(193);
				((IfExprContext)_localctx).expr = expr();
				((IfExprContext)_localctx).elifCond.add(((IfExprContext)_localctx).expr);
				setState(194);
				match(RPAREN);
				setState(195);
				((IfExprContext)_localctx).block = block();
				((IfExprContext)_localctx).elifExpr.add(((IfExprContext)_localctx).block);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(202);
				match(ELSE);
				setState(203);
				((IfExprContext)_localctx).elseBlock = block();
				}
			}

			setState(206);
			match(END);
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

	public static class ExprContext extends ParserRuleContext {
		public ErrorHandlerContext errorHandler() {
			return getRuleContext(ErrorHandlerContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case EMPTY:
			case NOT:
			case CELL_ID:
			case ID:
			case NUMBER:
			case STRING:
			case SHEET_ID:
			case DOLLAR:
			case AT:
			case LPAREN:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				errorHandler();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				ifExpr();
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

	public static class FormulaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HlefParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlefListener ) ((HlefListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlefVisitor ) return ((HlefVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formula);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					decl();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(218);
			expr();
			setState(219);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\5"+
		"\bU\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\5\nd\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\f\7\fp\n\f\f\f\16\fs"+
		"\13\f\3\r\3\r\3\r\7\rx\n\r\f\r\16\r{\13\r\3\16\3\16\3\16\7\16\u0080\n"+
		"\16\f\16\16\16\u0083\13\16\3\17\3\17\3\17\7\17\u0088\n\17\f\17\16\17\u008b"+
		"\13\17\3\20\3\20\3\20\7\20\u0090\n\20\f\20\16\20\u0093\13\20\3\21\3\21"+
		"\3\21\7\21\u0098\n\21\f\21\16\21\u009b\13\21\3\22\3\22\3\22\3\22\5\22"+
		"\u00a1\n\22\3\23\3\23\3\23\7\23\u00a6\n\23\f\23\16\23\u00a9\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00b0\n\24\3\24\3\24\3\24\3\25\7\25\u00b6\n"+
		"\25\f\25\16\25\u00b9\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00c8\n\26\f\26\16\26\u00cb\13\26\3\26\3\26"+
		"\5\26\u00cf\n\26\3\26\3\26\3\27\3\27\5\27\u00d5\n\27\3\30\7\30\u00d8\n"+
		"\30\f\30\16\30\u00db\13\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\7\4\2\r\r\37\37\3\2 !\3\2\36\37\3\2\""+
		"%\3\2\34\35\2\u00e5\2\60\3\2\2\2\4\63\3\2\2\2\6\66\3\2\2\2\b:\3\2\2\2"+
		"\nA\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20V\3\2\2\2\22c\3\2\2\2\24j\3\2\2\2"+
		"\26l\3\2\2\2\30t\3\2\2\2\32|\3\2\2\2\34\u0084\3\2\2\2\36\u008c\3\2\2\2"+
		" \u0094\3\2\2\2\"\u009c\3\2\2\2$\u00a2\3\2\2\2&\u00aa\3\2\2\2(\u00b7\3"+
		"\2\2\2*\u00bc\3\2\2\2,\u00d4\3\2\2\2.\u00d9\3\2\2\2\60\61\7\26\2\2\61"+
		"\62\7\20\2\2\62\3\3\2\2\2\63\64\7\27\2\2\64\65\7\20\2\2\65\5\3\2\2\2\66"+
		"\67\5\2\2\2\67\7\3\2\2\289\7\23\2\29;\7\'\2\2:8\3\2\2\2:;\3\2\2\2;<\3"+
		"\2\2\2<?\7\17\2\2=>\7\30\2\2>@\7\17\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2"+
		"AB\7\31\2\2BC\5,\27\2CD\7\32\2\2D\13\3\2\2\2EN\7\b\2\2FN\7\t\2\2GN\7\21"+
		"\2\2HN\7\22\2\2IN\5\b\5\2JN\5\n\6\2KN\5\6\4\2LN\7\n\2\2ME\3\2\2\2MF\3"+
		"\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\r"+
		"\3\2\2\2OT\5\4\3\2PQ\7\31\2\2QR\5\22\n\2RS\7\32\2\2SU\3\2\2\2TP\3\2\2"+
		"\2TU\3\2\2\2U\17\3\2\2\2VW\7\20\2\2WX\7\31\2\2XY\5\22\n\2YZ\7\32\2\2Z"+
		"\21\3\2\2\2[`\5,\27\2\\]\7&\2\2]_\5,\27\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2d\23\3\2\2\2ef\t\2"+
		"\2\2fk\5\24\13\2gk\5\20\t\2hk\5\f\7\2ik\5\16\b\2je\3\2\2\2jg\3\2\2\2j"+
		"h\3\2\2\2ji\3\2\2\2k\25\3\2\2\2lq\5\24\13\2mn\t\3\2\2np\5\24\13\2om\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\27\3\2\2\2sq\3\2\2\2ty\5\26\f\2"+
		"uv\t\4\2\2vx\5\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\31\3\2"+
		"\2\2{y\3\2\2\2|\u0081\5\30\r\2}~\t\5\2\2~\u0080\5\30\r\2\177}\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\33\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\32\16\2\u0085\u0086\t\6\2\2\u0086"+
		"\u0088\5\32\16\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\35\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u0091\5\34\17\2\u008d\u008e\7\13\2\2\u008e\u0090\5\34\17\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\37\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\5\36\20\2\u0095\u0096\7\f"+
		"\2\2\u0096\u0098\5\36\20\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a!\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u00a0\5 \21\2\u009d\u009e\7\3\2\2\u009e\u009f\7\16\2\2\u009f\u00a1"+
		"\5,\27\2\u00a0\u009d\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1#\3\2\2\2\u00a2"+
		"\u00a7\5\2\2\2\u00a3\u00a4\7&\2\2\u00a4\u00a6\5\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"%\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af\5\4\3\2\u00ab\u00ac\7\31\2\2"+
		"\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\32\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\33\2\2"+
		"\u00b2\u00b3\5,\27\2\u00b3\'\3\2\2\2\u00b4\u00b6\5&\24\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5,\27\2\u00bb)\3\2\2\2"+
		"\u00bc\u00bd\7\3\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0"+
		"\7\32\2\2\u00c0\u00c9\5(\25\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\7\31\2\2"+
		"\u00c3\u00c4\5,\27\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6\5(\25\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\6"+
		"\2\2\u00cd\u00cf\5(\25\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\7\5\2\2\u00d1+\3\2\2\2\u00d2\u00d5\5\"\22\2"+
		"\u00d3\u00d5\5*\26\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5-\3"+
		"\2\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00dd\5,\27\2\u00dd\u00de\7\2\2\3\u00de/\3\2\2\2\27:?MT`cj"+
		"qy\u0081\u0089\u0091\u0099\u00a0\u00a7\u00af\u00b7\u00c9\u00ce\u00d4\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
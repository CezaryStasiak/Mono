// Generated from Plecak.g by ANTLR 4.8

package mono2backpack;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import mono2backpack.KnapsackItem;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlecakParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TEXT=15, INT=16, WHITESPACE=17;
	public static final int
		RULE_parseData = 0, RULE_getBackpackSize = 1, RULE_getItems = 2, RULE_getValues = 3, 
		RULE_jakJest = 4, RULE_zestaw = 5, RULE_item = 6, RULE_valParen = 7, RULE_val = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseData", "getBackpackSize", "getItems", "getValues", "jakJest", "zestaw", 
			"item", "valParen", "val"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Przedmioty:'", "'Warto\u015Bci:'", "'Plecak:'", "'.'", "','", 
			"'warto\u015B\u0107('", "') = '", "'je\u015Bli'", "'inaczej'", "'jest('", 
			"'lub'", "')'", "'i '", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TEXT", "INT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Plecak.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	HashMap items = new HashMap();
	int backpackSize;

	public PlecakParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseDataContext extends ParserRuleContext {
		public GetBackpackSizeContext n;
		public GetItemsContext getItems() {
			return getRuleContext(GetItemsContext.class,0);
		}
		public GetValuesContext getValues() {
			return getRuleContext(GetValuesContext.class,0);
		}
		public GetBackpackSizeContext getBackpackSize() {
			return getRuleContext(GetBackpackSizeContext.class,0);
		}
		public ParseDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterParseData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitParseData(this);
		}
	}

	public final ParseDataContext parseData() throws RecognitionException {
		ParseDataContext _localctx = new ParseDataContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			getItems();
			setState(20);
			match(T__1);
			setState(21);
			getValues();
			setState(22);
			match(T__2);
			setState(23);
			((ParseDataContext)_localctx).n = getBackpackSize();
			 backpackSize = ((ParseDataContext)_localctx).n.value; 
			setState(25);
			match(T__3);
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

	public static class GetBackpackSizeContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public TerminalNode INT() { return getToken(PlecakParser.INT, 0); }
		public GetBackpackSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBackpackSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterGetBackpackSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitGetBackpackSize(this);
		}
	}

	public final GetBackpackSizeContext getBackpackSize() throws RecognitionException {
		GetBackpackSizeContext _localctx = new GetBackpackSizeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_getBackpackSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((GetBackpackSizeContext)_localctx).INT = match(INT);
			 ((GetBackpackSizeContext)_localctx).value =  Integer.parseInt((((GetBackpackSizeContext)_localctx).INT!=null?((GetBackpackSizeContext)_localctx).INT.getText():null)); 
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

	public static class GetItemsContext extends ParserRuleContext {
		public ItemContext i;
		public ValParenContext v;
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<ValParenContext> valParen() {
			return getRuleContexts(ValParenContext.class);
		}
		public ValParenContext valParen(int i) {
			return getRuleContext(ValParenContext.class,i);
		}
		public GetItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterGetItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitGetItems(this);
		}
	}

	public final GetItemsContext getItems() throws RecognitionException {
		GetItemsContext _localctx = new GetItemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_getItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				((GetItemsContext)_localctx).i = item();
				setState(31);
				((GetItemsContext)_localctx).v = valParen();
				 items.put(((GetItemsContext)_localctx).i.value, new KnapsackItem(((GetItemsContext)_localctx).i.value, ((GetItemsContext)_localctx).v.value)); 
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(33);
					match(T__4);
					setState(34);
					((GetItemsContext)_localctx).i = item();
					setState(35);
					((GetItemsContext)_localctx).v = valParen();
					 items.put(((GetItemsContext)_localctx).i.value, new KnapsackItem(((GetItemsContext)_localctx).i.value, ((GetItemsContext)_localctx).v.value)); 
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(47);
			match(T__3);
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

	public static class GetValuesContext extends ParserRuleContext {
		public ItemContext i;
		public ValContext v;
		public JakJestContext j1;
		public ValContext o;
		public JakJestContext j2;
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<JakJestContext> jakJest() {
			return getRuleContexts(JakJestContext.class);
		}
		public JakJestContext jakJest(int i) {
			return getRuleContext(JakJestContext.class,i);
		}
		public GetValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterGetValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitGetValues(this);
		}
	}

	public final GetValuesContext getValues() throws RecognitionException {
		GetValuesContext _localctx = new GetValuesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_getValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				match(T__5);
				setState(50);
				((GetValuesContext)_localctx).i = item();
				setState(51);
				match(T__6);
				setState(52);
				((GetValuesContext)_localctx).v = val();
				 KnapsackItem kItem1 = (KnapsackItem)items.get(((GetValuesContext)_localctx).i.value); kItem1.baseVal=((GetValuesContext)_localctx).v.value; 
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(54);
					match(T__7);
					setState(55);
					((GetValuesContext)_localctx).j1 = jakJest();
					setState(56);
					match(T__8);
					setState(57);
					((GetValuesContext)_localctx).o = val();
					 KnapsackItem kItem2 = (KnapsackItem)items.get(((GetValuesContext)_localctx).i.value); kItem2.newValReqItems=(((GetValuesContext)_localctx).j1.list); kItem2.newVal=((GetValuesContext)_localctx).v.value; kItem2.baseVal=((GetValuesContext)_localctx).o.value; 
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(65);
					match(T__4);
					setState(66);
					match(T__5);
					setState(67);
					((GetValuesContext)_localctx).i = item();
					setState(68);
					match(T__6);
					setState(69);
					((GetValuesContext)_localctx).v = val();
					 KnapsackItem kItem3 = (KnapsackItem)items.get(((GetValuesContext)_localctx).i.value); kItem3.baseVal=((GetValuesContext)_localctx).v.value; 
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(71);
						match(T__7);
						setState(72);
						((GetValuesContext)_localctx).j2 = jakJest();
						setState(73);
						match(T__8);
						setState(74);
						((GetValuesContext)_localctx).o = val();
						 KnapsackItem kItem4 = (KnapsackItem)items.get(((GetValuesContext)_localctx).i.value); kItem4.newValReqItems=(((GetValuesContext)_localctx).j2.list); kItem4.newVal=((GetValuesContext)_localctx).v.value; kItem4.baseVal=((GetValuesContext)_localctx).o.value; 
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(T__3);
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	public static class JakJestContext extends ParserRuleContext {
		public LinkedList<LinkedList<String>> list;
		public ZestawContext z;
		public ZestawContext x;
		public List<ZestawContext> zestaw() {
			return getRuleContexts(ZestawContext.class);
		}
		public ZestawContext zestaw(int i) {
			return getRuleContext(ZestawContext.class,i);
		}
		public JakJestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jakJest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterJakJest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitJakJest(this);
		}
	}

	public final JakJestContext jakJest() throws RecognitionException {
		JakJestContext _localctx = new JakJestContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jakJest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((JakJestContext)_localctx).list =  new LinkedList<LinkedList<String>>();
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				match(T__9);
				setState(95);
				((JakJestContext)_localctx).z = zestaw();
				_localctx.list.add(((JakJestContext)_localctx).z.list);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(97);
					match(T__10);
					setState(98);
					((JakJestContext)_localctx).x = zestaw();
					_localctx.list.add(((JakJestContext)_localctx).x.list);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__11);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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

	public static class ZestawContext extends ParserRuleContext {
		public LinkedList<String> list;
		public ItemContext i1;
		public ItemContext i2;
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ZestawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zestaw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterZestaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitZestaw(this);
		}
	}

	public final ZestawContext zestaw() throws RecognitionException {
		ZestawContext _localctx = new ZestawContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_zestaw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ZestawContext)_localctx).list =  new LinkedList<String>(); 
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				((ZestawContext)_localctx).i1 = item();
				_localctx.list.add(((ZestawContext)_localctx).i1.value);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(120);
				match(T__12);
				setState(121);
				((ZestawContext)_localctx).i2 = item();
				_localctx.list.add(((ZestawContext)_localctx).i2.value);
				}
				}
				setState(128);
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

	public static class ItemContext extends ParserRuleContext {
		public String value;
		public Token TEXT;
		public TerminalNode TEXT() { return getToken(PlecakParser.TEXT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((ItemContext)_localctx).TEXT = match(TEXT);
			 ((ItemContext)_localctx).value =  (((ItemContext)_localctx).TEXT!=null?((ItemContext)_localctx).TEXT.getText():null); 
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

	public static class ValParenContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public TerminalNode INT() { return getToken(PlecakParser.INT, 0); }
		public ValParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterValParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitValParen(this);
		}
	}

	public final ValParenContext valParen() throws RecognitionException {
		ValParenContext _localctx = new ValParenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__13);
			setState(133);
			((ValParenContext)_localctx).INT = match(INT);
			 ((ValParenContext)_localctx).value =  Integer.parseInt((((ValParenContext)_localctx).INT!=null?((ValParenContext)_localctx).INT.getText():null)); 
			setState(135);
			match(T__11);
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

	public static class ValContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public TerminalNode INT() { return getToken(PlecakParser.INT, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlecakListener ) ((PlecakListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((ValContext)_localctx).INT = match(INT);
			 ((ValContext)_localctx).value =  Integer.parseInt((((ValContext)_localctx).INT!=null?((ValContext)_localctx).INT.getText():null)); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4)\n\4\f\4\16\4,\13\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\7\5U\n\5\f\5"+
		"\16\5X\13\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\6\6o\n\6\r\6\16\6p\3\7\3\7\3\7\3\7"+
		"\6\7w\n\7\r\7\16\7x\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\2\2\u008f\2\24\3\2\2\2\4\35\3\2\2\2\6-\3\2\2\2\b[\3\2\2\2\n_\3\2"+
		"\2\2\fr\3\2\2\2\16\u0083\3\2\2\2\20\u0086\3\2\2\2\22\u008b\3\2\2\2\24"+
		"\25\7\3\2\2\25\26\5\6\4\2\26\27\7\4\2\2\27\30\5\b\5\2\30\31\7\5\2\2\31"+
		"\32\5\4\3\2\32\33\b\2\1\2\33\34\7\6\2\2\34\3\3\2\2\2\35\36\7\22\2\2\36"+
		"\37\b\3\1\2\37\5\3\2\2\2 !\5\16\b\2!\"\5\20\t\2\"*\b\4\1\2#$\7\7\2\2$"+
		"%\5\16\b\2%&\5\20\t\2&\'\b\4\1\2\')\3\2\2\2(#\3\2\2\2),\3\2\2\2*(\3\2"+
		"\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2- \3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\7\6\2\2\62\7\3\2\2\2\63\64\7\b\2\2\64\65\5"+
		"\16\b\2\65\66\7\t\2\2\66\67\5\22\n\2\67@\b\5\1\289\7\n\2\29:\5\n\6\2:"+
		";\7\13\2\2;<\5\22\n\2<=\b\5\1\2=?\3\2\2\2>8\3\2\2\2?B\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AV\3\2\2\2B@\3\2\2\2CD\7\7\2\2DE\7\b\2\2EF\5\16\b\2FG\7\t"+
		"\2\2GH\5\22\n\2HQ\b\5\1\2IJ\7\n\2\2JK\5\n\6\2KL\7\13\2\2LM\5\22\n\2MN"+
		"\b\5\1\2NP\3\2\2\2OI\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2S"+
		"Q\3\2\2\2TC\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2"+
		"YZ\7\6\2\2Z\\\3\2\2\2[\63\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3"+
		"\2\2\2_n\b\6\1\2`a\7\f\2\2ab\5\f\7\2bi\b\6\1\2cd\7\r\2\2de\5\f\7\2ef\b"+
		"\6\1\2fh\3\2\2\2gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3"+
		"\2\2\2lm\7\16\2\2mo\3\2\2\2n`\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\13"+
		"\3\2\2\2rv\b\7\1\2st\5\16\b\2tu\b\7\1\2uw\3\2\2\2vs\3\2\2\2wx\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y\u0080\3\2\2\2z{\7\17\2\2{|\5\16\b\2|}\b\7\1\2}\177"+
		"\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\r\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\21\2\2\u0084\u0085"+
		"\b\b\1\2\u0085\17\3\2\2\2\u0086\u0087\7\20\2\2\u0087\u0088\7\22\2\2\u0088"+
		"\u0089\b\t\1\2\u0089\u008a\7\16\2\2\u008a\21\3\2\2\2\u008b\u008c\7\22"+
		"\2\2\u008c\u008d\b\n\1\2\u008d\23\3\2\2\2\f*/@QV]ipx\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
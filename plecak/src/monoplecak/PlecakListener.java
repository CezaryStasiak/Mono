// Generated from Plecak.g by ANTLR 4.8

package monoplecak;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import monoplecak.Przedmiot;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlecakParser}.
 */
public interface PlecakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlecakParser#parseData}.
	 * @param ctx the parse tree
	 */
	void enterParseData(PlecakParser.ParseDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#parseData}.
	 * @param ctx the parse tree
	 */
	void exitParseData(PlecakParser.ParseDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#getBackpackSize}.
	 * @param ctx the parse tree
	 */
	void enterGetBackpackSize(PlecakParser.GetBackpackSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#getBackpackSize}.
	 * @param ctx the parse tree
	 */
	void exitGetBackpackSize(PlecakParser.GetBackpackSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#getItems}.
	 * @param ctx the parse tree
	 */
	void enterGetItems(PlecakParser.GetItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#getItems}.
	 * @param ctx the parse tree
	 */
	void exitGetItems(PlecakParser.GetItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#getValues}.
	 * @param ctx the parse tree
	 */
	void enterGetValues(PlecakParser.GetValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#getValues}.
	 * @param ctx the parse tree
	 */
	void exitGetValues(PlecakParser.GetValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#jakJest}.
	 * @param ctx the parse tree
	 */
	void enterJakJest(PlecakParser.JakJestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#jakJest}.
	 * @param ctx the parse tree
	 */
	void exitJakJest(PlecakParser.JakJestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#zestaw}.
	 * @param ctx the parse tree
	 */
	void enterZestaw(PlecakParser.ZestawContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#zestaw}.
	 * @param ctx the parse tree
	 */
	void exitZestaw(PlecakParser.ZestawContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(PlecakParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(PlecakParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#valParen}.
	 * @param ctx the parse tree
	 */
	void enterValParen(PlecakParser.ValParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#valParen}.
	 * @param ctx the parse tree
	 */
	void exitValParen(PlecakParser.ValParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlecakParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(PlecakParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlecakParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(PlecakParser.ValContext ctx);
}
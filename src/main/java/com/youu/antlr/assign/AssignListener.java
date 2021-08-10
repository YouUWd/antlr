// Generated from /Users/dengyouyou/study/antlr/src/main/resources/Assign.g4 by ANTLR 4.9
package com.youu.antlr.assign;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssignParser}.
 */
public interface AssignListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssignParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(AssignParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(AssignParser.AsContext ctx);
}
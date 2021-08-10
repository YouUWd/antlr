// Generated from /Users/dengyouyou/study/antlr/src/main/resources/Assign.g4 by ANTLR 4.9
package com.youu.antlr.assign;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssignParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssignVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssignParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(AssignParser.AsContext ctx);
}
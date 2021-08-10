// Generated from /Users/dengyouyou/study/antlr/src/main/resources/HBaseSQL.g4 by ANTLR 4.9
package com.youu.antlr.hbase;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HBaseSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HBaseSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(HBaseSQLParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#selectSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSql(HBaseSQLParser.SelectSqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#deleteSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSql(HBaseSQLParser.DeleteSqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(HBaseSQLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(HBaseSQLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link HBaseSQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(HBaseSQLParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link HBaseSQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(HBaseSQLParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(HBaseSQLParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(HBaseSQLParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(HBaseSQLParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(HBaseSQLParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(HBaseSQLParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HBaseSQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(HBaseSQLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HBaseSQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HBaseSQLParser#nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNl(HBaseSQLParser.NlContext ctx);
}
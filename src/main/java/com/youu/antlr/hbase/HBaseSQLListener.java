// Generated from /Users/dengyouyou/study/antlr/src/main/resources/HBaseSQL.g4 by ANTLR 4.9
package com.youu.antlr.hbase;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HBaseSQLParser}.
 */
public interface HBaseSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(HBaseSQLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(HBaseSQLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#selectSql}.
	 * @param ctx the parse tree
	 */
	void enterSelectSql(HBaseSQLParser.SelectSqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#selectSql}.
	 * @param ctx the parse tree
	 */
	void exitSelectSql(HBaseSQLParser.SelectSqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#deleteSql}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSql(HBaseSQLParser.DeleteSqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#deleteSql}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSql(HBaseSQLParser.DeleteSqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(HBaseSQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(HBaseSQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(HBaseSQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(HBaseSQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link HBaseSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(HBaseSQLParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link HBaseSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(HBaseSQLParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link HBaseSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(HBaseSQLParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link HBaseSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(HBaseSQLParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(HBaseSQLParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(HBaseSQLParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(HBaseSQLParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(HBaseSQLParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(HBaseSQLParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(HBaseSQLParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(HBaseSQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(HBaseSQLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(HBaseSQLParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(HBaseSQLParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HBaseSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HBaseSQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(HBaseSQLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(HBaseSQLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HBaseSQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HBaseSQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HBaseSQLParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(HBaseSQLParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HBaseSQLParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(HBaseSQLParser.NlContext ctx);
}
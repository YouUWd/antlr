package com.youu.antlr.hbase;

import com.youu.antlr.hbase.HBaseSQLParser.ColContext;
import com.youu.antlr.hbase.HBaseSQLParser.SelectSqlContext;
import com.youu.antlr.hbase.HBaseSQLParser.TableContext;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2020/12/30 7:30 下午
 */
public class HBaseSqlTreeListener extends HBaseSQLBaseListener {

    @Override
    public void enterSelectSql(SelectSqlContext ctx) {
        System.out.println(ctx.select().getText());
    }

    @Override
    public void enterCol(ColContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void enterTable(TableContext ctx) {
        System.out.println(ctx.getText());
    }
}

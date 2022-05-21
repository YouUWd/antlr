package com.youu.antlr.hbase;

import com.youu.antlr.hbase.HBaseSQLParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2021/1/4 8:15 下午
 */
public class AstBuilder extends HBaseSQLBaseVisitor<Node> {
    @Override
    public SelectSql visitSelectSql(SelectSqlContext ctx) {
        Column column = visit(ctx.column());
        Schema schema = visitSchema(ctx.schema());
        Table table = visitTable(ctx.table());
        return new SelectSql(column, schema == null ? null : schema.getSchema(), table.getTable());
    }

    @Override
    public Node visitSelectAll(SelectAllContext ctx) {
        return super.visitSelectAll(ctx);
    }

    @Override
    public Column visitSelectSingle(SelectSingleContext ctx) {
        List<Col> cols = visit(ctx.col(), Col.class);
        return Column.builder().column(cols).build();
    }

    public Column visit(ColumnContext columnContext) {
        Node accept = columnContext.accept(this);
        if (accept instanceof Column) {
            return (Column) accept;
        } else {
            return new Column(new ArrayList<>());
        }
    }

    @Override
    public Col visitCol(ColContext ctx) {
        List<TerminalNode> table_column = ctx.STRING();
        return Col.builder().table(table_column.get(0).getText()).col(table_column.get(1).getText()).build();
    }

    @Override
    public Schema visitSchema(SchemaContext ctx) {
        if (ctx == null) {
            return null;
        }
        return Schema.builder().schema(ctx.getText()).build();
    }

    @Override
    public Table visitTable(TableContext ctx) {
        return Table.builder().table(ctx.getText()).build();
    }

    private <T> List<T> visit(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        return contexts.stream()
                .map(this::visit)
                .map(clazz::cast)
                .collect(toList());
    }
}

package com.youu.antlr.calc;

import java.util.HashMap;
import java.util.Map;

public class AstBuilder extends CalcBaseVisitor {

    public Map<String, Double> vars = new HashMap<>();

    // stmt : ID '=' expr NEWLINE ;
    @Override
    public Double visitAssign(CalcParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        System.out.println(id + "=" + ctx.expr().getText());
        Double val = (Double) visit(ctx.expr());
        vars.put(id, val);
        return val;
    }

    // stmt : expr NEWLINE ;
    @Override
    public Double visitPrintExpr(CalcParser.PrintExprContext ctx) {
        Double value = (Double) visit(ctx.expr());
        System.out.println(value + " [P]");
        return .0;
    }

    // expr : INT ;
    @Override
    public Double visitLiteral(CalcParser.LiteralContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    // expr : ID ;
    @Override
    public Double visitId(CalcParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (vars.containsKey(id)) {
            return vars.get(id);
        }
        return .0;
    }

    // expr : expr op=('*'|'/') expr ;
    @Override
    public Double visitMulDiv(CalcParser.MulDivContext ctx) {
        double lhs = (double) visit(ctx.expr(0));
        double rhs = (double) visit(ctx.expr(1));
        if (ctx.op.getType() == CalcParser.MUL) {
            System.out.print(ctx.expr(0).getText() + "*" + ctx.expr(1).getText() + "=");
            return lhs * rhs;
        }
        System.out.print(ctx.expr(0).getText() + "/" + ctx.expr(1).getText() + "=");
        return lhs / rhs;
    }

    // expr : expr op=('+'|'-') expr ;
    @Override
    public Double visitAddSub(CalcParser.AddSubContext ctx) {
        double lhs = (double) visit(ctx.expr(0));
        double rhs = (double) visit(ctx.expr(1));
        if (ctx.op.getType() == CalcParser.ADD) {
            System.out.print(ctx.expr(0).getText() + "+" + ctx.expr(1).getText() + "=");
            return lhs + rhs;
        }
        System.out.print(ctx.expr(0).getText() + "-" + ctx.expr(1).getText() + "=");
        return lhs - rhs;
    }

    // expr : '(' expr ')' ;
    @Override
    public Double visitParen(CalcParser.ParenContext ctx) {
        return (double) visit(ctx.expr());
    }


}

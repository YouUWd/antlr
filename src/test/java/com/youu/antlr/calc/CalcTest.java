package com.youu.antlr.calc;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void visitPrintExpr() {

        //String hello = "(1+2)*3+2*2 \n\r";
        //ANTLRInputStream input = new ANTLRInputStream(hello);

        StringBuilder builder = new StringBuilder();
        builder.append("a=1").append("\n");
        builder.append("a=a+2").append("\n");
        builder.append("a*2").append("\n");
        builder.append("b=2").append("\n");
        builder.append("a+b").append("\n");
        CharStream input = CharStreams.fromString(builder.toString());

        CalcLexer lexer = new CalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParseTree tree = parser.calc();                      // 生成语法树
        AstBuilder av = new AstBuilder();
        av.visit(tree);
    }
}
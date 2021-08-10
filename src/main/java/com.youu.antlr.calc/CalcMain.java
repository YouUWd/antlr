package com.youu.antlr.calc;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author ShuGuang  2018/11/20  11:27 AM
 * @desc
 * @since 2.0.0
 */
public class CalcMain {
    public static void main(String[] args) throws IOException {
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
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);

        //System.out.println(Arrays.toString(parser.tokenNames));

        //CalcParser.CalcContext calcContext = parser.calc();
        //System.out.println(calcContext);
        //System.out.println(calcContext.stmt());
        //for (CalcParser.StmtContext st : calcContext.stmt()) {
        //    System.out.println(st.getClass());
        //}
    }
}

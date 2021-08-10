package com.youu.antlr.assign;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author ShuGuang  2018/12/4  2:29 PM
 * @desc
 * @since 2.0.0
 */
public class AssignMain {

    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("a=1");

        AssignLexer lexer = new AssignLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AssignParser parser = new AssignParser(tokens);

        AssignParser.AsContext as = parser.as();

        //System.out.println(as.ID());
        //System.out.println(as.VAL());
        //
        //System.out.println(as.toStringTree(parser));

        AssignVisitor av = new AssignBaseVisitor();
        av.visitAs(as);

    }
}

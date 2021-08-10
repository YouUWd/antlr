package com.youu.antlr.rows;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author ShuGuang  2019/2/18  2:51 PM
 * @desc
 * @since 2.0.0
 */
public class Col {
    public static void main(String[] args) throws Exception {
        //ANTLRInputStream input = new ANTLRInputStream(System.in);

        CharStream input = CharStreams.fromString("a\tb\t\nc\td\n");

        RowsLexer lexer = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        int col = Integer.valueOf(1);
        RowsParser parser = new RowsParser(tokens, col); // pass column number!
        parser.setBuildParseTree(false); // don't waste time bulding a tree
        parser.file(); // parse
    }
}

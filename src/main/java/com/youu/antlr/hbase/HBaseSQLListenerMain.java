package com.youu.antlr.hbase;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2020/12/30 7:28 下午
 */
public class HBaseSQLListenerMain {
    public static void main(String[] args) {
        String sql = "SELECT info.user,info.email FROM users";

        CharStream stream = CharStreams.fromString(sql);
        HBaseSQLLexer lexer = new HBaseSQLLexer(stream);
        CommonTokenStream token = new CommonTokenStream(lexer);

        HBaseSQLParser parser = new HBaseSQLParser(token);
        // 开始解析语句，并产生一棵树
        HBaseSQLParser.StatContext tree = parser.stat();
        ParseTreeWalker walker = new ParseTreeWalker();
        // 解析树时的监听器
        HBaseSqlTreeListener listener = new HBaseSqlTreeListener();
        walker.walk(listener, tree);

    }
}

package com.youu.antlr.hbase;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

class HBaseSQLTest {

    @Test
    public void visitSelectSql() {
        String sql = "SELECT info.user,info.email FROM db.users";

        CharStream stream = CharStreams.fromString(sql);
        HBaseSQLLexer lexer = new HBaseSQLLexer(stream);
        CommonTokenStream token = new CommonTokenStream(lexer);

        HBaseSQLParser parser = new HBaseSQLParser(token);
        // 开始解析语句，并产生一棵树
        HBaseSQLParser.StatContext tree = parser.stat();

        AstBuilder av = new AstBuilder();
        final Node visit = av.visit(tree);
        System.out.println(visit);
    }
}
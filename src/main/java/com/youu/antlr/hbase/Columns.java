package com.youu.antlr.hbase;

import java.util.List;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2021/1/4 8:41 下午
 */

public class Columns extends Node {
    List<Col> column;

    public Columns(List<Col> column) {
        this.column = column;
    }
}

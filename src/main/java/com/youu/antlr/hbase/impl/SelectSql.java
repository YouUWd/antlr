package com.youu.antlr.hbase.impl;

import lombok.Builder;
import lombok.Data;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2021/1/4 8:20 下午
 */
@Data
@Builder
public class SelectSql extends Node {
    private Column column;
    private String schema;
    private String table;

}

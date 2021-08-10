package com.youu.antlr.hbase.impl;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2021/1/4 8:41 下午
 */

@Builder
@Data
public class Column extends Node {
    List<Col> column;

}

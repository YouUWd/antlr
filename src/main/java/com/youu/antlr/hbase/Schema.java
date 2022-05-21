package com.youu.antlr.hbase;

import lombok.Builder;
import lombok.Data;

/**
 * @Author ShuGuang
 * @Description
 * @Date 2021/1/4 8:41 下午
 */

@Builder
@Data
public class Schema extends Node {
    String schema;
}

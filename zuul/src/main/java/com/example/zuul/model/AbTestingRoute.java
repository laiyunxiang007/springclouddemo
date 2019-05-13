package com.example.zuul.model;

import lombok.Data;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/9
 */
@Data
public class AbTestingRoute {
    String serviceName;
    String active;
    String endpoint;
    Integer weight;
}

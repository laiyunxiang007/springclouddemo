package com.example.client;

import feign.Request;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/8
 */
//@Configuration
public class FooConfiguration {
    public static final int CONNECT_TIMEOUT_MILLIS = 5000;
    public static final int READ_TIMEOUT_MILLIS = 5000;


    //    @Bean
    public Request.Options options() {
        return new Request.Options(CONNECT_TIMEOUT_MILLIS, READ_TIMEOUT_MILLIS);
    }
}

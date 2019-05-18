package com.example.client.hytrix;

import com.example.client.test;
import org.springframework.stereotype.Component;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/18
 */
@Component
public class testImpl implements test {
    @Override
    public String getProviderB() {
        return "调用getProviderB()失败";
    }
}

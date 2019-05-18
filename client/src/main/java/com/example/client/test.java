package com.example.client;

import com.example.client.hytrix.testImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/8
 */
@FeignClient(value = "eureka-providertwo", fallback = testImpl.class)
public interface test {
    @GetMapping("/getgardenTest")
    String getProviderB();
}

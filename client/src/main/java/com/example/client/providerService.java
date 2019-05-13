package com.example.client;

import com.example.client.hytrix.providerServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/12
 */
@FeignClient(value = "eureka-server",fallback = providerServiceHystrix.class)
public interface providerService {

    @GetMapping("/getgarden/{id}")
    String getProvider(@PathVariable("id") Integer id);

}

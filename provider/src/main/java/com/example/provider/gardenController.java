package com.example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/12
 */
@RestController
@RefreshScope
public class gardenController {
    @Value("${hello}")
    String hello;

    @Autowired
  private   gardenSerivce gardenSerivce;


    @GetMapping("/getgarden/{id}")
    public Map<String, Object> getgarden(@PathVariable("id") String id) throws InterruptedException {
        return gardenSerivce.getGarden(Integer.valueOf(id));
    }

    @GetMapping("/hi")
    public String gethello() throws InterruptedException {
        Thread.sleep(2000);
        return hello;
    }
}

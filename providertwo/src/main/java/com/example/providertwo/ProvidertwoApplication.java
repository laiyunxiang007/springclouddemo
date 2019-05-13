package com.example.providertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProvidertwoApplication {
    @GetMapping("/getgardenTest")
    public String gethello() throws InterruptedException {
        Thread.sleep(2000);
        return "/getgardenTest";
    }
    public static void main(String[] args) {
        SpringApplication.run(ProvidertwoApplication.class, args);
    }

}

package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
@EnableHystrix
@EnableCircuitBreaker
@EnableResourceServer
public class ClientApplication {



    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Autowired
    providerService providerService;
    @Autowired
    test t;



    @GetMapping("/getProvider/{id}")
    public String getProviderA(@PathVariable("id") Integer id, HttpServletRequest request) throws InterruptedException {

        return providerService.getProvider(id);
    }

    @GetMapping("/getProviderB")
    public String getProviderB() {
        return t.getProviderB();
    }

}

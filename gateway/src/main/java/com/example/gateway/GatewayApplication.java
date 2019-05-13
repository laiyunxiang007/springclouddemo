package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GatewayApplication {
    @RestController
    @RequestMapping("/fallback")
    public class FallbackController {

        @RequestMapping("")
        public String fallback(){
            return "error";
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}

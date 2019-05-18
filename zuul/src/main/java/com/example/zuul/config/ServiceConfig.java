package com.example.zuul.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {

    public String getJwtSigningKey() {
        return "1";
    }

}

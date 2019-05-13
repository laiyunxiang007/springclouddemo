package com.example.zuul;

import com.example.zuul.utils.UserContextInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
@EnableEurekaClient
@EnableResourceServer
public class ZuulApplication {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        List interceptors = restTemplate.getInterceptors();
        if (interceptors == null) {
            restTemplate.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
        } else {
            interceptors.add(new UserContextInterceptor());
            restTemplate.setInterceptors(interceptors);
        }
        return restTemplate;
    }
//    @Bean
//public Filter userContextFilter() {
//    UserContextFilter userContextFilter = new UserContextFilter();
//    return userContextFilter;
//}

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}

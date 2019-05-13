package com.example.clientribbon;

import com.example.clientribbon.Util.UserContext;
import com.example.clientribbon.Util.UserContextHolder;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/7
 */
@Service
public class OrganzitionRestTemplateClient {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "buildFallbackLicenseList",
            threadPoolKey = "Test",
            threadPoolProperties = {
             @HystrixProperty(name = "coreSize",value = "30"),
             @HystrixProperty(name = "maxQueueSize",value = "10")
            },
            commandProperties =
            {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "6000"),
             @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),
             @HystrixProperty( name="circuitBreaker.errorThresholdPercentage",value="75"),
             @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="7000"),
             @HystrixProperty(name="metrics.rollingStats.timeInMilliseconds", value="15000"),
             @HystrixProperty(name="metrics.rollingStats.numBuckets", value="5")}
            )
    public String getOrganzition(String id){
       String test= restTemplate.getForObject("http://eureka-server/getgarden/{id}",String.class,id);
        System.out.println("service=="+UserContextHolder.getContext().getCorrelationId());
        return test;
    }
    private String buildFallbackLicenseList(String organizationId) {
        return "error";
    }
}

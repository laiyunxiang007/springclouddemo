package com.example.client.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @Author bee
 * @Description
 * @Date 2019/5/411:23
 * @Version 1.0
 **/
public class UserContextInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        HttpHeaders headers = request.getHeaders();
        headers.add(UserContext.CORRELATION_ID, UserContext.getCorrelationId());
        headers.add(UserContext.AUTH_TOKEN, UserContext.getAuthToken());
        return execution.execute(request, body);
    }
}

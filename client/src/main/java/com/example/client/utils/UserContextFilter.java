package com.example.client.utils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author bee
 * @Description
 * @Date 2019/5/411:21
 * @Version 1.0
 **/
//@Component
public class UserContextFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String correlationId = httpServletRequest.getHeader(UserContext.CORRELATION_ID);
        String userId = httpServletRequest.getHeader(UserContext.USER_ID);
        String authToken = httpServletRequest.getHeader(UserContext.AUTH_TOKEN);
        String orgId = httpServletRequest.getHeader(UserContext.ORG_ID);

        UserContext.setCorrelationId(correlationId);
        UserContext.setUserId(userId);
        UserContext.setAuthToken(authToken);
        UserContext.setOrgId(orgId);

        filterChain.doFilter(httpServletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}

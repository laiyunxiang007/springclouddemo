package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/9
 */
//@Component
public class ResponseFilter extends ZuulFilter {
    private static final int FILTER_ORDER = 1;
    private static final boolean SHOULD_FILTER = true;
    @Autowired
    FilterUtils filterUtils;

    @Override
    public String filterType() {
        return FilterUtils.POST_FILTER_TYPE;
    }

    @Override
    public int filterOrder() {
        return FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        return SHOULD_FILTER;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        requestContext.getResponse().addHeader(FilterUtils.CORRELATION_ID, filterUtils.getCorrelationId());
        System.out.println(filterUtils.getAuthToken());
        return null;
    }
}

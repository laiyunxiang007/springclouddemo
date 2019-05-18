package com.example.zuul.filter;

import com.example.zuul.config.ServiceConfig;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/29
 */
@Component
public class TrackingFilter extends ZuulFilter {
    private static final int FILTER_ORDER = 1;
    private static final boolean SHOULDFILTER = true;
    private static final Logger logger = LoggerFactory.getLogger(TrackingFilter.class);
    @Autowired
    FilterUtils filterUtils;
    @Autowired
    ServiceConfig serviceConfig;

    @Override
    public String filterType() {
        return FilterUtils.PRE_FILTER_TYPE;
    }

    @Override
    public int filterOrder() {
        return FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        return SHOULDFILTER;
    }

    private boolean isCorrelationIdPresent() {
        if (filterUtils.getCorrelationId() != null) {
            return true;
        }

        return false;
    }

    private String generateCorrelationId() {
        return java.util.UUID.randomUUID().toString();
    }

    @Override
    public Object run() {
        String i = getOrganizationId();
        System.out.println("token===" + i);
        if (isCorrelationIdPresent()) {
            logger.debug("tmx-correlation-id found in tracking filter: {}. ", filterUtils.getCorrelationId());
        } else {
            filterUtils.setCorrelationId(generateCorrelationId());
            logger.debug("tmx-correlation-id generated in tracking filter: {}.", filterUtils.getCorrelationId());
        }

        RequestContext ctx = RequestContext.getCurrentContext();
        logger.debug("Processing incoming request for {}.", ctx.getRequest().getRequestURI());
        return null;
    }

    private String getOrganizationId() {
        String result = "";
        if (filterUtils.getAuthToken() != null) {
            String authToken = filterUtils.getAuthToken();
            try {
                Claims claims = Jwts.parser()
                        .setSigningKey(serviceConfig.getJwtSigningKey()
                                .getBytes("UTF-8"))
                        .parseClaimsJws(authToken)
                        .getBody();
                result = (String) claims.get("organizationId");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}

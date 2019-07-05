package com.yf.garden.common.config;

import com.yf.garden.common.intercept.ApiInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 拦截器注册
 * @author 张继生
 * @date 2019/4/18 8:45
 */
@Configuration
public class CustomWebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Bean("apiInterceptor")
    public ApiInterceptor apiInterceptor(){
        return new ApiInterceptor();
    }

    @Autowired
    ApiInterceptor apiInterceptor;

    @Value("${intercepturl}")
    private String intercepturl;
    /**
     * 增加拦截器
     * 注意："/api/**"表示/api所有子路径
     *      "/api/*"表示/api下一级子路径
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiInterceptor).addPathPatterns(intercepturl).excludePathPatterns("/api/app/user/v1/login/*", "/api/app/user/v1/*/smsCode","/api/pc/user/v1/login/pcpass").excludePathPatterns("/api/signKey");
        super.addInterceptors(registry);
    }
}


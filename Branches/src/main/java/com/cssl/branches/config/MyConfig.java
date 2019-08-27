package com.cssl.branches.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.cssl.branches.interceptor.*;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 加拦截器
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/testmvc");

    }
}

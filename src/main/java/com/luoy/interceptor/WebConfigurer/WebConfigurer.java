package com.luoy.interceptor.WebConfigurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //通过重定向方式转入到首页
        registry.addViewController("/").setViewName("forward:pages/login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}

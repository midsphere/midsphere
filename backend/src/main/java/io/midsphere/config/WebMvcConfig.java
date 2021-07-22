package io.midsphere.config;

import io.midsphere.filter.CorsFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Collections;

/**
 * WebMVC 配置
 * @author liqiwen
 * @since 1.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());


    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilterFilterRegistrationBean() {

        CorsFilter corsFilter = new CorsFilter();
        FilterRegistrationBean<CorsFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(corsFilter);
        filterFilterRegistrationBean.setUrlPatterns(Collections.singleton("/**"));
        return filterFilterRegistrationBean;
    }
}

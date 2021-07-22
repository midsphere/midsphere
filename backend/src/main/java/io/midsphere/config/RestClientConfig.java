package io.midsphere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * restClientConfig
 * @author liqiwen
 * @since 1.0
 */
@Configuration
public class RestClientConfig {


    /**
     * 不带超时时间的 restTemplate
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * 带超时时间的 restTemplateClient
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplateWithTimeout() {
        RestTemplate restTemplate = new RestTemplate();
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setConnectionRequestTimeout(4000);
        httpRequestFactory.setConnectTimeout(4000);
        httpRequestFactory.setReadTimeout(10 * 1000);
        restTemplate.setRequestFactory(httpRequestFactory);
        return restTemplate;
    }

}

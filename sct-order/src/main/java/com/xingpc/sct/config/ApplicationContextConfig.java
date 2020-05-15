package com.xingpc.sct.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: XingPc
 * @Description: RestTemplate配置类
 * @Date: 2020/4/24 16:31
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

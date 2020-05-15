package com.xingpc.sct.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XingPc
 * @Description: OpenFeign配置类
 * @Date: 2020/5/10 23:32
 * @Version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level getLoggerLevel() {
        // feign 日志级别，NONE,BASIC,HEADERS,FULL
        return Logger.Level.FULL;
    }

}

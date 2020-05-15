package com.xingpc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XingPc
 * @Description: Ribbon自定义负载规则
 * @Date: 2020/5/10 17:26
 * @Version: 1.0
 */
@Configuration
public class CustomRule {

    @Bean
    public IRule getCustomRule() {
        return new RandomRule();
    }

}

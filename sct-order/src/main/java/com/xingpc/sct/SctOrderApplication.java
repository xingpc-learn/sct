package com.xingpc.sct;

import com.xingpc.myrule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: XingPc
 * @Description: 订单模块启动类
 * @Date: 2020/4/24 16:05
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "sct-payment-service", configuration = CustomRule.class)
public class SctOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SctOrderApplication.class, args);
    }

}

package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: XingPc
 * @Description: 支付模块入口
 * @Date: 2020/4/24 12:32
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class SctPaymentApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(SctPaymentApplication02.class,args);
    }

}

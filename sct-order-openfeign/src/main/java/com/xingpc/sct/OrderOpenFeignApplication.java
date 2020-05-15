package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: XingPc
 * @Description: 使用OpenFeign订单启动类
 * @Date: 2020/5/10 22:31
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplication.class,args);
    }

}

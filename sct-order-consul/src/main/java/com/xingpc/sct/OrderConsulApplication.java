package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: order启动类，注册中心consul
 * @Date: 2020/5/10 12:20
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApplication.class,args);
    }

}

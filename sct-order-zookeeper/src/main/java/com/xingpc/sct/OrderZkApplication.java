package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: 订单服务启动类，注册进zookeeper
 * @Date: 2020/5/10 10:27
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication.class,args);
    }

}

package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: 向zookeeper注册服务启动类
 * @Date: 2020/5/10 9:33
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayZkApplication.class,args);
    }

}

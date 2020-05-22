package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: nacos启动类
 * @Date: 2020/5/22 9:18
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayMain02 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPayMain02.class,args);
    }

}

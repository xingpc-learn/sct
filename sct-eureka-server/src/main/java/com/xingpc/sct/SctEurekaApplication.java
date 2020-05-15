package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: XingPc
 * @Description: Eureka启动类
 * @Date: 2020/4/25 18:04
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class SctEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SctEurekaApplication.class,args);
    }

}

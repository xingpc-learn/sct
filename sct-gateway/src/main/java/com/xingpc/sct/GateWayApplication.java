package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: XingPc
 * @Description: 服务网关启动类
 * @Date: 2020/5/14 13:37
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
    }

}

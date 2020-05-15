package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: XingPc
 * @Description: Eureka集群注册中心服务02启动类
 * @Date: 2020/5/9 13:02
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class SctEurekaApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(SctEurekaApplication02.class,args);
    }

}

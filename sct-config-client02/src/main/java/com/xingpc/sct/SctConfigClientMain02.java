package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: XingPc
 * @Description: 配置类客户端02启动类
 * @Date: 2020/5/19 12:50
 * @Version: 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class SctConfigClientMain02 {

    public static void main(String[] args) {
        SpringApplication.run(SctConfigClientMain02.class,args);
    }

}

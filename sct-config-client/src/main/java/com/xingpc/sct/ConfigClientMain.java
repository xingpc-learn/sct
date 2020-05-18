package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: XingPc
 * @Description: 配置中心客户端启动类
 * @Date: 2020/5/18 13:26
 * @Version: 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain.class,args);
    }

}

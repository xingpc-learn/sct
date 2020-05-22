package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: nacos配置中心客户端
 * @Date: 2020/5/22 13:56
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain.class,args);
    }

}

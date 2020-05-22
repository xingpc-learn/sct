package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: 订单控制层
 * @Date: 2020/5/22 13:15
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain.class,args);
    }

}

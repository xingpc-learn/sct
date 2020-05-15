package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XingPc
 * @Description: consul支付启动类
 * @Date: 2020/5/10 11:49
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayConsulApplication.class,args);
    }

}

package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: XingPc
 * @Description: Hystrix订单启动类
 * @Date: 2020/5/12 12:59
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain.class,args);
    }

}

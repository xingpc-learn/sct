package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: XingPc
 * @Description: SpringCloud生产者启动类
 * @Date: 2020/5/21 8:03
 * @Version: 1.0
 */
@SpringBootApplication
public class StreamRabbitProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitProviderMain.class,args);
    }

}

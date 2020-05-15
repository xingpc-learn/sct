package com.xingpc.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: XingPc
 * @Description: 熔断监控可视化界面
 * @Date: 2020/5/14 12:19
 * @Version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain.class,args);
    }

}

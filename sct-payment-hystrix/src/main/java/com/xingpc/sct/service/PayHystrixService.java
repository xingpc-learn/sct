package com.xingpc.sct.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: XingPc
 * @Description: hystrix业务层
 * @Date: 2020/5/11 13:32
 * @Version: 1.0
 */
@Service
@Slf4j
public class PayHystrixService {

    public String getPayInfoNormal(String id) {
        return "线程池：" + Thread.currentThread().getName() + ",id" + id + "正常调用";
    }

    @HystrixCommand(fallbackMethod = "getPayInfoTimeoutBak", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "6000")
    })
    public String getPayInfoTimeout(String id) {
        int sleepTime = 5;
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + ",id" + id + "调用超时，耗时:" + sleepTime;
//        int num = 1/0;
//        return "线程池：" + Thread.currentThread().getName() + ",id" + id + "调用超时";
    }

    public String getPayInfoTimeoutBak(String id) {
        return "线程池：" + Thread.currentThread().getName() + ",id" + id + "^_^";
    }

    //    服务熔断
    @HystrixCommand(fallbackMethod = "payCircuitBreakerFallBack", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //是否开启熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), //时间窗口期
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60") // 错误率
    })
    public String payCircuitBreaker(@PathVariable("id") Integer id) {
        if ( id <0 ) {
            throw new RuntimeException("-------id不能为负数！");
        }
        String serialNo = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "payCircuitBreaker服务调用成功！流水号：" + serialNo;
    }

    public String payCircuitBreakerFallBack(@PathVariable("id") Integer id) {
        return "id不能为负数，请重试！id：" + id;
    }

}

package com.xingpc.sct.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;
import com.xingpc.sct.entities.CommonResult;
import com.xingpc.sct.service.PayHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: Hystrix订单接口
 * @Date: 2020/5/12 13:02
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "/orderHystrix")
@DefaultProperties(defaultFallback = "getGlobalBak")
public class OrderHystrixController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PayHystrixService service;

    @GetMapping(value = "/getPayInfoNormal/{id}")
    public CommonResult<String> getPayInfoNormal(@PathVariable("id") String id) {
        return service.getPayInfoNormal(id);
    }

    @GetMapping(value = "/getPayInfoTimeout/{id}")
//    @HystrixCommand(fallbackMethod = "getPayInfoTimeoutBak", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    @HystrixCommand
    public CommonResult<String> getPayInfoTimeout(@PathVariable("id") String id) {
        return service.getPayInfoTimeout(id);
    }

    public CommonResult<String> getPayInfoTimeoutBak(@PathVariable("id") String id) {
        return new CommonResult<>(0000,"对不起，当前访问人数太多，请稍后重试！" + "^_^");
    }

    public CommonResult<String> getGlobalBak() {
        return new CommonResult<>(0000,"系统忙，请稍后重试！" + "^_^");
    }

}

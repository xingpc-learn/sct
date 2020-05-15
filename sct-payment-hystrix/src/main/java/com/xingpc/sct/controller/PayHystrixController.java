package com.xingpc.sct.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xingpc.sct.entities.CommonResult;
import com.xingpc.sct.service.PayHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: hystrix支付服务控制层
 * @Date: 2020/5/11 13:40
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "/payHystrix")
public class PayHystrixController {

    @Resource
    private PayHystrixService service;

    @Value(value = "${server.port}")
    private String serverPort;

    @GetMapping(value = "/getPayInfoNormal/{id}")
    public CommonResult<String> getPayInfoNormal(@PathVariable("id") String id) {
        return new CommonResult<String>(0000,"操作成功！",service.getPayInfoNormal(id) + "服务端口：" + serverPort);
    }

    @GetMapping(value = "/getPayInfoTimeout/{id}")
    public CommonResult<String> getPayInfoTimeout(@PathVariable("id") String id) {
        return new CommonResult<String>(5555,"操作延时！",service.getPayInfoTimeout(id) + "服务端口：" + serverPort);
    }

    //    服务熔断
    @GetMapping(value = "/payCircuitBreaker/{id}")
    public String payCircuitBreaker(@PathVariable("id") Integer id) {
        return service.payCircuitBreaker(id);
    }

}

package com.xingpc.sct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: order控制层，注册中心consul
 * @Date: 2020/5/10 12:23
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/orderConsul")
@Slf4j
public class OrderConsulController {

    private static final String PAYMENT_CONSUL_URL = "http://sct-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/getPaymentInfo")
    public String getPaymentInfo() {
        return restTemplate.getForObject(PAYMENT_CONSUL_URL + "/payConsul/getPayConsulPort",String.class);
    }

}

package com.xingpc.sct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: 订单类，zookeeper
 * @Date: 2020/5/10 10:31
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/orderZk")
public class OrderZkController {

    private static final String PAYMENT_ZK_URL = "http://sct-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/getPaymentInfo")
    public String getPaymentInfo() {
        return restTemplate.getForObject(PAYMENT_ZK_URL + "/payZk/getPayZkPort",String.class);
    }

}

package com.xingpc.sct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: XingPc
 * @Description: 支付控制层
 * @Date: 2020/5/10 9:36
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "/payZk")
public class PaymentZkController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/getPayZkPort")
    public String getPayZkPort() {
        return "spring cloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}

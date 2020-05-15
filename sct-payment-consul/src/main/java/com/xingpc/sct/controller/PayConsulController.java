package com.xingpc.sct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: XingPc
 * @Description: 支付控制层，注册进consul
 * @Date: 2020/5/10 11:55
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/payConsul")
@Slf4j
public class PayConsulController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/getPayConsulPort")
    public String getPayConsulPort() {
        return "spring cloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}

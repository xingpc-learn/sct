package com.xingpc.sct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: 订单控制层
 * @Date: 2020/5/22 13:17
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/order")
public class NacosOrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @GetMapping(value = "/getPayInfo/{id}")
    public String getPayInfo(@PathVariable("id") long id) {
        return restTemplate.getForObject(serviceUrl + "/payment/getPay/" + id,String.class);
    }

}

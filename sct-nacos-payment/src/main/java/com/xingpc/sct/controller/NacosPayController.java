package com.xingpc.sct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XingPc
 * @Description: 支付服务控制层
 * @Date: 2020/5/22 12:57
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/payment")
public class NacosPayController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/getPay/{id}")
    public String getPay(@PathVariable("id") long id) {
        return "Nacos provider payment:" + id + "。端口：" +serverPort;
    }

}

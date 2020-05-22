package com.xingpc.sct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XingPc
 * @Description: 控制层
 * @Date: 2020/5/22 14:00
 * @Version: 1.0
 */
@RestController
@RefreshScope
@RequestMapping(value = "/config")
public class NacosConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/getConfigInfo")
    public String getConfigInfo() {
        return "Nacos config ,get message: " + configInfo;
    }

}

package com.xingpc.sct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XingPc
 * @Description: 配置客户端控制层
 * @Date: 2020/5/18 13:28
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/config")
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/getConfigInfo")
    @RefreshScope
    public String getConfigInfo() {
        return configInfo;
    }

}

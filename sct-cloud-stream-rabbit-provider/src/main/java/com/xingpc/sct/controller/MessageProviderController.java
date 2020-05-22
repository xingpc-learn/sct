package com.xingpc.sct.controller;

import com.xingpc.sct.sesrvice.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: 消息生产者控制层
 * @Date: 2020/5/21 8:24
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/provider")
public class MessageProviderController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.sendMessage();
    }

}

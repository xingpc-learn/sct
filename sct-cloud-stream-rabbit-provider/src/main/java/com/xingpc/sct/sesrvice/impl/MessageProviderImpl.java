package com.xingpc.sct.sesrvice.impl;

import com.xingpc.sct.sesrvice.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author: XingPc
 * @Description: 发送消息实现类，定义消息推送管道
 * @Date: 2020/5/21 8:10
 * @Version: 1.0
 */
@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    /** 消息发送管道 */
    @Resource
    private MessageChannel output;

    @Override
    public String sendMessage() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("发送serial:--------" + serial);
        return null;
    }

}

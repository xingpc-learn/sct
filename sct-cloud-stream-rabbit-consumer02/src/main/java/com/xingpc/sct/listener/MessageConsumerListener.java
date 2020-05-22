package com.xingpc.sct.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


/**
 * @Author: XingPc
 * @Description: 消息接收监听
 * @Date: 2020/5/21 8:42
 * @Version: 1.0
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class MessageConsumerListener {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message<String> message) {
        log.info("端口：" + serverPort + ",接收内容：" + message.getPayload());
    }

}

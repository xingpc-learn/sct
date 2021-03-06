package com.xingpc.sct.controller;

import com.xingpc.sct.entities.CommonResult;
import com.xingpc.sct.entities.Payment;
import com.xingpc.sct.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: 支付模块控制层
 * @Date: 2020/4/24 13:33
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/insertPayment")
    public CommonResult<Integer> insertPayment(@RequestBody Payment payment){
        int result = paymentService.insertPayment(payment);
        log.info("insertPayment执行结果：" + result);
        return result > 0 ? new CommonResult<>(200,"插入数据成功！" + ",端口：" + serverPort,result) : new CommonResult<>(444,"插入数据失败！" + ",端口：" + serverPort,result);
    }

    @GetMapping(value = "/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("getPaymentById执行结果：" + payment);
        return new CommonResult<>(200,"操作成功！" + ",端口：" + serverPort,payment);
    }

    @GetMapping(value = "/getPaymentLb")
    public String getPaymentLb() {
        return serverPort;
    }

    @GetMapping(value = "/getPaymentFeignTimeout")
    public String getPaymentFeignTimeout() {
        try {
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping(value = "/getPaymentZipkin")
    public String getPaymentZipkin() {
        return "zipkin,端口" + serverPort;
    }

}

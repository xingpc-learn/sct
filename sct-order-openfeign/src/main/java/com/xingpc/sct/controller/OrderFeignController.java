package com.xingpc.sct.controller;

import com.xingpc.sct.entities.CommonResult;
import com.xingpc.sct.entities.Payment;
import com.xingpc.sct.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: Feign服务调用控制层
 * @Date: 2020/5/10 22:46
 * @Version: 1.0
 */
@RestController
@RequestMapping("/orderFeign")
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/getPaymentByIdByOpenFeign/{id}")
    public CommonResult<Payment> getPaymentByIdByOpenFeign(@PathVariable("id") long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/getPaymentFeignTimeout")
    public String getPaymentFeignTimeout() {
        // OpenFeign-ribbon默认等待1s
       return paymentFeignService.getPaymentFeignTimeout();
    }

}

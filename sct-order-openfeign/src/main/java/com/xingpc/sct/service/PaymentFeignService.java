package com.xingpc.sct.service;

import com.xingpc.sct.entities.CommonResult;
import com.xingpc.sct.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: XingPc
 * @Description: OpenFeign服务调用接口
 * @Date: 2020/5/10 22:41
 * @Version: 1.0
 */
@Component
@FeignClient(value = "SCT-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @PostMapping(value = "/payment/insertPayment")
    CommonResult<Integer> insertPayment(@RequestBody Payment payment);

    @GetMapping(value = "/payment/getPaymentById/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") long id);

    @GetMapping(value = "/payment/getPaymentFeignTimeout")
    public String getPaymentFeignTimeout();

}

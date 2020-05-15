package com.xingpc.sct.service;

import com.xingpc.sct.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: XingPc
 * @Description: Hystrix接口
 * @Date: 2020/5/12 13:02
 * @Version: 1.0
 */
@Component
@FeignClient(value = "sct-payment-hystrix-service", fallback = PayHystrixFallbackService.class)
public interface PayHystrixService {

    @GetMapping(value = "/payHystrix/getPayInfoNormal/{id}")
    CommonResult<String> getPayInfoNormal(@PathVariable("id") String id);

    @GetMapping(value = "/payHystrix/getPayInfoTimeout/{id}")
    CommonResult<String> getPayInfoTimeout(@PathVariable("id") String id);

}

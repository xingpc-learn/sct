package com.xingpc.sct.service;

import com.xingpc.sct.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @Author: XingPc
 * @Description: 服务降级（运行异常、超时、服务宕机）统一处理类
 * @Date: 2020/5/13 13:05
 * @Version: 1.0
 */
@Component
public class PayHystrixFallbackService implements PayHystrixService {

    @Override
    public CommonResult<String> getPayInfoNormal(String id) {
        return new CommonResult<String>(0000,"PayHystrixFallbackService, getPayInfoNormal" + "fallback");
    }

    @Override
    public CommonResult<String> getPayInfoTimeout(String id) {
        return new CommonResult<String>(0000,"PayHystrixFallbackService, getPayInfoTimeout" + "fallback");
    }

}

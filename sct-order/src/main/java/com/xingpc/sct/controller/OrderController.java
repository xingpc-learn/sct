package com.xingpc.sct.controller;

import com.xingpc.sct.entities.CommonResult;
import com.xingpc.sct.entities.Payment;
import com.xingpc.sct.lb.CustomLoadBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: XingPc
 * @Description: 订单控制层
 * @Date: 2020/4/24 16:14
 * @Version: 1.0
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    private static final  String PAYMENT_URL = "http://sct-payment-service";

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private CustomLoadBalance customLoadBalance;

    @GetMapping("/createOrderPayment")
    public CommonResult<Payment> createOrder(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insertPayment", payment,CommonResult.class);
    }

    @GetMapping("/getOrderPayment/{id}")
    public CommonResult<Payment> getOrderPayment(@PathVariable("id") long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentById/" + id, CommonResult.class);
    }

    @GetMapping("/getOrderPaymentEntity/{id}")
    public CommonResult<Payment> getOrderPaymentEntity(@PathVariable("id") long id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/getPaymentById/" + id, CommonResult.class);
        if (forEntity.getStatusCode().is2xxSuccessful()) {
            log.info("返回信息：" +forEntity.getStatusCode()+"\t"+forEntity.getStatusCodeValue());
            return forEntity.getBody();
        } else {
            return new CommonResult<>(444,"操作失败！");
        }
    }

    @GetMapping(value = "/getPaymentLb")
    public String getPaymentLb() {
        List<ServiceInstance> instances = discoveryClient.getInstances("sct-payment-service");
        if ( instances == null || instances.size() <=0 ) {
            return null;
        }
        ServiceInstance serviceInstance = customLoadBalance.instancs(instances);
        return restTemplate.getForObject(serviceInstance.getUri() + "/payment/getPaymentLb",String.class);
    }

}

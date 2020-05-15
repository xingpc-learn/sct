package com.xingpc.sct.service;


import com.xingpc.sct.entities.Payment;

/**
 * @Author: XingPc
 * @Description: payment接口
 * @Date: 2020/4/24 13:26
 * @Version: 1.0
 */
public interface PaymentService {

    /**
     *
     * 功能描述:插入支付信息
     * @Author XingPc
     * @Date 13:06 2020/4/24
     * @param payment
     * @return int
     */
    int insertPayment(Payment payment);

    /**
     *
     * 功能描述:根据id查支付信息
     * @Author XingPc
     * @Date 13:07 2020/4/24
     * @param id
     * @return
     */
    Payment getPaymentById(long id);

}

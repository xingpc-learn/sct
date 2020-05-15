package com.xingpc.sct.service.impl;

import com.xingpc.sct.dao.PaymentDao;
import com.xingpc.sct.entities.Payment;
import com.xingpc.sct.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: XingPc
 * @Description: payment接口实现类
 * @Date: 2020/4/24 13:26
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int insertPayment(Payment payment) {
        return paymentDao.insertPayment(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }

}

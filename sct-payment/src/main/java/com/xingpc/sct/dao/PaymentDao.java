package com.xingpc.sct.dao;

import com.xingpc.sct.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: XingPc
 * @Description: 支付dao层，操作数据库
 * @Date: 2020/4/24 13:04
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {

    /**
     *
     * 功能描述:插入支付信息
     * @Author XingPc
     * @Date 13:06 2020/4/24
     * @param payment
     * @return int
     */
    public int insertPayment(Payment payment);

    /**
     *
     * 功能描述:根据id查支付信息
     * @Author XingPc
     * @Date 13:07 2020/4/24
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") long id);

}

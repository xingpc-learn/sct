package com.xingpc.sct.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: XingPc
 * @Description: 支付实体
 * @Date: 2020/4/24 12:52
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private long id;

    private String serial;

}

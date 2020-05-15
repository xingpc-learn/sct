package com.xingpc.sct.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: XingPc
 * @Description: 统一返回消息体
 * @Date: 2020/4/24 12:56
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public CommonResult(Integer code, String msg) {
        this(code,msg,null);
    }

}

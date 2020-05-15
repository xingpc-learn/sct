package com.xingpc.sct.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: XingPc
 * @Description: 自定义负载均衡算法
 * @Date: 2020/5/10 18:17
 * @Version: 1.0
 */
public interface CustomLoadBalance {

    ServiceInstance instancs(List<ServiceInstance> serviceInstances);

}

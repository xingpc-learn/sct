package com.xingpc.sct.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: XingPc
 * @Description: 自定义负载均衡轮询算法实现
 * @Date: 2020/5/10 18:24
 * @Version: 1.0
 */
@Component
@Slf4j
public class CustomLoadBalanceImpl implements CustomLoadBalance {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement() {
        int current;
        int next;
        // 自旋锁
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current,next));
        log.info("next值，第几次访问：" + next);
        return next;
    }

    @Override
    public ServiceInstance instancs(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }

}

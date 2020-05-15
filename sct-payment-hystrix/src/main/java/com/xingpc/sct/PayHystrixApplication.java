package com.xingpc.sct;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Author: XingPc
 * @Description: 服务熔断支付启动类
 * @Date: 2020/5/11 13:30
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PayHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayHystrixApplication.class,args);
    }

    /**
    * 此配置为服务监控配置，与此容器无关，spirngCloud升级后问题
    * */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("MyHystrixMetricsStreamServlet");
        return registrationBean;
    }

}

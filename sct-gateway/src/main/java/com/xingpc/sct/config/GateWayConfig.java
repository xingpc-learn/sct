package com.xingpc.sct.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XingPc
 * @Description: 网关配置类
 * @Date: 2020/5/15 8:14
 * @Version: 1.0
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouterLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("payment_route_baidu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

}

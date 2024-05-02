package br.com.shortener.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("shorten", r -> r.path("/shorten").uri("http://localhost:8081/shorten"))
                .route("/*", r -> r.path("/*").uri("http://localhost:8081/*"))
                .build();
    }
}

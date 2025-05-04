package com.poc.ecommerce.user.Config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();

    }
}
package com.application.delivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfiguration {

    @Primary
    @Bean("productTwo")
    public Product getProductTwo(){
        System.out.println("productTwo is created via bean method from configuration class");
        return new Product();
    }
}

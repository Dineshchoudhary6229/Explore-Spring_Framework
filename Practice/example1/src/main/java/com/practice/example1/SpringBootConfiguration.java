package com.practice.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Basically we define bean here in configuration class , but we don't need to provide @ComponentScan
// because we use @SpringBootApplication annotation in main method of spring boot application
@Configuration
public class SpringBootConfiguration {

    @Bean
    public Customer customer1(){
        System.out.println("This is second customer bean:");


        return new Customer();
    }
    @Bean
    public Order order1(){
        System.out.println("Order bean from configuration class:");
        return new Order();
    }

    @Bean
    public Product product1(){
        System.out.println("Product bean from configuration class:");
        return new Product();
    }
}

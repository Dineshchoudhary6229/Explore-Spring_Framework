package com.SpringBoot.SpringDi.Interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfiguration {

    @Bean
    public Car car2(){
        System.out.println("This is Car2 Bean from bean configuration class :");
    return new Car();
    }


    @Bean
    public Bus bus2(){
        System.out.println("This is Bus2 bean from bean configuration class :");
        return new Bus();
    }

    @Bean
    public Bike bike2(){
        System.out.println("This is Bike2 bean from bean configuration class :");
        return new Bike();
    }







}

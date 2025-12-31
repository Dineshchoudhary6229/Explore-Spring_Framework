package com.application.delivery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfiguration {

    @Primary
    @Bean("productTwo")
    public Product getProductTwo(){
        Product p2= new Product();
        System.out.println("productTwo is created via bean method from configuration class"+  p2);
        return p2;
    }
}
/*If we have @Primary annotation on one bean and @Qualifier annotation on other bean then spring will
preference to @Qualifier annotation and inject bean of @Qualifier annotation because it clearly mention
that the developer know and wants to inject bean clearly with @Qualifier annotation while when we use
@Primary annotation then it show we don't know which one to choose it's upto the spring to chhose
which one should be inejcted */
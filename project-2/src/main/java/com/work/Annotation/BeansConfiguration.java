package com.work.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.work.Annotation")
@Configuration
public class BeansConfiguration {

    @Bean(name = "Credit Card")
    public PaymentType creditCard(){

        PaymentType payment= new PaymentType();
        payment.setPaymentType("Credit Card Payment");
        return payment;
    }

    @Bean ("Debit Card")
    public PaymentType debitCard(){
        PaymentType payment= new PaymentType();
        payment.setPaymentType("Debit Card Payment");

        return payment;
    }

    @Bean
    public PaymentType upiPayment(){

        PaymentType payment= new PaymentType();
        payment.setPaymentType("UPI  Payment");
        return payment;
    }







}

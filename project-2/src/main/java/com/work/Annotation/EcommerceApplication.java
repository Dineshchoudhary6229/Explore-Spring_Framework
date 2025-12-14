package com.work.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EcommerceApplication {

    public static void main(String[] args) {

        ApplicationContext conatiner= new AnnotationConfigApplicationContext(BeansConfiguration.class);

       PaymentGateway paymentGateway=(PaymentGateway) conatiner.getBean("paymentGateway");

       // Extracted injected Bean Object
        PaymentType payment =paymentGateway.getPaymentType();
        System.out.println(payment);

        System.out.println(payment.getPaymentType());

        // beans of PaymentType
        System.out.println("Beans of PaymentType:");
        System.out.println(conatiner.getBean("Credit Card"));
        System.out.println(conatiner.getBean("Debit Card"));
        System.out.println(conatiner.getBean("upiPayment"));


    }



}

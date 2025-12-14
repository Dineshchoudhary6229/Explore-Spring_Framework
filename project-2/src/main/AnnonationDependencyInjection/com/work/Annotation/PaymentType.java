package com.work.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "upiPayment")
public class PaymentType {


    private  String paymentType;

    public PaymentType(){
        System.out.println("PaymentType Object is created with @Component ");
    }


    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}





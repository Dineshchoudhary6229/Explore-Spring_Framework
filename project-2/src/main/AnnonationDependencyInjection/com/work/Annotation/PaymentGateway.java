package com.work.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    private int amount;
    private String userName;
    private String userEmail;

                                     // @Qualifier is used to tell the container that which bean we want to inject out of more than one bean
                                     //It is always used with @Autowired annotation ,and if we want to inject a specific bean from a no of beans
                                     // like here we want to inject credit card  bean from credit card , debit card , upi payment beans of type paymentType
    @Qualifier("Credit Card")
    @Autowired
    public PaymentType paymentType;


    public PaymentGateway() {
        System.out.println("Payment Gateway is created");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }


}

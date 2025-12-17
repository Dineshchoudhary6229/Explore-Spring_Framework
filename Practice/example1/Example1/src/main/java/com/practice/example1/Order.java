package com.practice.example1;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private int orderId;
    private String ordreName;

    Order(){
        System.out.println("Order object is created:");
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrdreName() {
        return ordreName;
    }

    public void setOrdreName(String ordreName) {
        this.ordreName = ordreName;
    }
}

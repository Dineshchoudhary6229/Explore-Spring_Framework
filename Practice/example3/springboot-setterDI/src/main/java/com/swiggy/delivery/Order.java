package com.swiggy.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Order {
    private int orderId;
    private int noOfItems;
    private String emailId;
    private Product product;




    public Order() {
        System.out.println("Order object is created :");
    }

    public Product getProduct() {
        return product;
    }

// setter DI in spring boot
    @Autowired
    public void setProduct(Product product) {
        this.product = product;
    }
}

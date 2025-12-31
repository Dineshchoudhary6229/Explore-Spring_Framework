package com.application.delivery;

import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println("Setter of product is called from order :"+ product);
        this.product = product;

    }
}

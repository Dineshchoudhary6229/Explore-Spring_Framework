package com.practice.example1;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int productId;
    private String productName;

    public Product(){
        System.out.println("Product object is created:");
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

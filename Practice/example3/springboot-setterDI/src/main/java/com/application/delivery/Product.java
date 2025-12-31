package com.application.delivery;

import org.springframework.stereotype.Component;

@Component("productOne")
public class Product {

    public int productId;
    public String name;
    public double price;

    public Product() {
        System.out.println("product object is created: ");
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

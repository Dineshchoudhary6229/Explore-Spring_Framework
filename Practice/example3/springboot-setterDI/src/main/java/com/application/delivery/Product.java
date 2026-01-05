package com.application.delivery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// @Primary
@Component("productOne")
public class Product {
    @Value("100")           // we can set value of fields directly like this instead of using setter
    public int productId;
    public String name;
    public int price;

    public Product() {
        System.out.println("product object is created via default constructor : ");
    }

    public int getProductId() {
        return productId;
    }

//    public void setProductId(int productId) {
//        this.productId = productId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

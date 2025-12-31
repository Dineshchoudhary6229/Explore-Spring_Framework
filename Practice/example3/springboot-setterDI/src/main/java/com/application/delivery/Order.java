package com.application.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
//    @Qualifier("productTwo")
    public void setProduct(Product product) {
        System.out.println("Setter of product is called from order :"+ product);
        this.product = product;

    }
    // here setter method arg name is product so it will blindly inject this depencey because bean
    // name's are product and productTwo so it blindly inject product dependency
}
/* If we change bean names to productOne and productTwo and setter method arg name is product then there is
   ambiguity which is resolved using @Primary or @Qualifier annotation
   Note:-> so remember that when we have more than one bean then always check the setter method arg name
   becuase bean's are injected throught it insetter Di.

   Note:-> If we want to inject productTwo bean instead of product bean then we have to make these changes
      public void setProductTwo(Product productTwo) {
        System.out.println("Setter of product is called from order :"+ productTwo);
        this.product = productTwo; */
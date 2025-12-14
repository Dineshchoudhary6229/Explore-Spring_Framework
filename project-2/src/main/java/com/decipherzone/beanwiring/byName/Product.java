package com.decipherzone.beanwiring.byName;

public class Product {

    private int productId;
    private String productName;
    private double Price;


    public Product() {
    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        Price = price;
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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", Price=" + Price +
                '}';
    }
}


//by using autowire attribute we can inject dependencies automatically.
/* SFW provides 4 configuration values for autowire attribute :
1 no :  autowire="no"
     No Auto Wiring is allowed, Manual wiring-> with ref attribute

2 byName: autowire="byName"
    --> In this case,beans are injected internally by SFW through setter injection only
       we can check this by removing all constructors from the class inwhich we want to
       inject bean of other class
    --->The bean name in xml file for the class which we want to inject in other class
       should be same with the variable name in dependent class like:
       we want to inject product class and information class beans in cart class then
       in cart class
       private Product product;
       private Product product2;
       private Information information;
       and in xml file there should  bean with id as :
       <bean  id="product" class="com.decipherzone.product"  />
       <bean  id="product2" class="com.decipherzone.product"  />
       <bean id="information" class="com.decipherzone.information" />




 */
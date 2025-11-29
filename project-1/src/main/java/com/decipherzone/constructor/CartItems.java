package com.decipherzone.constructor;

import java.util.List;
import java.util.Map;

public class CartItems {
    private String name;
    private List<String> itemNames;
    private Map<String, Double> itemPrice;   // In map no duplicate value , latest value is shown from two or more value of same key
    private ProductWiring productWiring;




//    Constructors

    public CartItems(){
        System.out.println("Cart Items with no arg Constructor");
    }

    public CartItems(String name) {
        System.out.println("Cart Items with 1 arg Constructor");
        this.name = name;
    }

    public CartItems(List<String> itemNames) {
        this.itemNames = itemNames;
        System.out.println("Cart Items Constructor with : List");
    }

    public CartItems(String name, List<String> itemNames) {
        this.name = name;
        this.itemNames = itemNames;
        System.out.println("Cart Items Constructor with : List , String");
    }

    public CartItems(String name, List<String> itemNames, Map<String, Double> itemPrice , ProductWiring productWiring) {
        this.name = name;
        this.itemNames = itemNames;
        this.itemPrice = itemPrice;
        this.productWiring=productWiring;
        System.out.println("Cart Items Constructor with : List , String , Map");
        System.out.println("\n");
    }

//    Getters and Setters for all variables


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItemNames() {
        return itemNames;
    }

    public void setItemNames(List<String> itemNames) {
        this.itemNames = itemNames;
    }

    public Map<String, Double> getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Map<String, Double> itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ProductWiring getProductWiring() {
        return productWiring;
    }

    public void setProductWiring(ProductWiring productWiring) {
        this.productWiring = productWiring;
    }


    @Override
    public String toString() {
        return "CartItems{" +
                "name='" + name + '\'' +
                ", itemNames=" + itemNames +
                ", itemPrice=" + itemPrice +
                ", productWiring=" + productWiring +
                '}';
    }
}

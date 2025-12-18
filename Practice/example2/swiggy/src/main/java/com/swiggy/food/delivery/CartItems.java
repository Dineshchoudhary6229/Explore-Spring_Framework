package com.swiggy.food.delivery;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;


// If this class is present in the same package in which main spring boot application which is
// with @SpringBootApplication is present then for this @Component class we don't need to provide
//the @ComponentScan annotation with it's package name in our main spring boot application
// Otherwise we have to provide the package name of all the component classes in main application.

@Component("cartItems1")
public class CartItems {

    private int noOfItems;
    private ArrayList<String> itemNames;

    public CartItems(){
        System.out.println("Cart Items created.....");
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public ArrayList<String> getItemNames() {
        return itemNames;
    }

    public void setItemNames(ArrayList<String> itemNames) {
        this.itemNames = itemNames;
    }
}

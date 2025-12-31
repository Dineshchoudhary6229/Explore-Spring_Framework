package com.swiggy.food;

import com.swiggy.food.delivery.CartItems;
import com.swiggy.food.delivery.OrderDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {

      ConfigurableApplicationContext context= SpringApplication.run(SpringBootApplication.class, args);



        OrderDetails orderDetails1= context.getBean("orderDetails", OrderDetails.class);
        System.out.println(orderDetails1.getCartItems().getClass());
        System.out.println(orderDetails1.getCartItems().getNoOfItems());
        System.out.println(orderDetails1.getCartItems().getItemNames());
        System.out.println("\n");
        System.out.println(orderDetails1.getClass());
        System.out.println(orderDetails1.getOrderAmount());
        System.out.println(orderDetails1.getUserEmail());
	}


    @Bean
    public CartItems cartItems2(){
        System.out.println("Cart Items2 is create.............");
        CartItems items= new CartItems();

        ArrayList<String> foodItems= new ArrayList<>();
        foodItems.add("Sweets");
        foodItems.add("Chocolates");
        foodItems.add("Fruits");


        items.setNoOfItems(2);
        items.setItemNames(foodItems);
        return items;
    }

}

package com.swiggy.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDetails {

    private double orderAmount;
    private String userEmail;

//    @Qualifier("cartItems2")              // this will tell spring that use cartItems2 as bean and qualifier always used with autowired
//    @Autowired
//    private List<CartItems> cartItems;    // If we want to run 2 beans or more than instead of @primary,@qualifier we can use this list to execute them
    
    @Qualifier("cartItems2")
    @Autowired
    private CartItems cartItems;



    public OrderDetails(){
        System.out.println("Order details object is created...................");
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public CartItems getCartItems() {
        return cartItems;
    }

    public void setCartItems(CartItems cartItems) {
        this.cartItems = cartItems;
    }
}

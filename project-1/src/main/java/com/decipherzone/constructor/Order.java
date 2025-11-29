package com.decipherzone.constructor;
// Order class is dependent class on CartItems class
public class Order {
    private  String emailId;
    private  CartItems cartItems;

    //Constructors

    public Order() {
        System.out.println("This is Default Constructor");
    }
    public Order(String emailId, CartItems cartItems) {
        System.out.println("This is Parametrized constructor for : emailId, CartItems");
        this.emailId = emailId;
        this.cartItems = cartItems;

    }

//Setters and Getters

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public CartItems getCartItems() {
        return cartItems;
    }

    public void setCartItems(CartItems cartItems) {
        this.cartItems = cartItems;
    }


// If we write toString here then it will invoke parametrized constructor of Order class
//which we print cartItems in Order class and also in SpringBeanWiring(with the help of ProductWiring )

//    @Override
//    public String toString() {
//        return "Order{" +
//                "emailId='" + emailId + '\'' +
//                ", cartItems=" + cartItems +
//                '}';
//    }
}

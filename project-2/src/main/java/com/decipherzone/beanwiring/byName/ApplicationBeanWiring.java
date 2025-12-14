package com.decipherzone.beanwiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationBeanWiring {
    public static void main(String[] args) {

        ApplicationContext container= new FileSystemXmlApplicationContext("C:\\Users\\Dinesh Choudhary\\IdeaProjects\\Explore-Spring_Framework\\project-2\\src\\main\\resources\\BeanAutoWiring.xml");

        Cart cart = (Cart) container.getBean("cart");

        System.out.println(cart.getClass());
        System.out.println(cart.getNoOfIteams());
        System.out.println(cart.getProduct1());
        System.out.println(cart.getProduct2());
        System.out.println(cart.getInformation());

         Product p1= cart.getProduct1();
        System.out.println(p1.getClass());
        System.out.println(p1.getProductId());
        System.out.println(p1.getProductName());
        System.out.println(p1.getPrice());


// directly accessing the product2 bean
// while we can access product2 variables with
// Product p2= cart.getProduct2();
        Product p2=(Product) container.getBean("product2");
        System.out.println(p2.getProductId());
        System.out.println(p2.getProductName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getClass());

        // above product2 we can also get by this below with the help of  cart class
        System.out.println(cart.getProduct2().getClass());
        System.out.println(cart.getProduct2().getProductId());
        System.out.println(cart.getProduct2().getProductName());
        System.out.println(cart.getProduct2().getPrice());

        System.out.println("*****************************************");

        Order order=(Order) container.getBean("order");

        System.out.println(order.getClass());
        System.out.println(order.getCart().getClass());
        System.out.println(order.getCart().getNoOfIteams());
        System.out.println("\n");
        System.out.println(order.getCart().getProduct1().getClass());
        System.out.println(order.getCart().getProduct1().getProductId());
        System.out.println(order.getCart().getProduct1().getProductName());
        System.out.println(order.getCart().getProduct1().getPrice());
        System.out.println("\n");
        System.out.println(order.getCart().getProduct2().getClass());
        System.out.println(order.getCart().getProduct2().getProductId());
        System.out.println(order.getCart().getProduct2().getProductName());
        System.out.println(order.getCart().getProduct2().getPrice());
        System.out.println("\n");
        System.out.println(order.getCart().getInformation().getClass());



    }
}

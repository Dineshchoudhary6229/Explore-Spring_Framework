package com.decipherzone.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringConstructorInjection {
    public static void main(String[] args) {

        ApplicationContext container= new FileSystemXmlApplicationContext("C:\\Users\\Dinesh Choudhary\\IdeaProjects\\Explore-Spring_Framework\\project-1\\src\\main\\resources\\SpringConstructorConfig.xml");

         CartItems cart1=(CartItems) container.getBean("cart1");
        System.out.println("First Constructor calling......");
        System.out.println(cart1.getItemNames());
        System.out.println("\n");


        CartItems cart2=(CartItems) container.getBean("cart2");
        System.out.println("Second Constructor calling......");
        System.out.println(cart2.getName());
        System.out.println("\n");


        CartItems cart3=(CartItems) container.getBean("cart3");
        System.out.println("Third Constructor calling......");
        System.out.println(cart3.getName());
        System.out.println(cart3.getItemNames());
        System.out.println("\n");


        CartItems cart4=(CartItems) container.getBean("cart4");
        System.out.println("Fourth Constructor calling......");
        System.out.println(cart4.getName());
        System.out.println(cart4.getItemNames());
        System.out.println("\n");


        CartItems cart5=(CartItems) container.getBean("cart5");
        System.out.println("Fifth Constructor calling......");
        System.out.println(cart5.getName());
        System.out.println(cart5.getItemNames());
        System.out.println(cart5.getItemPrice());
        System.out.println("\n");



        Order o1= (Order) container.getBean("order1");
        System.out.println(o1.getEmailId());
        System.out.println(o1.getCartItems());
        System.out.println("\n");

        System.out.println(o1.getCartItems().getName());
        System.out.println(o1.getCartItems().getItemPrice());
        System.out.println(o1.getCartItems().getItemNames());




    }
}

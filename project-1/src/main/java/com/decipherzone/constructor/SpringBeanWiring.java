package com.decipherzone.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.FileSystemXmlApplicationContext;


// For CartItems,Order,ProductWiring this is main class
// and SpringConstructorProductWiring.xml file is used for configuration of all of these

public class SpringBeanWiring {
    public static void main(String[] args) {

//        spring IOC container object is created with this line below
        ApplicationContext container= new FileSystemXmlApplicationContext("C:\\Users\\Dinesh Choudhary\\IdeaProjects\\Explore-Spring_Framework\\project-1\\src\\main\\resources\\SpringConstructorProductWiring.xml");


//        ProductWiring p1= (ProductWiring) container.getBean("product1");
//        System.out.println(p1);
//        System.out.println(p1.getId());
//        System.out.println(p1.getName());
//        System.out.println(p1.getPrice());



// here we can get any value from CartItems,Order,ProductWiring class
// with the help of Bean wiring
        Order order= (Order) container.getBean("order1");
        System.out.println("\n" +order);
        System.out.println("\n" +order.getClass());
        System.out.println("Order class variable Email Id is: " +order.getEmailId());
// Removed toString from CartItems so there is hash value for below
        System.out.println("Hash value of CartItems class:" + order.getCartItems());
        System.out.println("\n");
        System.out.println(order.getCartItems().getClass());
        System.out.println(order.getCartItems().getName());
        System.out.println(order.getCartItems().getItemNames());
        System.out.println(order.getCartItems().getItemPrice());
        System.out.println("\n");
        System.out.println(order.getCartItems().getProductWiring().getClass());
        System.out.println("Product Id is :"  +order.getCartItems().getProductWiring().getId());
        System.out.println("Product Name is :" +order.getCartItems().getProductWiring().getName());
        System.out.println("Product Price is :" +order.getCartItems().getProductWiring().getPrice());





    }
}
// Bean Wiring is achieved through "ref" tag in xml file by connecting one bean ot other  and so on .
// This all is done manually i.e. through xml file we did all the configuration.
// But we can do this automatically with the help of @AutoWired annotation .
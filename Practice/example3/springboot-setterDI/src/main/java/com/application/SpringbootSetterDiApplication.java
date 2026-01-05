package com.application;

import com.application.delivery.Order;
import com.application.delivery.OrderDelivery;
import com.application.delivery.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootSetterDiApplication {

	public static void main(String[] args) {

       ConfigurableApplicationContext container= SpringApplication.run(SpringbootSetterDiApplication.class, args);

/*       Order order1= container.getBean("order", Order.class);

        System.out.println(order1.getClass());
        System.out.println(order1);
        System.out.println("\n");

        System.out.println(order1.getProduct().getClass());
        System.out.println(order1.getProduct());
        System.out.println("\n");

        System.out.println(order1.getProduct().getName());
        System.out.println(order1.getProduct().getProductId());
        System.out.println(order1.getProduct().getPrice());
        */

        OrderDelivery delivery = container.getBean("orderDelivery", OrderDelivery.class);
        delivery.setDeliveryId(100);
        delivery.setDeliveryPersonName("Chrlie chaplin");



        System.out.println(delivery.getClass());
        System.out.println("Delivery person name is:" + delivery.getDeliveryPersonName());
        System.out.println("Delivery person id is:" + delivery.getDeliveryId());
        System.out.println("\n");

        System.out.println(delivery.getOrder().getClass());
        Order order = delivery.getOrder();
        order.setOrderId(10);
        order.setNoOfItems(1000);
        order.setEmailId("abc.gmail.com");
        System.out.println("Order id is :" + delivery.getOrder().getOrderId());
        System.out.println("No of items present :" + delivery.getOrder().getNoOfItems());
        System.out.println("Mail Id for any query " + delivery.getOrder().getEmailId());
        System.out.println("\n");

        System.out.println(delivery.getOrder().getProduct().getClass());
        Product product1 = delivery.getOrder().getProduct();
//        product1.setProductId(1);
        product1.setName("Hard disk");
        product1.setPrice(3500);

        System.out.println("Product Id :" + delivery.getOrder().getProduct().getProductId());
        System.out.println("Product Name:" + delivery.getOrder().getProduct().getName());
        System.out.println("Product "+delivery.getOrder().getProduct().getName()+" Price is:" + delivery.getOrder().getProduct().getPrice());
        System.out.println("\n");
        System.out.println("Total Amount of order is :" + delivery.showTotalAmount());
    }

}







/* Important Note:--> when project is not showing to mark the folder as source root or resource root or when we
   ===============    don't get option of creation of a new  java class or package when right click in src/main/java
 folder then just check pom.xml file is loaded or not correctly means maven didn't recognizing this
 as a maven project because maven is unable to find pom file in the project which we created or opened
 so just right click on maven icon and there is + sign click it then locate the pom file of that project
 then all the project is maven upgraded and all options of java class, resource root , source root are visisble */


/*Important Note==>   If we have different packages then all should be under base package which we define when we
create spring boot project from spring.io.starter that package name should remain same i mean don't refractor it
or rename the base package otherwise it will not recognise other package classes and don't create their objects
In order to create objects of those package we can provide @ComponentScan annotation in main springboot application
and provide name of those packages in this @ComponentScan like we did here*/
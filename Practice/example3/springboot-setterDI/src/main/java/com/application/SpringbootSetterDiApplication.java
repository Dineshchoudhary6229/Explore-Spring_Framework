package com.application;

import com.application.delivery.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootSetterDiApplication {

	public static void main(String[] args) {

       ConfigurableApplicationContext container= SpringApplication.run(SpringbootSetterDiApplication.class, args);

       Order order1= container.getBean("order", Order.class);

        System.out.println(order1.getClass());
        System.out.println(order1);

        System.out.println(order1.getProduct().getClass());
        System.out.println(order1.getProduct());
        System.out.println(order1.getProduct().getName());
        System.out.println(order1.getProduct().getProductId());
        System.out.println(order1.getProduct().getPrice());
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
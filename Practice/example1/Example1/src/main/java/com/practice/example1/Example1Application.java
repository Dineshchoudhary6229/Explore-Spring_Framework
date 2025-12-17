
package com.practice.example1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Example1Application {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Example1Application.class, args);




        Customer customer1 =(Customer) context.getBean("customer");
        System.out.println(customer1);
        System.out.println(customer1.getId());
        System.out.println(customer1.getName());

        Product product1=(Product) context.getBean("product");
        System.out.println(product1);
        System.out.println(product1.getProductId());
        System.out.println(product1.getProductName());



        Order order1= (Order) context.getBean("order");
        System.out.println(order1);
        System.out.println(order1.getOrdreName());
        System.out.println(order1.getOrderId());

    }
    @Bean
    public Customer customer2(){
        System.out.println("This is second bean object of Customer :");
        return new Customer();
    }

}

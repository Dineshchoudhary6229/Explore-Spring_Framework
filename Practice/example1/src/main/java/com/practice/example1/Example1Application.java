
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




        Customer customer = (Customer) context.getBean("customer");
        Customer customer2 = (Customer) context.getBean("customer2");

        System.out.println("customer  hashcode : " + System.identityHashCode(customer));
        System.out.println("customer2 hashcode : " + System.identityHashCode(customer2));


        Product product1=(Product) context.getBean("product");
        System.out.println(product1);
        System.out.println(product1.getProductId());
        System.out.println(product1.getProductName());



        Order order1= (Order) context.getBean("order");
        System.out.println(order1);
        System.out.println(order1.getOrdreName());
        System.out.println(order1.getOrderId());

    }

// In spring boot we can define bean here along with configuration class but remember this is outside the Main method
    @Bean(name = "customer2")
    public Customer customer2(){
        System.out.println("This is second bean object of Customer :");
        return new Customer();
    }

}

package com.decipherzone.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello app started");

        // for setter injection we use these

        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student) context.getBean("student1");
        // here we did parsing(type-casting) of the object which we get from context.getBean to Student

        System.out.println(student1);
        Student student2=(Student) context.getBean("student2");
        System.out.println(student2);

    }
}

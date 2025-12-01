package com.decipherzone.beanwiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationAutoWiringByType {
    public static void main(String[] args) {

        ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\Dinesh Choudhary\\IdeaProjects\\Explore-Spring_Framework\\project-2\\src\\main\\resources\\BeanAutoWiring-ByType.xml");

        College college= (College) container.getBean("college1");

        System.out.println(college.getClass());
        System.out.println(college.getName());
        System.out.println("\n");
        System.out.println(college.getStudent1().getClass());
        System.out.println(college.getStudent1().getId());
        System.out.println(college.getStudent1().getStudentName());




    }
}

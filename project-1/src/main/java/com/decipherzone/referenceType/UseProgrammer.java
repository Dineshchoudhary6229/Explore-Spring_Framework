package com.decipherzone.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configref.xml");
       Laptop temp =(Laptop)context.getBean("laptop");
        System.out.println(temp.getCompany());
        System.out.println(temp.getNo());

        Programmer pr= (Programmer) context.getBean("progrmr");
        System.out.println(pr.getId());
        System.out.println(pr.getLapt());
        System.out.println(pr.programmerName);
        System.out.println(pr.companyName);

    }

}


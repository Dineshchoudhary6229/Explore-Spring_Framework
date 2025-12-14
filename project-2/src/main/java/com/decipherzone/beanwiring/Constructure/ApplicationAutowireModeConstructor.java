package com.decipherzone.beanwiring.Constructure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationAutowireModeConstructor {
    public static void main(String[] args) {
        ApplicationContext container= new FileSystemXmlApplicationContext("C:\\Users\\Dinesh Choudhary\\IdeaProjects\\Explore-Spring_Framework\\project-2\\src\\main\\resources\\BeanAutoWiringModeConstructor.xml");

        Hospital hospital=(Hospital)container.getBean("Hospital");

        System.out.println(hospital.getClass());
        System.out.println(hospital.getName());
        System.out.println(hospital.getDepartment());
        System.out.println(hospital.getPatient().getClass());
        System.out.println(hospital.getPatient().getId());
        System.out.println(hospital.getPatient().getPatientName());
        System.out.println(hospital.getPatient().getMobileNo());

    }
}

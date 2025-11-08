//ManyToMany mapping
package com.decipherzone.mapping.ManytoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainAPP {
    public static void main(String[] args) throws IOException {


        SessionFactory factory = new Configuration().configure("Hibernate-ManytoMany.cfg.xml").buildSessionFactory();


        Employee e1= new Employee();
        Employee e2= new Employee();

        e1.seteId(10);
        e1.setName("Gautam");

        e2.seteId(11);
        e2.setName("Srikant");

        Project p1= new Project();
        Project p2= new Project();
        Project p3= new Project();

        p1.setpId(100);
        p1.setProjectName("Student Management System");

        p2.setpId(200);
        p2.setProjectName("Library Management System");

        p3.setpId(300);
        p3.setProjectName("Banking Management System");

        List<Employee> list1= new ArrayList<>();
        List<Project>  list2= new ArrayList<>();

        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);
        list2.add(p3);

// setting project of employee e1
        e1.setProjects(list2);

// setting employee on project p2
        p2.setEmps(list1);





        Session session = factory.openSession();
        session.beginTransaction();


        session.persist(e1);
        session.persist(e2);
        session.persist(p1);
        session.persist(p2);
        session.persist(p3);


        session.getTransaction().commit();
        session.close();
        factory.close();


        System.out.println("Code checked , all working😊😎");


    }

}

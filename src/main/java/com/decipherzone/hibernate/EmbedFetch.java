package com.decipherzone.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbedFetch {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student1 = new Student();
        student1.setName("Deepak");
        student1.setCity("Banglore");

        student1.setCertificate(new Certificate("Java",6));


        Session session= factory.openSession();
        session.beginTransaction();
        session.persist(student1);
        session.getTransaction().commit();


        System.out.println("All code is perfectly correct.....😎😊");








    }

}

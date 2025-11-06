package com.decipherzone.hibernate;
import com.decipherzone.hibernate.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.function.Consumer;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Spring Hibernate with Postgres sql starting now....😊️");

        // Load configuration and create SessionFactory
        Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Create student object
        Student student = new Student();
        student.setName("Yash");
        student.setCity("Delhi");


        //Creating Address object
        Address ad = new Address();
        ad.setStreet("Street1");
        ad.setCity("Jaipur");
        ad.setOpen(true);
        ad.setX(12.123);
        ad.setAddedDate(new Date());



        //Reading image
        FileInputStream file= new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[file.available()];
        file.read(data);
        ad.setImage(data);

        // To Save student
        Session session = factory.openSession();
        session.beginTransaction();     // when we want to save any data then we use it
        session.persist(student);      // it save the Student object student
        session.persist(ad);           // it save address object ad
        session.getTransaction().commit(); // commiting session

        System.out.println(factory.isClosed()); // check weather connection is closed or open


        System.out.println("Done , Hibernate is working fine");


    }
}

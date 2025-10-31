package com.decipherzone.spring.jdbc;

import com.decipherzone.spring.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App {

    public static void main(String[] args) {

        System.out.println("Application working fine...........");

// spring jdbc= JDBCTemplate

//        ApplicationContext context=
//                new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);

        StudentDao child = context.getBean("child", StudentDao.class);

        //INSERT
//        Student student = new Student();
//        student.setId(4);
//        student.setName("Manish");
//        student.setGrade(9);
//        student.setCity("Delhi");
//
//        int result = child.insert(student);
//        System.out.println("Record inserted :" + result);

        //UPDATE
//        Student student= new Student();
//        student.setId(1);
//        student.setName("Ajay");
//        student.setGrade(12);
//        student.setCity("Indore");
//        int result = child.change(student);
//        System.out.println("Student Record updated "+ result);

         //DELETE
//        int result= child.delete(1);
//        System.out.println("Student record deleted :" +result );



           // RETRIEVE OPERATION FOR SINGLE STUDENT OR OBJECT
                                                                     //here we use that retrieveStudent method from StudentDao interface to StudentDaoChild
//        Student student1 = child.retrieveStudent(3);
//        System.out.println(student1);


    // RETRIEVE OPERATION FOR ALL STUDENTS OR MULTIPLE OBJECTS
        List<Student> allStudents = child.getAllStudents();
                                                            // to travrse list of student or list we use for each loop
                                                            // we can use for loop also to traverse all elements of a list
        for(Student s:allStudents){
            System.out.println(s);
        }

    }

}

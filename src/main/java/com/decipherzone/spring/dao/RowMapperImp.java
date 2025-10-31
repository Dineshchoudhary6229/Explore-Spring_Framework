package com.decipherzone.spring.dao;

import com.decipherzone.spring.jdbc.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper<Student> {

              // this is default method of RowMapper which we use
              //after public we provided Student so that it return the student object that is
              // here we have to provide the name of class whose object we want to print/return

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student1= new Student();

           //created Student class object to retrieve it's column with the help of ResultSet rs
           // basically here in below we retrieve data with the help of rs and put in student object
           // that student object we return so we get the student data

        student1.setId(rs.getInt(4));
        student1.setName(rs.getString(1));
        student1.setGrade(rs.getInt(2));
        student1.setCity(rs.getString(3));

          // returned the student1 object that will give use column of student table

        return student1;
    }
    // now this RowMapperImp's object we pass to StudentDaoChild
}

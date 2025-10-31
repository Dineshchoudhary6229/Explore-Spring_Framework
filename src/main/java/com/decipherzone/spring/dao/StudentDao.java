package com.decipherzone.spring.dao;

import com.decipherzone.spring.jdbc.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);
    public int change(Student student);  // for update
    public int delete(int studentId);

                           // to retrieve operation we use this method which return studentId
                           // we do it's implementation in StudentDaoChild
   public Student retrieveStudent(int studentId);


   // to retrieve multiple or all students data from student
   public List<Student> getAllStudents();

}


package com.decipherzone.spring.dao;

import com.decipherzone.spring.jdbc.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoChild implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override// for insert data
    public int insert(Student student) {
        //inset query now
        String query = "INSERT INTO student(id,name,grade,city) values(?,?,?,?)";
        int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getGrade(), student.getCity());
        return r;
    }

    @Override//for update data
    public int change(Student student) {
        String query = "update student set name=? , grade=? , city=? where id=?";
        int r = this.jdbcTemplate.update(query, student.getName(), student.getGrade(), student.getCity(), student.getId());
        return r;
    }

    @Override  // for deleting data with id
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        int r = this.jdbcTemplate.update(query, studentId);
        return r;

    }

    //for retrieving student data with student id
    @Override
    public Student retrieveStudent(int studentId) {
        String query = "SELECT * FROM student where id=?";

        //here we make object of RowMapperImp and implemented here which we mentioned in the
        // last of RowMapperImp class and pass this rowMapper object in queryForObject
       RowMapper<Student> rowMapper =new RowMapperImp();
                 // FOR SINGLE STUDENT OR OBJECT WE  USE queryForObject
       Student student1= this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student1;
    } // we use this retrieveStudent method in our App.java class to retrieve student column




// to retrieve all students data from student we use query method of jdbc template
    @Override
    public List<Student> getAllStudents() {
        String query= "SELECT * FROM student";
                        // FOR ALL STUDENTS OR MULTIPLE OBJECTS WE USE query method
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImp());
        return students;
    }

    }









//    Note-
//  we can remove RowmapperImp class and can create annonymous class like this in above code
//by replacing above code with this below code.
/*
Student student = (Student) this.jdbcTemplate.queryForObject(query, new RowMapper() {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student1 = new Student();
        student1.setId(rs.getInt(4));
        student1.setName(rs.getString(1));
        student1.setGrade(rs.getInt(2));
        student1.setCity(rs.getString(3));

        return student1;
    }
},studentId);
        return student;
*/
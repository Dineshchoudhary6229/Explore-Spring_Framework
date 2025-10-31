package com.decipherzone.spring.jdbc;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String city;

    public Student( String name, int grade, String city) {
        this.name = name;
        this.grade = grade;
        this.city = city;
    }
    public Student() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", city='" + city + '\'' +
                '}';
    }
}

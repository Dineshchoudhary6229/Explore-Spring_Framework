package com.decipherzone.hibernate;

import jakarta.persistence.*;

@Entity                           // create table of this class student with @Entity annotation
@Table(name = "student")         // provide name of table with this
public class Student {

    @Id                           // make primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // auto increment value of this
    private int id;

    @Column(name = "Name")           // make column with Name in data base
    private String name;

    @Column(name = "city")
    private String city;

    @Embedded              // this embedded certificate class here
    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Student() {}

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // getters and setters to set and to retrieve  student data from and to database

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}

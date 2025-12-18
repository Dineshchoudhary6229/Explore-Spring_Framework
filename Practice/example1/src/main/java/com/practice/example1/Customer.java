package com.practice.example1;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private int id;


    public Customer(){
        System.out.println("Customer object is created:");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

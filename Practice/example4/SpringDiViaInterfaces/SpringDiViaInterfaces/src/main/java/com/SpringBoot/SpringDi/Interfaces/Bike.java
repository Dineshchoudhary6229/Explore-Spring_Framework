package com.SpringBoot.SpringDi.Interfaces;

import org.springframework.stereotype.Component;

public class Bike implements Vehicle{
    public Bike() {
        System.out.println("This is Bike constructor :");
    }

    @Override
    public String vechileType() {
        return "This is Bike";
    }

    @Override
    public String vehicleCompany() {
        return "Honda";
    }

    @Override
    public String vehiclePrice() {
        return "75000";
    }
}

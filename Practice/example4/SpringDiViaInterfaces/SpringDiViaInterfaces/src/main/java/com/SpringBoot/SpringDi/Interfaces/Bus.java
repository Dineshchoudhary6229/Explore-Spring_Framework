package com.SpringBoot.SpringDi.Interfaces;

import org.springframework.stereotype.Component;

public class Bus implements Vehicle{

    public Bus() {
        System.out.println("This is Bus constructor :");
    }

    @Override
    public String vechileType() {
        return "This is Bus";
    }

    @Override
    public String vehicleCompany() {
        return "Mahindra";
    }

    @Override
    public String vehiclePrice() {
        return "2200000";
    }
}

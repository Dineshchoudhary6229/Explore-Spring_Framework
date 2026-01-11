package com.SpringBoot.SpringDi.Interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garrage {
// @Autowired                                   // field DI via interface
 private  Vehicle vehicle;

    public Garrage() {
    }

    @Autowired                            // constructor DI via interfaces
    public Garrage(@Qualifier("car2")Vehicle vehicle){
        this.vehicle= vehicle;
        System.out.println("This is parametrized constructor from Garrage class :" + vehicle.getClass());
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
//    @Qualifier("car2")
//    @Autowired                      // setter Di via interfaces
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println(vehicle.getClass());
        System.out.println("This is setter Di via interface :" + vehicle.vechileType());
    }
}

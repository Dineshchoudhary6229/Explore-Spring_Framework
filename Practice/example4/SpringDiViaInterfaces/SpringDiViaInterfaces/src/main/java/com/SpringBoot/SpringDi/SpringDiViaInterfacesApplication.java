package com.SpringBoot.SpringDi;

import com.SpringBoot.SpringDi.Interfaces.Car;
import com.SpringBoot.SpringDi.Interfaces.Garrage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiViaInterfacesApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringDiViaInterfacesApplication.class, args);

          Garrage garrage= container.getBean("garrage", Garrage.class);
        System.out.println(garrage.getVehicle());
        System.out.println();

        System.out.println(garrage.getVehicle().vechileType());
        System.out.println(garrage.getVehicle().vehicleCompany());
        System.out.println(garrage.getVehicle().vehiclePrice());

// If we want to give property value of Car class then we have to provide @Component annotation on it and
//then provide @Value annotation on that property or field of car class then in application.properties
// file we provide value of that property and spring fetch that value to that field or property in @Value
// annotation and we can get it like this here .

        Car car= (Car) garrage.getVehicle();
        System.out.println(car.getCompanyAddress());
        System.out.println(car.getCompanyEmail());

        // if we want the same thing for other class like bus , bike then we have to follow the above first.


    }

}

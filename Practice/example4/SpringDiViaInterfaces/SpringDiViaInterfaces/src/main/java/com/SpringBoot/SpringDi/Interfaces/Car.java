package com.SpringBoot.SpringDi.Interfaces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Car implements Vehicle{
    @Value("${company.email}")            // it's value injected from application.properties , this is used for @value annotation
    public String companyEmail;
    @Value("${company.address}")
    public String companyAddress;


    public void  car(){
        System.out.println("This is car class ");
    }



    @Override
    public  String vechileType() {

        return "This is Car Type";
    }

    @Override
    public String vehicleCompany() {
        return "Tata";
    }

    @Override
    public String vehiclePrice() {
        return "2800000";

    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}

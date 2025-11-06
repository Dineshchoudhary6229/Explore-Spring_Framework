package com.decipherzone.hibernate;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_Id")
    private int addressId;

    @Column(length = 100 , name = "Street")
    private String street;

    @Column(length = 50 , name = "City")
    private String city;

    private boolean isOpen;

    @Transient                            // column is not created in DataBase, and it's value doesn't store in database
    private double x;

    @Column(name = "Added_Date")
    @Temporal(TemporalType.DATE)         // only Date is added not time
    private Date addedDate;

    @Lob                       // means it is a large object
    @Column(name = "Image")
    @org.hibernate.annotations.JdbcTypeCode(java.sql.Types.BINARY)
    private byte[] image;

    public Address() {
    }

    public Address( String street, String city, boolean isOpen, Date addedDate, byte[] image) {
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.addedDate = addedDate;
        this.image = image;
    }

    public Address(String street1, String delhi) {
    }


    // getter and setter of all

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}

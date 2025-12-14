package com.decipherzone.beanwiring.Constructure;

public class Patient {
    private int id;
    private String patientName;
    private int mobileNo;

    public Patient() {
        System.out.println("This is default Constructor");
    }

    public Patient(int id, String patientName, int mobileNo) {
        this.id = id;
        this.patientName = patientName;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }
}

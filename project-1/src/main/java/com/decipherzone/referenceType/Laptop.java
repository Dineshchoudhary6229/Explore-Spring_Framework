package com.decipherzone.referenceType;

public class Laptop {
    private String company;
    private int no;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + company + '\'' +
                ", no=" + no +
                '}';

    }
}

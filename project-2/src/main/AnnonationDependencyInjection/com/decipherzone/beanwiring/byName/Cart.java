package com.decipherzone.beanwiring.byName;

public class Cart {
    private int noOfIteams;
    private Product product1;
    private Product product2;
    private Information information;


    public int getNoOfIteams() {
        return noOfIteams;
    }

    public void setNoOfIteams(int noOfIteams) {
        this.noOfIteams = noOfIteams;
    }

    public Product getProduct1() {
        return product1;
    }

    public void setProduct1(Product product1) {
        this.product1 = product1;
    }

    public Product getProduct2() {
        return product2;
    }

    public void setProduct2(Product product2) {
        this.product2 = product2;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
}


// as there is no constructor so autowire access object with setter injection only internally.
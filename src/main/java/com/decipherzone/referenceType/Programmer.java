package com.decipherzone.referenceType;

public class Programmer  {
    public String programmerName;
    public String companyName;
    private int Id;
    private Laptop lapt;   // provided ref of Laptop here

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public void setLapt(Laptop lapt) {
        this.lapt = lapt;
    }

    public Laptop getLapt() {
        return lapt;
    }
    // constructor for constructor injection
    public  Programmer(String programmerName , String companyName)
    {
        this.programmerName=programmerName;
        this.companyName =companyName;
        System.out.println("Constructor of String , String ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + programmerName + '\'' +
                ", no=" + companyName + "\n"+
                ", Id=" + Id +
                ", lapt=" + lapt +
                '}';
    }
}
/* to solve ambiguity problem we use annotation , index and type in xml file for constructor injection
so that this problem doesn't arise */

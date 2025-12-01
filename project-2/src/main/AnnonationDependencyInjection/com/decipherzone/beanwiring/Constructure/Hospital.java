package com.decipherzone.beanwiring.Constructure;

public class Hospital {
    private String name;
    private String department;
    private Patient patient;


    // for Autowire= "constructor" we must have a constructor with the bean object type
    // i.e. constructor must have arg Patient patient type
    public Hospital(Patient p1) {
        this.patient = p1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Patient getPatient() {
        return patient;
    }

//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
}
/*If we remove setter then there is no impact in autowire="constructor"
Because it only need constructor with the object type arg .
-->> Constructor existed with dependency type argument or not i.e. Patient
   1 not found--> no Dependency Injection(DI)
   2 found-->container checks is there any bean object with Patient type or not?
      (a)   if there is 1 bean: Patient p1-->Injecting 1 bean in Hospital Bean Object
      (b)   if there are 2 or more bean: Patient p1 and Patient p2 then DI fail:Exception
               :Ambiguity : patient1 , patient2
---> If one of the bean Id is same as constructor argument name then it will inject that
     bean irrespective of there are 2 , 3 or more bean with same type Patient available
           example: bean id are:   patient1
                                   patient2
                                   patient3
                                   p1
          and constructor with as    Hospital(Patient p1) {}
          then the SFW Container will inject the dependency successfully.                        */
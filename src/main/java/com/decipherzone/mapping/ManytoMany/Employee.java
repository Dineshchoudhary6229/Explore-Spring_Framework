// ManytoMany mapping
package com.decipherzone.mapping.ManytoMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Employee {
    @Id
    @Column(name="Employee_Id")
    private  int eId;

    @Column(name="Employee_Name")
    private String name;

    @ManyToMany
    private List<Project> projects;



    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Employee(int eId, String name, List<Project> projects) {
        this.eId = eId;
        this.name = name;
        this.projects = projects;
    }

    public Employee() {
    }
}

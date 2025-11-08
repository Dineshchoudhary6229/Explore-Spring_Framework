package com.decipherzone.mapping.ManytoMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {
    @Id
    @Column(name="Project_Id")
    private int pId;

    @Column(name="Project_Name")
    private String projectName;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> Emps;



    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmps() {
        return Emps;
    }

    public void setEmps(List<Employee> emps) {
        Emps = emps;
    }

    public Project(int pId, String projectName, List<Employee> emps) {
        this.pId = pId;
        this.projectName = projectName;
        Emps = emps;
    }

    public Project() {
    }
}

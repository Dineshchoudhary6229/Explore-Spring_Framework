package com.decipherzone.beanwiring.byType;

public class Student {
    private  int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





// Auto Wiring -->
// 3 ByType--> based on property type of dependency class , autowiring will happen
//           -->property type = Data type of variable of that class
//         --> Spring container will identify a bean object of dependency based on
//             Property Data type is matching with bean Type of dependency object
//             is present or not in container
package com.decipherzone.beanwiring.byType;

public class Student {
    private  int id;
    private String studentName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }
}





// Auto Wiring -->
// 3 ByType--> based on property type of dependency class , autowiring will happen
//           -->property type = Data type of variable of that class
//         --> Spring container will identify a bean object of dependency based on
//             Property Data type is matching with bean Type of dependency object
//             is present or not in container
/*   Internally--> Taking dependency Object Type i.e. Class Name =Student here
Is there any bean object available in container with data type of Student?
100% Data Type
0% property name/ bean id
For all this ByType uses setter method to inject

--> If we want more than 1 bean with same type i.e. like Student type student1, student2
then we can't achieve this with autowire=byType,and get following exception
=======NoUniqueBeanDefinitionException======
 we use autowire=byName for this situation
 */
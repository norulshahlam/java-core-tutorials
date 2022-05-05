package com.shah.javacoretutorials.intermediate.encapsulation;

import com.shah.javacoretutorials.model.Student;
import org.junit.jupiter.api.Test;

/*
Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −

a) Declare the member variables of the class as private.
b) Provide public setter and getter methods to modify and view the variables values.
c) we can achieve b) by using @Lombok
*/
class RunMe {
    @Test
    void test() {
        Student A = new Student();
        A.setRollNo(21);
        A.setName("bob");

        System.out.println("Student A details: Name: " + A.getName() + ", age: " + A.getRollNo());
    }
}

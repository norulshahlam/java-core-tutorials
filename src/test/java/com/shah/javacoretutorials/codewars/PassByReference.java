package com.shah.javacoretutorials.codewars;

import com.shah.javacoretutorials.model.Student;
import org.junit.jupiter.api.Test;

public class PassByReference {

    /**
     * Demo that java pass object by reference, not by value.
     * If we pass an object reference to a method as argument, and within the method if we are performing any changes to the state of object, those changes will be reflected to the caller. In this case just duplicate reference variable will be created but not duplicate object.
     * <a href="https://www.youtube.com/watch?v=7IkpIQc8OCw">...</a>
     */
    @Test
    void passByReference() {
        Student student = new Student(1, "adam", 99);
        System.out.println("Before changes: " + student);
        changeName(student);
        System.out.println("After changes: " + student);
    }

    public void changeName(Student student) {
        student.setName("bob");
    }

    @Test
    void question1a() {
        String a = "s";
        System.out.println("Before changes: " + a);
        changeValue(a);
        System.out.println("After changes: " + a);
    }

    public void changeValue(String a) {
        a = "t";
    }

    /**
     * If we pass any primitive to a method as argument, and within the method if we are performing any changes to the primitive value, those changes won't be reflected to the caller. In this case duplicate copy of that primitive value will be maintained.
     */
    @Test
    void passByValue() {
        int a = 2;
        System.out.println("Before changes: " + a);
        changeValue(a);
        System.out.println("After changes: " + a);
    }

    public void changeValue(int a) {
        a = 3;
    }

    class Parent {
        int x = 10;

        void printMe() {
            System.out.println("parent class");
        }
    }

    class Child extends Parent {
        int x = 20;

        @Override
        void printMe() {
            System.out.println("child class");
        }
    }

    @Test
    void TestMe() {
        Parent p = new Child();

        /** Variable resolution is always based on reference type but not based on runtime object. We used Parent reference and hence we will get 10. **/
        System.out.println(p.x);

        /** In overriding method resolution is always based on runtime object. Hence, child class method will be executed. **/
        p.printMe();
    }
}

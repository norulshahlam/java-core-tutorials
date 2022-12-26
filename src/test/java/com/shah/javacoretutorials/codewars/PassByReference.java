package com.shah.javacoretutorials.codewars;

import com.shah.javacoretutorials.model.Student;
import org.junit.jupiter.api.Test;

public class LawAcademyInterview {

    /**
     * Demo that java pass object by reference, not by value.
     * If we pass an object reference to a method as argument, and within the method if we are performing any changes to the state of object, those changes will be reflected to the caller. In this case just duplicate reference variable will be created but not duplicate object.
     */
    @Test
    void question1() {
        Student student = new Student(1, "adam", 99);
        System.out.println("Before changes: " + student);
        changeIt(student);
        System.out.println("After changes: " + student);
    }

    public void changeIt(Student student) {
        student.setName("bob");
    }

    @Test
    void question1a() {
        String a = "2";
        System.out.println("Before changes: " + a);
        changeIt(a);
        System.out.println("After changes: " + a);
    }
    public void changeIt(String a) {
        a = "3";
    }

    /**
     * If we pass any primitive to a method as argument, and within the method if we are performing any changes to the primitive value, those changes won't be reflected to the caller. In this case duplicate copy of that primitive value will be maintained.
     */
    @Test
    void question1b() {
        int a = 2;
        System.out.println("Before changes: " + a);
        changeIt(a);
        System.out.println("After changes: " + a);
    }
    public void changeIt(int a) {
        a = 3;
    }

    @Test
    void question3() {
        /*
        Hash any string using any encoder
         */
        String password = "apple";
//        System.out.println(password.hashCode());
//        System.out.println( password.charAt(0));
        int c = Character.compare(password.charAt(0), 'c');
    }

    @Test
    void coderByte() {
    }

    public static String SearchingChallenge(String str) {

        int leftBracket = 0;
        int rightBracket = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.compare(str.charAt(i), '(') == 0)
                leftBracket++;
            if (str.charAt(i) == ')')
                rightBracket++;
        }
        System.out.println(leftBracket + " " + rightBracket);
        if (leftBracket == rightBracket)
            return "1";
        else
            return "0";
    }

    class Parent {
        int x = 10;
        void printMe(){
            System.out.println("parent class");
        }
    }

    class Child extends Parent {
        int x = 20;
        void printMe(){
            System.out.println("child class");
        }
    }

    @Test
    void TestMe() {
        Parent p = new Child();
        /* Variable resolution is always based on reference type but not based on runtime object. We used Parent reference and hence we will get 10. */
        System.out.println(p.x);
        /* In overriding method resolution is always based on runtime object. Hence child class method will be executed. */
        p.printMe();
    }
}
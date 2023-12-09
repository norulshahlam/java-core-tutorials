package com.shah.javacoretutorials.tutorials.intermediate;

import org.junit.jupiter.api.Test;

/*
Local vs instance variables

Instance variables − Instance variables are declared in a class, but outside a method. When space is allocated for an object in the heap, a slot for each instance variable value is created. Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.

Local variables − Local variables are declared in methods, constructors, or blocks. Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.

Https://www.tutorialspoint.com/java/java_variable_types.htm
*/
class InstanceLocalVariable {

    // Here i is an Instance variable.
    int i;

    @Test
    void test() {
        Student student = new Student();
        System.out.println(student.name);
        student.printName();
    }
}

@SuppressWarnings("unused")
class Student {
    // this instance variable (or global variable) is visible for any child class.
    String name = "defaultname";

    public void printName() {
        // Here, age is a local variable. This is defined inside this method, and its scope is limited to only this method.
        int age = 21;
        System.out.println("student name is: " + name);
    }
}
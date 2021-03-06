package com.shah.javacoretutorials.intermediate.instanceLocalVariable;

import org.junit.jupiter.api.Test;

/*
local vs instance variables

instance variables − Instance variables are declared in a class, but outside a method. When space is allocated for an object in the heap, a slot for each instance variable value is created. Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.

Local variables − Local variables are declared in methods, constructors, or blocks. Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.

https://www.tutorialspoint.com/java/java_variable_types.htm
*/
class IntroOne {
    @Test
    void test() {

        Student A = new Student();
        System.out.println(A.name);
        A.printName();
    }
}

@SuppressWarnings("unused")
class Student {
    // this instance variable (or global variable) is visible for any child class.
    String name = "defaultname";

    public void printName() {
        // Here, age is a local variable. This is defined inside this method and its scope is limited to only this method.
        int age = 21;
        System.out.println("student name is: " + name);
    }
}
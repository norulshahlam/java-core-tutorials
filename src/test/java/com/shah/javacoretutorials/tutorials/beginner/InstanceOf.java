package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

/*
instanceof operator is good programming practice to find out whether a cast will succeed before attempting it.
*/
class Parent {}
class Child extends Parent {}

class intro1 {
    @Test
    void test() {
        Child child = new Child();
        // A simple case
        System.out.println(child instanceof Child);
        // returns true for Parent class also
        System.out.println(child instanceof Parent);
        // returns true for all ancestors (Note : object is ancestor of all classes in Java)
        System.out.println(child instanceof Object);
        System.out.println("**********************");
        Parent parent = new Parent();
        System.out.println(parent instanceof Child);
        System.out.println(parent instanceof Parent);
        System.out.println(parent instanceof Object);

    }
}
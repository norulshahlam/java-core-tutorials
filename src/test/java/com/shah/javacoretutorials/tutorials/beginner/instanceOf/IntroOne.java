package com.shah.javacoretutorials.tutorials.beginner.instanceOf;

import org.junit.jupiter.api.Test;

/*
instanceof operator is good programming practice to find out whether a cast will succeed before attempting it.
*/
class Parent {}
class Child extends Parent {}

class intro1 {
    @Test
    void test() {
        Child c = new Child();
        // A simple case
        System.out.println(c instanceof Child);
        // returns true for Parent class also
        System.out.println(c instanceof Parent);
        // returns true for all ancestors (Note : object is ancestor of all classes in Java)
        System.out.println(c instanceof Object);
        System.out.println("**********************");
        Parent p = new Parent();
        System.out.println(p instanceof Child);
        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Object);

    }
}
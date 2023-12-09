package com.shah.javacoretutorials.tutorials.beginnerImpt;

import org.junit.jupiter.api.Test;

/*
The super keyword in java is a reference variable used to refer parent class objects.
The keyword “super” came into the picture with the concept of Inheritance.

If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.

In this case, if you create an object of child class, the parent class constructor will be called first.
 */
class SuperKeyword2 {
    @SuppressWarnings("unused")
    @Test
    void test() {
        // run this test to see which constructor gets called first
        Daughter d = new Daughter();
    }
    @Test
    void test2() {
        // run this test to see which constructor gets called first
        Daughter d = new Daughter(2);
    }
    @Test
    void test3() {
        // run this test to see which constructor gets called first
        Mother d = new Mother(2);
    }
}

class Mother {
    public Mother() {
        // by default there is super() here
        System.out.println("from Mother");
    }

    public Mother(int c) {
        // by default there is super() here
        System.out.println("from para Mother: " + c);
    }
}

class Daughter extends Mother {
    public Daughter() {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from Daughter");
    }

    public Daughter(int d) {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from para Daughter: " + d);
    }
}
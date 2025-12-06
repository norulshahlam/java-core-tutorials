package com.shah.javacoretutorials.tutorials.beginnerImpt;

import org.junit.jupiter.api.Test;

/**
 * The super keyword in java is a reference variable used to refer parent class objects.
 * The keyword “super” came into the picture with the concept of Inheritance.
 * If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
 * In this case, if you create an object of child class, the parent class constructor will be called first.
 */
@SuppressWarnings("ALL")
class SuperKeyword2 {

    @Test
    void test1() {
        // run this test to see which constructor gets called first
        Father d = new Father(2);
    }

    @Test
    void test2() {
        // run this test to see which constructor gets called first
        Son d = new Son();
    }

    @Test
    void test3() {
        // run this test to see which constructor gets called first
        GrandSon d = new GrandSon();
    }

    @Test
    void test4() {
        // run this test to see which constructor gets called first
        GrandSon d = new GrandSon(2);
    }
}

class Father {
    public Father() {
        // by default there is super() here
        System.out.println("from Father");
    }

    public Father(int c) {
        // by default there is super() here
        System.out.println("from para Father: " + c);
    }
}

class Son extends Father {
    public Son() {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from Son");
    }

    public Son(int d) {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from para Son: " + d);
    }
}

class GrandSon extends Son {
    public GrandSon() {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from GrandSon");
    }

    public GrandSon(int d) {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from para GrandSon: " + d);
    }
}
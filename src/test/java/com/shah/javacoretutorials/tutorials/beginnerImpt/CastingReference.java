package com.shah.javacoretutorials.tutorials.beginnerImpt;

import org.junit.jupiter.api.Test;

/*
Casting a reference variable doesn’t touch the object it refers to, but only labels this object in another way, expanding or narrowing opportunities to work with it. Upcasting narrows the list of methods and properties available to this object, and downcasting can extend it.

A reference is like a remote control to an object. The remote control has more or fewer buttons depending on its type, and the object itself is stored in a heap. When we do casting, we change the type of the remote control but don’t change the object itself.

https://www.baeldung.com/java-type-casting
*/
class ObjectCasting {
    @Test
    void test() {

        Parent2 p1 = new Parent2(); // allowed
        Child2 c1 = new Child2(); // allowed

        // Child c2 = new Parent(); //not allowed
        Parent2 p2 = new Child2(); // upcasting
        Parent2 p3 = c1; // upcasting
        p2.parentMethod();

        // Child c3 = p2(); //not allowed for downcasting
        // Child c2 = p1(); //not allowed for downcasting

        Child2 c2 = (Child2) p2; // allowed as reference is base, and object is derived
        // Child d5 = (Child) p1; //java.lang.ClassCastException

        p1.parentMethod();
        // p1.childMethod(); //not allowed as childMethod is from child

        c1.parentMethod(); // ok
        c1.childMethod();// ok

        p3.parentMethod();// ok
        // p3.childMethod(); //not allowed as childMethod is from child

        c2.parentMethod();// ok
        c2.childMethod();// ok
    }
}

class Parent2 {
    public Parent2() {
        System.out.println("constructor in base class");
    }

    public void parentMethod() {
        System.out.println("parentMethod in base class");
    }
}

class Child2 extends Parent2 {
    public Child2() {
        System.out.println("constructor in derived class");
    }

    public void childMethod() {
        System.out.println("childMethod in derived class");
    }

}
package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

/*
The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form. We show here that method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both.

Overloading is related to compile-time (or static) polymorphism.
 POLYMORPHISM - same method name diff behavior
overloading - compile-time polymorphism - same method name, diff behavior, same class
overriding - runtime polymorphism - same method name, same behavior, diff class

Method overriding happens when there is the same method name from child and parent class, so the compiler will override parent's method in favor of child method.
*/
class RunMe {

    @Test
    void test() {
        Chair s = new Sofa();
        s.sit();
    }
}

class Chair {
    public void sit() {
        System.out.println("sit on Chair");
    }
}

class Sofa extends Chair {
    public void sit() {
        System.out.println("sit on Sofa");
    }
}


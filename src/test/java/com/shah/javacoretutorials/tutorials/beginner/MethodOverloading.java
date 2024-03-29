package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

/*
The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.

POLYMORPHISM - same method name diff behavior
overloading - compile-time polymorphism - same method name, diff behavior, same class
overriding - runtime polymorphism - same method name, same behavior, diff class

************************************
We show here that method Overloading allows different methods to have the same name but different signatures where the signature can differ by the number of input parameters or type of input parameters or both. Overloading is related to compile-time (or static) polymorphism.

*/
class MethodOverloading {
    @Test
    void test() {
        Calculate g = new Calculate();
        g.add(1, 1);
        g.add(1, 1, 1);
        g.add(1, 1.5);
    }
}

class Calculate {
    public void add(int i, int j) { // this method accept 2 int
        System.out.println(i + j);
    }
    public void add(int i, int j, int k) { // the same method again accepts 3 int
        System.out.println(i + j + k);
    }
    public void add(double i, double j) { // the same method again accepts 2 double
        System.out.println(i + j);
    }
}
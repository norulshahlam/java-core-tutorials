package com.shah.javacoretutorials.beginner.supers;

/*
this lesson shows 
1. how super keyword works. super is a special keyword that directs the compiler to invoke the superclass method.
2. Understand method from child can override parent method if both have same name - method overriding BUT in the case of variables, it is not overriden in sub-class.
*/

import org.junit.jupiter.api.Test;

class RunMe {

    @Test
    void test() {

        B obj = new B();
        obj.show();
    }
}
class A {
    int i = 5;
}

class B extends A {
    /* int i here override parent int i -
    Instance variables are not overriden in sub-class. If you define a variable in your class with the same name as in your super class it's called shadowing of variables inheritance, and polymorphism doesn't apply for instance variables.
    */ int i = 4;

    void show() {

        System.out.println(i);
        // if u 1 2 use var from parent class, use super keyword
        System.out.println(super.i);
    }
}

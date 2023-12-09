package com.shah.javacoretutorials.tutorials.beginnerImpt;

/*
The super keyword in Java is a reference variable which is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by 'super' reference variable

this lesson shows 
1. how super keyword works. super is a special keyword that directs the compiler to invoke the superclass method.
2. Understand method from child can override parent method if both have the same name - method overriding, BUT in the case of variables, it is not override in subclass.
*/

import org.junit.jupiter.api.Test;

class SuperKeyword1 {

    @Test
    void test() {
        D obj = new D();
        obj.show();
        obj.printstatement();
    }
}

class C {
    int i = 0;
    public void printstatement() {
        System.out.println("this is from parent class A");
    }
}

class D extends C {
    /* int i here override parent int i -
    Instance variables are not overriden in subclass. If you define a variable in your class with the same name as in your superclass, it's called shadowing of variable inheritance, and polymorphism doesn't apply for instance variables.
    */
    int i = 1;

    public void printstatement() {
        System.out.println("this is from child class B");
        super.printstatement(); // this calls the parent class method
    }

    void show() {

        System.out.println(i);
        // if u 1 2 use var from parent class, use super keyword
        System.out.println(super.i);
    }
}

package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;
/*
1. static var means variable is shared / accessible among all objects of the same class.
If any object changes that static variable, it will affect another object too.
2. Non-static (instance) variables is the opposite - has its own copy of variable aka fields/member variables

Static - class level
non-static - object level

Here we will cover static block, method, variable.
How do we use static members?
*/
class StaticBlockMethodVariable {

    @Test
    void test() {
        System.out.println("in main method");
        // this is how u call static variable
        System.out.println(StaticBlockMethodVariable.num);
        // this is how u call static method
        StaticBlockMethodVariable.method1();
    }

    static int num;

    static void method1() {
        System.out.println("Inside parentMethod");
    }

    // static block - will get called on runtime
    static {
        System.out.println("Static Block 1");
    }

    // if there are 2 static blocks, the top wil get called first
    static {
        System.out.println("Static Block 2");
    }
}

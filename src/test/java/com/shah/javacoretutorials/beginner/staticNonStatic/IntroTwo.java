package com.shah.javacoretutorials.beginner.staticNonStatic;
/*
1. static var means variable is shared / accessible among all obj of the same class. if any object changes that static variable, it will affect other object too
2. non-static (instance) variables is the opposite - has its own copy of variable aka fields/member variables

Static - class level
non-static - object level

here we will cover static block, method, variable. how do we use static members?

 */

import org.junit.jupiter.api.Test;

class IntroTwo {

    @Test
    void test() {
        System.out.println("in main method");
        // this is how u call static variable
        System.out.println(IntroTwo.num);
        // this is how u call static method
        IntroTwo.method1();
    }

    static int num;
    static void method1() {
        System.out.println("Inside method1");
    }

    // static block - will get called on runtime
    static {
        System.out.println("Static Block 1");
    }

    // if theres 2 static block, the top wil get called first
    static {
        System.out.println("Static Block 2");
    }

}

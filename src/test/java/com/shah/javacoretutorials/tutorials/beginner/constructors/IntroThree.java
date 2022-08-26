package com.shah.javacoretutorials.tutorials.beginner.constructors;
/*
alternative way to assign values in default constructor if you dont have value in the global variable.
*/

import org.junit.jupiter.api.Test;

class IntroThree {
    @Test
    void test() {

        // 1.using default constructor
        tryMe object = new tryMe();
        System.out.println(object);
    }
}
class tryMe {
    int a;  // 2. u dont assign any value here so,
    int b;

    // Default constructor
    tryMe() {
        this(10, 20); // 3. this is how u assign. note: it will also call constr with 2 params
        System.out.println("Inside default constructor" + a + b + " \n");
    }

    tryMe(int a) {
        this.a = a;
        System.out.println("Inside 1 parameterized constructor" + a + b);
    }

    tryMe(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside 2 parameterized constructor" + a + b);
    }

    @Override
    public String toString() {
        return "Test [a=" + a + ", b=" + b + "]";
    }
}


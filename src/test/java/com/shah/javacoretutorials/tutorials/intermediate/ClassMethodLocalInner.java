package com.shah.javacoretutorials.tutorials.intermediate;

import org.junit.jupiter.api.Test;

/*
We can write a class within a method and this will be a local type. Like local variables, the scope of the inner class is restricted within the method.

A method-local inner class can be instantiated only within the method where the inner class is defined.
*/
class ClassMethodLocalInner {

    @Test
    void test() {
        ClassMethodLocalInner outer = new ClassMethodLocalInner();
        outer.my_Method();
    }

    // instance method of the outer class
    void my_Method() {
        int num = 23;

        // method-local inner class
        class InnerClass {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        } // end of inner class

        // Accessing the inner class
        InnerClass inner = new InnerClass();
        inner.print();
    }


}
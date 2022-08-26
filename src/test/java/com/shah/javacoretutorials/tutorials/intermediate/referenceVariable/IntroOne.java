package com.shah.javacoretutorials.tutorials.intermediate.referenceVariable;

import org.junit.jupiter.api.Test;

/*
Understanding Reference variable 

1. Reference variable is used to point object/values.
2. Classes, interfaces, arrays, enumerations, and, annotations are reference types in Java. Reference variables hold the objects/values of reference types in Java.
3. Reference variable can also store null value. By default, if no object is passed to a reference variable then it will store a null value.
4. You can access object members using a reference variable using dot syntax.

*/
class intro1 {
    @Test
    void test() {

        /* When we create an object (instance) of class then space is reserved in heap memory. */
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        /*  Now, The space in the heap Memory is created but the question is how to access that space? Then, We create a Pointing element or simply called Reference variable which simply points out the Object(the created space in a Heap Memory).  */

        System.out.println(d1.name);
        d2.name = "lam";
        System.out.println(d2.name);
    }
}

class Demo {
    String name = "shah";
}
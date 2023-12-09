package com.shah.javacoretutorials.tutorials.intermediate;

import com.shah.javacoretutorials.model.House;
import org.junit.jupiter.api.Test;

/*
Understanding Reference variable

1. Reference variable is used to point object/values.
2. Classes, interfaces, arrays, enumerations, and annotations are reference types in Java. Reference variables hold the objects/values of reference types in Java.
3. Reference variable can also store null value. By default, if no object is passed to a reference variable, then it will store a null value.
4. You can access object members using a reference variable using dot syntax.

We show that an obj can have ref of another obj.
A change of either one of the obj properties can affect the other as they point to the same memory
we can dereference and obj - point to other obj memory
there is no way to access an obj directly - all is done using reference
*/
class ReferenceVariable {

    @Test
    void test() {
        /*
         * h2 is a reference of h1 - any change in h2/h1 affects the other
         * When we create an object (instance) of class then space is reserved in heap memory.
         */
        House green = new House("green");
        House random = green;

        System.out.println("now both are the same");

        /*  Now, The space in the heap Memory is created but the question is how to access that space? Then, We create a Pointing element or simply called Reference variable which simply points out the Object(the created space in a Heap Memory).  */

        System.out.println("green obj: " + green.getColor());
        System.out.println("random obj: " + random.getColor() + "\n");

        /* change in 1 affect the other */
        random.setColor("blue");

        System.out.println("are they still the same?");
        System.out.println("green obj: " + green.getColor());
        System.out.println("random obj: " + random.getColor() + "\n");

        /* now we create another obj */
        House pink = new House("pink");
        /* we de-reference - pointing to another obj in memory
         * now random obj point to new pink obj
         */
        random = pink;

        System.out.println("are they still the same?");
        System.out.println("pink obj: " + pink.getColor());
        System.out.println("random obj: " + random.getColor() + "\n");

    }
}

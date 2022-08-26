package com.shah.javacoretutorials.tutorials.intermediate.referenceVariable;

import com.shah.javacoretutorials.model.House;
import org.junit.jupiter.api.Test;

/*
we show that an obj can have ref of another obj.
a change of either one of the obj property can effect the ohter as they point to the same memory
we can dereference and obj - point to other obj memory
there is no way to access an obj directly - all is done using reference
*/
class intro3 {

    @Test
    void test() {
        /*
         * h2 is a reference of h1 - any change in h2/h1 affects the other
         */
        House green = new House("green");
        House random = green;


        System.out.println("now both are the same");
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
         *  */
        random = pink;

        System.out.println("are they still the same?");
        System.out.println("pink obj: " + pink.getColor());
        System.out.println("random obj: " + random.getColor() + "\n");

    }
}

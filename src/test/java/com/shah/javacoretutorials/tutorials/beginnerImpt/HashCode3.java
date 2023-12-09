package com.shah.javacoretutorials.tutorials.beginnerImpt;

/*

hashCode() vs .equals()

A hash code is an integer derived from an object. Hash codes should be scrambled—if x and y are two distinct objects, there should be a high probability that x.hashCode() and y.hashCode() are different

Importance of equals() and hashCode() method

The implementation of equals() and hashCode() should follow these rules.

If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
If o1.hashCode() == o2.hashCode is true, it does not mean that o1.equals(o2) will be true.
*/

import com.shah.javacoretutorials.model.Employee;
import org.junit.jupiter.api.Test;

class HashCode3 {
    // both have the same value but obj reference is diff
    Employee e1 = new Employee("cindy", 55);
    Employee e2 = new Employee("cindy", 55);
    Employee e3 = e1; // point to the same obj

    @Test
    void hashCodeValue() {
        /*
         * e1 & e2 gives diff hashcode (NATURALLY) as it is created as diff obj, although the values
         * are the same. e3 & e1 is the same as e3 points to e1
         */
        System.out.println("e3.equals(e1)?: " + e3.equals(e1));
        System.out.println("e1.equals(e2)?: " + e1.equals(e2));

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
    }

    @Test
    void changeValues() {

        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);

        e3.setName("cindy");
        e3.setAge(56);

        /* since e3 refers to e1, any change to either 1 will change the other. but
         still, it returns true */
        System.out.println("After changing values..");
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);
    }


}

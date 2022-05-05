package com.shah.javacoretutorials.beginner.wrapperClass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/*
Unboxing: 
Converting an object of a wrapper type to its corresponding primitive value is called unboxing. For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:

a) Passed as a parameter to a method that expects a value of the corresponding primitive type.
b) Assigned to a variable of the corresponding primitive type.

 */
class Unboxing {
    @SuppressWarnings({"unused"})
    @Test
    void test() {

        Integer inum = Integer.valueOf(100);

        /*
         * CASE 1: passed Integer wrapper class object, it would be converted to int
         * primitive type at Runtime
         */
        myMethod(inum);
        // Case 2: Assignments
        Integer inum2 = Integer.valueOf(5);
        int num = inum2; // unboxing object to primitive conversion

        // Case 3: While dealing with collection classes:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(inum2);
        // unboxing because get method returns an Integer object
        int num2 = list.get(0);
    }

    void myMethod(int num) {
        System.out.println(num);
    }
}
/*
 * Unboxing:
 *
 * What we see:
 * Integer num2 = new Integer(50);
 * int inum = num2;
 *
 * What compiler does:
 * Integer num2 = new Integer(50);
 * int inum = num2.intValue();
 */
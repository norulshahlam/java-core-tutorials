package com.shah.javacoretutorials.tutorials.beginner.arrays;

import org.junit.jupiter.api.Test;

public class CreateArray1 {

    @Test
    void test() {

        int add = 0;

        // method #1 - array size is defined but its elements are not added yet
        int array1[] = new int[10];

        // method #2 - elements are added upon creation of arrays
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("aaa" + array2[3]);

        // adding elements by using for loop
        for (int a = 0; a < array1.length; a++) {
            // Element always starts from 0-9
            array1[a] = add + 1;
            add++;
            System.out.println("array2 at index " + a + " is " + array1[a]);
        }
        System.out.println("end");

        //print out the array
        for (int a : array1) {
            System.out.println("array2: " + a);
        }

    }
}

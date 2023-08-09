package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayCreation {

    /**
     * Different ways of creating an array
     */

    @Test
    void method1() {

        // array size is defined but later its elements are added using for loop
        int[] array = new int[10];

        int add = 0;
        // adding elements by using for loop
        for (int a = 0; a < array.length; a++) {
            // Element always starts from 0-9
            array[a] = add + 1;
            add++;
            System.out.println("value at index " + a + " is " + array[a]);
        }
    }

    @Test
    void method2() {

        // elements are added upon creation of arrays
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("childMethod array:");
        for(int y : array) {
            System.out.print(y);
        }

    }

    @Test
    void method3() {

        // array size is defined first, but later its elements are added at specific index
        int[] array = new int[10];
        array[3] = 6;
        array[2] = 6;
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        System.out.println("method3 array:");
        for(int y : array) {
            System.out.print(y +" ");
        }
    }
}

package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayCreation {

    @Test
    void method1() {

        // array size is defined but its elements are not added yet
        int[] array1 = new int[10];

        int add = 0;
        // adding elements by using for loop
        for (int a = 0; a < array1.length; a++) {
            // Element always starts from 0-9
            array1[a] = add + 1;
            add++;
            System.out.println("array2 at index " + a + " is " + array1[a]);
        }
        for (int a : array1) {
            System.out.println("array2: " + a);
        }
    }

    @Test
    void method2() {

        // elements are added upon creation of arrays
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("aaa" + array2[3]);
    }

    @Test
    void method3() {
        // array size is defined but its elements are not added yet
        int[] array1 = new int[10];
        array1[3] = 6;
        array1[2] = 6;
        int sum = Arrays.stream(array1).sum();
        System.out.println(sum);
    }
}

package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/*
 * If you are working with arrays and collections, you can use alternative syntax of for loop
 * (enhanced form of for loop) to iterate through items of  arrays/collections.
 * It is also referred as for-each loop because the loop iterates through each element of array/collection
 */
class EnhancedForLoop {

    @Test
    void test() {

        int[] a = {10, 20, 30, 40, 50};
        int total = 0;

        // a has length of 5, so temp = 5, which loops 5 times
        for (int temp : a) {
            // this prints all values of the array
            System.out.println(temp);
            total = temp + total;
        }
        // this prints total val
        System.out.println("total is: " + total);
        System.out.println("For Collections");

        // this works for Collections too.
        ArrayList<Integer> b = new ArrayList<>();
        // add 5 to every element
        for (int i = 0; i < 10; i++) {
            b.add(i * 5);
        }
        // print val using enhance loop
        for (int d : b) {
            System.out.println(d);
        }
    }
}

package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SectionalArraySort {
    @Test
    void test() {
        sort(new int[]{9, 7, 4, 2, 5, 3, 1, 8, 6}, 2, 5);
        sort(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8);
        sort(new int[]{9, 7, 4, 2, 5, 3, 1, 8, 6}, 2, 5);
        sort(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8, 3);
        sort(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 2);
    }

    static int[] sort(final int[] array, final int start, final int... length) {
    /*
    In this kata you are given an array to sort but you're expected to start sorting from a specific position of the array (in ascending order) and optionally you're given the number of items to sort.
     */
        if (length.length == 0)
            Arrays.sort(array, start, array.length);
        else
            Arrays.sort(array, start, array.length - 1);
        for (int a : array)
            System.out.print(a);
        System.out.println();
        return array;
    }

    /*
     test(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 2);
     test(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8);
     test(new int[]{9, 7, 1, 2, 3, 4, 5, 8, 6}, new int[]{9, 7, 4, 2, 5, 3, 1, 8, 6}, 2, 5);
     test(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8, 3);
     test(new int[]{}, new int[]{}, 0);
     */
}


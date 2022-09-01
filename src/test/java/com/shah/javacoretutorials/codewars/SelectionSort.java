package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;


public class SelectionSort {

    @Test
    void contextLoads() {
        int[] numberList = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for (int b : numberList)
            System.out.print(b + ", ");
        System.out.print("\n");
        sort(numberList);
        for (int b : numberList)
            System.out.print(b + ", ");

    }

    public static void sort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }
}

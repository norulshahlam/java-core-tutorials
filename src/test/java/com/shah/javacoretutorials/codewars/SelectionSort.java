package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SelectionSort {

    @Test
    void sortNumbers() {
        int[] numberList = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for (int b : numberList)
            System.out.print(b + ", ");
        System.out.print("\n");
        selectionSort(numberList);
        for (int b : numberList)
            System.out.print(b + ", ");
        assertThat(numberList).contains(1, 2);
    }

    public static void selectionSort(final int[] arr) {
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

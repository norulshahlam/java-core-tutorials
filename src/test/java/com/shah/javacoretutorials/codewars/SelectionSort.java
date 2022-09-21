package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;


public class SelectionSort {

    private StopWatch stopWatch;

    @BeforeEach
    void setup() {
        stopWatch = new StopWatch();
    }

    @Test
    @Order(1)
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

    @Test
    void counterOne() {
        int[] numberList = new Random().ints(100000, 5678, 6666841).toArray();
        selectionSort(numberList);
    }

    @Test
    void counterTwo() {
        int[] numberList = new Random().ints(200000, 5678, 6666841).toArray();
        selectionSort(numberList);
    }

    @Test
    void counterThree() {
        int[] numberList = new Random().ints(300000, 5678, 6666841).toArray();
        selectionSort(numberList);
    }
    @Test
    void counterFour() {
        selectionSort(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8});
    }

    public void selectionSort(final int[] array) {
        stopWatch.start();
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                int temp = array[i];
                array[i] = array[minElementIndex];
                array[minElementIndex] = temp;
            }
        }
        stopWatch.stop();
        for (int a : array)
            System.out.print(a);
        System.out.println("\nTime taken: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}

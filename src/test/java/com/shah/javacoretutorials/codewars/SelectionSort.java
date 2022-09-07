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

    public void selectionSort(final int[] arr) {
        stopWatch.start();
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
        stopWatch.stop();
        System.out.println("Time taken: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}

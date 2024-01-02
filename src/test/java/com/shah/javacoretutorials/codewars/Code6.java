package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Integer.MIN_VALUE;
import static java.util.Arrays.stream;


public class Code6 {
    /**
     * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
     * <p>
     * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
     * // should be 6: {4, -1, 2, 1}
     * <p>
     * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
     * <p>
     * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
     */
    @Test
    void contextLoads() {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        sequence(a);
    }

    public static int sequence(int[] arr) {
        AtomicInteger maxValue = new AtomicInteger(MIN_VALUE);

        long count = stream(arr).reduce(0, Integer::sum);
        System.out.println(count);
        return 4;
    }


}

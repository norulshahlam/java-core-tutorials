package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

class TuringTest {


    @Test
    void test() {
        rotate1(new int[]{1, 2, 3, 4, 5}, 2);

    }

    @Test
    void test2() {
        rotate2(new int[]{1, 2, 3, 4, 5}, 2);
    }

    @Test
    void test3() {
        rotate3(new int[]{1, 2, 3, 4, 5}, 2);
    }

    static void rotate2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        // Storing rotated version of array
        int n = nums.length;
        int[] temp = new int[n];

        // Keeping track of the current index
        // of temp[]
        int a = 0;

        // Storing the n - k elements of
        // array nums[] to the front of temp[]
        for (int i = k; i < n; i++) {
            temp[a] = nums[i];
            a++;
        }

        // Storing the first k elements of array nums[]
        //  into temp
        for (int i = 0; i < k; i++) {
            temp[a] = nums[i];
            a++;
        }

        // Copying the elements of temp[] in nums[]
        // to get the final rotated array
        System.arraycopy(temp, 0, nums, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void rotate1(int[] A, int K) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int n = A.length;
        int p = 1;
        while (p <= K) {
            int last = A[0];
            for (int i = 0; i < n - 1; i++) {
                A[i] = A[i + 1];
            }
            A[n - 1] = last;
            p++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    static int[] rotate3(int[] A, int K) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
        int n = A.length;
        int[] temp = new int[n];
        int a = 0;

        if (n == K) {
            return A;
        }

        // copy from K to end
        for (int i = K - 1; i < n; i++) {
            temp[a] = A[i];
            a++;
        }
        // copy from start to K
        for (int i = 0; i < K - 1; i++) {
            temp[a] = A[i];
            a++;
        }
        // print result
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        return temp;
    }
}



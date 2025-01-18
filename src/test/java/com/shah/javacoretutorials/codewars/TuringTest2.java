package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

class TuringTest2 {

    @Test
    void test() {
        System.out.println(minOperations(3));
    }

    public int minOperations(int k) {
        int ans = k;
        for (int a = 0; a < k; ++a) {
            int x = a + 1;
            int b = (k + x - 1) / x - 1;
            ans = Math.min(ans, a + b);
        }
        return ans;
    }
}

/*
You are given a positive integer k. You start with an array nums = [1]. You can perform any of the following operations on the array as many times as needed (including zero times):

1. Select any element in the array and increase its value by 1.
2. Duplicate any element in the array and append it to the end of the array.

Your task is to return the minimum number of operations required to make the sum of the elements in the final array greater than or equal to k.

Example 1:

Input: k = 15
Output: 6
Explanation:
We can perform the following operations on the array nums = [1]:

Increase the element by 1 four times. The array now becomes nums = [5].
Duplicate the element once. The array now becomes nums = [5, 5].
Duplicate the element once more. The array now becomes nums = [5, 5, 5].

The total sum is 5 + 5 + 5 = 15, which is greater than or equal to k = 15.
The total number of operations performed is 4 + 1 + 1 = 6.
---

Example 2:

Input: k = 3
Output: 2
Explanation:
The sum of the original array nums = [1] is less than 3.

Increase the element by 1 twice. The array now becomes nums = [3].
The total number of operations performed is 2.

---

Constraints:
1 ≤ k ≤ 10⁵

*/





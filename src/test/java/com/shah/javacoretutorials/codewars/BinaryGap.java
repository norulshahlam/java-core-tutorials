package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

class BinaryGap {
    @Test
    void test() {
        solution(529); // 4
        solution(15); // 0
        solution(9); // 2
        solution(20); // 1
    }

    static int solution(int N) {

        String s = Integer.toBinaryString(N);
        int countTemp = 0;
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {

            // 1001001
            if (s.charAt(i) == '0') {
                countTemp++;
                continue;
            }
            if (countTemp > count) {
                count = countTemp;
            }
            countTemp = 0;

        }
        System.out.println(N + " has a gap of " + count);
        return count;
    }
}



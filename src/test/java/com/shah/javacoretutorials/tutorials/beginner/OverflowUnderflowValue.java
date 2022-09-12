package com.shah.javacoretutorials.tutorials.beginner;
/*
if we try to put a val larger than the max val, u will get an overflow value where it just skips back to the min number which is not what u want. same goes to (min val - 1). important convert to be aware of.

if u also try to add a number to an alr max val in a variable, it will show compile time error??
*/

import org.junit.jupiter.api.Test;

class OverflowUnderflowValue {

    @Test
    void test() {

        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;

        System.out.println("max val: " + maxVal);
        System.out.println("overflowed max val after adding one: " + (maxVal + 1));
        System.out.println("overflowed max val after adding one hundred: " + (maxVal + 100));

        System.out.println("min val: " + minVal);
        System.out.println("overflowed min val after minus one: " + (minVal - 1));
        System.out.println("overflowed min val after minus one hundred: " + (minVal - 100));
    }
}

package com.shah.javacoretutorials.tutorials.beginner.underflowOverflow;
/*
if we try to put a val larger than the max val, u will get an overflow value where it just skips back to the min number which is not what u want. same goes to (min val - 1). important convept to be aware of..

if u also try to add a number to an alr max val in a variable, it will show compile time error??
*/

import org.junit.jupiter.api.Test;

class example1 {
  @Test
  void test() {

    int maxVal = Integer.MAX_VALUE;
    int minVal = Integer.MIN_VALUE;

    System.out.println("max val: " + maxVal);
    System.out.println("overflowed max val: " + (maxVal + 1));

    System.out.println("min val: " + minVal);
    System.out.println("overflowed min val: " + (minVal - 1));
  }
}

package com.shah.javacoretutorials.beginner.methods;

import org.junit.jupiter.api.Test;

/*
Demo: call method from another class
*/
class IntroTwo {
  @Test
  void test()  {

    /**
     * Since addNumbers() & minumsNumbers() is static, we can call it right away
     * without having to create the object first
     */
    CalculateNum.addNumbers(1, 2);
    CalculateNum.minusNumbers(4, 1);
  }

}

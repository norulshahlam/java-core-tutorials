package com.shah.javacoretutorials.beginner.Methods;

import org.junit.jupiter.api.Test;

/*
Demo: call method from another class
*/
class intro2 {
  @Test
  void test()  {

    /**
     * Since addNumbers() & minumsNumbers() is static, we can call it right away
     * without having to create the object first
     */
    calculateNumbers.addNumbers(1, 2);
    calculateNumbers.minusNumbers(4, 1);
  }

}

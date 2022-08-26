package com.shah.javacoretutorials.tutorials.beginner.methods;
/*
method with return type
method without return (void)
method with / without arg
*/

import org.junit.jupiter.api.Test;

class IntroOne {
  @Test
  void test()  {

    /*
     * 1. this is method call with return statement. inside bracket is argument.
     * note that u must use the arg in order of the param
     */
    String result1 = calculateSalary("bob", 20, 12);
    System.out.println(result1);

    /* 2. this is how u call void method */
    showEvenOdd(3);
  }

  /*
   * 1. this is method declaration with return statement. inside bracket is
   * parameters. note u must specify datatype for the method name
   */
  public static String calculateSalary(String name, int ratePerHour, int hoursWorked) {
    int salary = ratePerHour * hoursWorked;
    return name + " salary is " + salary;
  }

  // 2. this is method declaration without return statement
  public static void showEvenOdd(int i) {
    if (i % 2 == 0) {
      System.out.println("number is even");
    } else {
      System.out.println("number is odd");
    }
  }
}

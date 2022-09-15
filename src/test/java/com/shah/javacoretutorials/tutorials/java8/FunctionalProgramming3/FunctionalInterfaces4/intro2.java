package com.shah.javacoretutorials.tutorials.java8.FunctionalProgramming3.FunctionalInterfaces4;

/*
same as previous lesson, we are going to breakdown the BinaryOperator

binary  - has a method that takes in 2 input, process and return the result.
*/
import java.util.List;
import java.util.function.BinaryOperator;

public class intro2 {

  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    // 1. simplified - static method reference
    int sum = numbers.stream().reduce(0, Integer::sum);
    System.out.println(sum);

    // 2. behaviour parameterization with method ref
    BinaryOperator<Integer> sumBinaryOperator2 = Integer::sum;
    int sum2 = numbers.stream().reduce(0, sumBinaryOperator2);
    System.out.println(sum2);

    // 3. behaviour parameterization with lambda
    BinaryOperator<Integer> sumBinaryOperator3 = (x, y) -> x + y;
    int sum3 = numbers.stream().reduce(0, sumBinaryOperator3);
    System.out.println(sum3);
    //
    // 4. behaviour parameterization - override func interface method
    BinaryOperator<Integer> sumBinaryOperator4 = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer a, Integer b) {
        return a + b;
      }
    };
    int sum4 = numbers.stream().reduce(0, sumBinaryOperator4);
    System.out.println(sum4);
  }
}

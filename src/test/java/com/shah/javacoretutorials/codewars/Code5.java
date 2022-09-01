package  com.shah.javacoretutorials.codewars;

import java.util.Arrays;

public class Code5 {
  public static void main(String[] args) {
    int[] array = { 0, 1, 4 };
    oddOrEven(array);
  }

  public static String oddOrEven(int[] array) {
    // Integer list = Arrays.stream(array).boxed().reduce(0, Integer::sum);
    // return list % 2 == 0 ? "even" : "odd";

    return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
  }
}

/*
 * Task: Given a list of integers, determine whether the sum of its elements is
 * odd or even.
 * 
 * Give your answer as a string matching "odd" or "even".
 * 
 * If the input array is empty consider it as: [0] (array with a zero).
 * 
 * Examples: Input: [0] Output: "even"
 * 
 * Input: [0, 1, 4] Output: "odd"
 * 
 * Input: [0, -1, -5] Output: "even"
 * 
 */
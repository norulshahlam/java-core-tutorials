package com.shah.javacoretutorials.codewars;

public class code2 {
  public static void main(String[] args) {

    String word = "testing";
    // String word = "middle";
    System.out.println(getMiddle(word));
  }

  public static String getMiddle(String word) {
    int l = word.length();
    return l % 2 == 0 ? word.substring(l / 2 - 1, l / 2 + 1) : Character.toString(word.charAt(l / 2));
  }
}

/*
 * You are going to be given a word. Your job is to the middle character of the
 * word. If the word's length is odd, return the middle character. If the word's
 * length is even, return the middle 2 characters.
 * 
 * #Examples:
 * 
 * Kata.getMiddle("test") should return "es"
 * 
 * Kata.getMiddle("testing") should return "t"
 * 
 * Kata.getMiddle("middle") should return "dd"
 * 
 * Kata.getMiddle("A") should return "A"
 */
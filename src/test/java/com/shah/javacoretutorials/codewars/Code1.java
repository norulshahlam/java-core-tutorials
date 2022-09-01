package com.shah.javacoretutorials.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Code1 {
  public static void main(String[] args) {
    String sentence = "This is another test";
    String s = Arrays.asList(sentence.split(" ")).stream().map(i -> i.length() > 4 ? new StringBuilder(i).reverse() : i)
        .collect(Collectors.joining(" "));

    System.out.println(s);
  }
}

/*
 * Write a function that takes in a string of one or more words, and returns the
 * same string, but with all five or more letter words reversed (like the name
 * of this kata).
 * 
 * Strings passed in will consist of only letters and spaces. Spaces will be
 * included only when more than one word is present.
 */
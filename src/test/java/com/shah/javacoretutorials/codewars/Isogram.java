package  com.shah.javacoretutorials.codewars;

public class Isogram {
  public static void main(String[] args) {
    String str = "";
    System.out.println(isIsogram(str));
  }

  static boolean isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  }
}

/*
 * An isogram is a word that has no repeating letters, consecutive or
 * non-consecutive. Implement a function that determines whether a string that
 * contains only letters is an isogram. Assume the empty string is an isogram.
 * Ignore letter case.
 * 
 * isIsogram "Dermatoglyphics" == true isIsogram "aba" == false isIsogram
 * "moOse" == false -- ignore letter case
 */
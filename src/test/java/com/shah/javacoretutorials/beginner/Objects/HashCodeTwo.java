package com.shah.javacoretutorials.beginner.objects;

import org.junit.jupiter.api.Test;

/*
A hash code is an integer value that is associated with each object in Java.
Its main purpose is to facilitate hashing in hash tables, which are used by data structures like HashMap.

The hashCode() method is a Java Integer class method which returns the hash code for the given inputs.
There are two different types of Java hashCode() method which can be differentiated depending on its parameter.

These are:

1. Java Integer hashCode() Method
2. Java Integer hashCode(int value) Method

hashCode() Method
The hashCode() is a method of Java Integer Class which determines the hash code for a given Integer.
It overrides hashCode in class Object. By default, this method returns a random integer that is unique for each instance.

hashCode(int value) Method
The hashCode(int value) is an inbuilt Java Integer Class method which determines a hash code for a given int value.
This method is compatible with Integer.hashCode().
*/
class HashCodeTwo {
  @Test
  void test()  {
    Integer i = Integer.valueOf(155);
    Integer j = Integer.valueOf(155);
    Integer k = Integer.valueOf(156);

    String a = "123";
    String b = "123";
    String c = "49";
    String d = a;

    /*
     * Integers have same value as the hashcode because the hash
     * codes are derived from their contents.
     */
    System.out.println(i.equals(j));
    System.out.println(a.equals(b));
    System.out.println(i==j); // false as '==' is reference comparison (address comparison)

    System.out.println("i: " + i.hashCode() + ", j: " + j.hashCode() + ", k: " + k.hashCode());
    System.out.println("a: " + a.hashCode() + ", b: " + b.hashCode() + ", c: " + c.hashCode());

    /* String/Number having diff value usually has diff hashcode */
    System.out.println(a.equals(c));
    System.out.println(i.equals(k));

    /* Since a points to d, they are equal in reference comparison */
    System.out.println(a.equals(d));

    /* equal() only applies to wrapper class! */
    int f = 1, g = 1;
    // System.out.println(f.equals(g)); // gives error
  }
}

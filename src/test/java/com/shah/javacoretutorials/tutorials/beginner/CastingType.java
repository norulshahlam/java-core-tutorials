package com.shah.javacoretutorials.tutorials.beginner;
/*
Type casting is when you assign a value of one primitive data type to another type.
In Java, there are two types of casting:

Widening Casting / upcasting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting / downcasting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte


https://www.baeldung.com/java-primitive-conversions

 */

import org.junit.jupiter.api.Test;

class CastingType {
  @Test
  void test() {

    byte minByte = Byte.MIN_VALUE;
    // byte newByte1 = (minByte / 2); //error
    byte newByte2 = (byte) (minByte / 2);
    System.out.println(newByte2);

    /***************************** */
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myInt); // Outputs 9
    System.out.println(myDouble); // Outputs 9.0

    double myDouble2 = 9.78;
    int myInt2 = (int) myDouble2; // Manual casting: double to int
    System.out.println(myDouble2); // Outputs 9.78
    System.out.println(myInt2); // Outputs 9
  }
}

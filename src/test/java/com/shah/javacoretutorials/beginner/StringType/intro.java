package com.shah.javacoretutorials.beginner.stringType;

import org.junit.jupiter.api.Test;

/*
In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string.
*/
class intro {
  @Test
  void test() {
    char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
    String s = new String(ch);

    // same as above
    String t = "javatpoint";
    System.out.println(s);
    System.out.println(t);

    /*
     * string is immutable. 'a' doesnt get appended the value of 'b' instead new
     * string is created which consists of previous value of 'a' plus a text
     * representation of 'b'
     */
    String a = "Hello";
    String b = "World";
    String c = a + b;
    System.out.println(c);
  }
}

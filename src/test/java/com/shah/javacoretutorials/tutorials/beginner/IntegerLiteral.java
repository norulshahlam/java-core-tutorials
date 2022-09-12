package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

/*
1. By default, the Java compiler treats all integer literals as of type int, unless it ends with the letter L or l, it is of type long.
2. By default, the Java compiler treats all floating-point literals as of type double, unless it ends with the letter F (F or f), it is of type float.

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
https://www.informit.com/articles/article.aspx?p=22065&seqNum=5
*/
class IntegerLiteral {
  @Test
  void test()  {

    // 1. error - int type by default but is above its max value for int
    // long i = 12345678910;

    long j = 12345678910L; //

    // 2. float f = 0.05; // error - for this, its default type is double. u can use literal or casting like below:
    float g = 0.05f;  //literal
    float h = (float) 0.05; //casting

    // this doesnt give error - within range of int
    short s = 23464;

     // error - above range
    //byte b = 200;

    
    // how to check the datatype of prmimitive var
    System.out.println(((Object) j).getClass().getName());
    System.out.println(((Object) g).getClass().getName());
    System.out.println(((Object) h).getClass().getName());
    System.out.println(((Object) s).getClass().getName());
  }
}

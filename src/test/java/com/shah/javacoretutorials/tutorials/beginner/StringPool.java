package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
https://www.baeldung.com/java-string-pool
All about string. We will learn about:

String literal vs String object
String Interning


From Java 7 onwards, the Java String Pool is stored in the Heap space

*/

class StringPool {

    @Test
    void test() {

    /*
    In Java, string is immutable, & is an object that represents sequence of char values. An array of characters works same as Java string.
    */

        char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        String t = "javatpoint";
        String s = new String(ch);
        assertThat(s).isEqualTo(t);
    }

    @Test
    void test2() {
    /*
     String Interning

     Thanks to the immutability of Strings in Java, the JVM can optimize the amount of memory allocated for them by storing only one copy of each literal String in the pool. This process is called interning.

     When we create a String variable and assign a value to it, the JVM searches the pool for a String of equal value.
     If found, the Java compiler will simply return a reference to its memory address, without allocating additional memory.
     If not found, it'll be added to the pool (interned) and its reference will be returned.
     */
        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";
        assertThat(constantString1).isSameAs(constantString2);
    }

    @Test
    void test3() {
      /*
      Strings Allocated Using the Constructor

      When we create a String via the new operator, the Java compiler will create a new object and store it in the heap space reserved for the JVM.

      When we create an object using String literal syntax e.g. “Baeldung”, it may return an existing object from the String pool, if it already exists. Otherwise, it will create a new String object and put in the string pool for future re-use.

      At a high level, both are the String objects, but the main difference comes from the point that new() operator always creates a new String object. Also, when we create a String using literal – it is interned.

      Every String created like this will point to a different memory region with its own address.
       */

        String literalString = "Baeldung";
        String stringObject = new String("Baeldung");
        assertThat(literalString).isNotSameAs(stringObject);

        /*
        Manual Interning

        We can manually intern a String in the Java String Pool by calling the intern() method on the object we want to intern.

        Manually interning the String will store its reference in the pool, and the JVM will return this reference when needed.
         */
        String internedString = stringObject.intern();
        assertThat(literalString).isSameAs(internedString);
    }
}

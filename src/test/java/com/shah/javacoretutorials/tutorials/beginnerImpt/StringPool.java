package com.shah.javacoretutorials.tutorials.beginnerImpt;
/*

https://www.baeldung.com/java-string-pool

 In general both .equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

1. equals() is a method & '==' is an operator.

2. ''==' is for reference comparison (address comparison) & .equals() is for content comparison. 

In simple words, "==" checks if both objects point to the same memory location 
whereas .equals() evaluates to the comparison of values in the objects.

always use this .equals() when comparing strings nvr use '==' method. that is only for integer

3. If a class does not override the equals method, then by default it uses equals(Object o)  method of the closest parent class that has overridden this method.

4. String Interning

Thanks to the immutability of Strings in Java, the JVM can optimize the amount of memory allocated for them by storing only one copy of each literal String in the pool. This process is called interning.

When we create a String variable and assign a value to it, the JVM searches the pool for a String of equal value.

If found, the Java compiler will simply return a reference to its memory address, without allocating additional memory.
If not found, it'll be added to the pool (interned) and its reference will be returned.
From Java 7 onwards, the Java String Pool is stored in the Heap space

5. Strings Allocated Using the Constructor

When we create a String via the new operator, the Java compiler will create a new object and store it in the heap space reserved for the JVM.

When we create an object using String literal syntax e.g. “Baeldung”, it may return an existing object from the String pool, if it already exists. Otherwise, it will create a new String object and put in the string pool for future re-use.

At a high level, both are the String objects, but the main difference comes from the point that new() operator always creates a new String object. Also, when we create a String using literal – it is interned.

Every String created like this will point to a different memory region with its own address.

6.  Manual Interning

We can manually intern a String in the Java String Pool by calling the intern() method on the object we want to intern.

Manually interning the String will store its reference in the pool, and the JVM will return this reference when needed.

 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPool {

    @Test
    void test() {
        String a = "apple";
        String b = "apple";
        String c = "APPLE";
        String d = "apple";
        String e = "apple";
        String f = d.intern();

        assertSame(a, b); //true
        assertNotSame(b, c); //false bcos it is case sensitive
        assertTrue(b.equalsIgnoreCase(c)); //false bcos it is case sensitive
        assertNotSame(a, d); //false - diff obj
        assertEquals(a, d); //true - same val
        assertNotSame(d, e); //false - diff obj
        assertEquals(d, e); //true - same value
        assertSame(f, a);
    }
}

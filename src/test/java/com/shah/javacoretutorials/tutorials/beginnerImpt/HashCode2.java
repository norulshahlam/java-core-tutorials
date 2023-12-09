package com.shah.javacoretutorials.tutorials.beginnerImpt;

import org.junit.jupiter.api.Test;

/*
A hash code is an integer value associated with each object in Java.
Its main purpose is to facilitate hashing in hash tables, which are used by data structures like HashMap.

The hashCode() method is a Java Integer class method that returns the hash code for the given inputs.
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
class HashCode2 {
    @Test
    void test() {
        Integer i = Integer.valueOf(155);
        Integer j = Integer.valueOf(155);
        Integer k = Integer.valueOf(156);
        String l = "155";

        /*
         * Two variables have the same hashcode
         * because the hash codes are derived from their contents having the same value and datatype.
         * One way to tell if two variables have the same hashcode is to use the .equals()
         * method and see it returns true.
         */
        System.out.println(i.equals(j));

        /* String/Number having diff value usually has diff hashcode */
        System.out.println(i.equals(k));
        System.out.println(i.equals(l));

        System.out.println("i.hashCode(): " + i.hashCode());
        System.out.println("j.hashCode(): " + j.hashCode());
        System.out.println("k.hashCode(): " + k.hashCode());
        System.out.println("l.hashCode(): " + l.hashCode());
    }

    @Test
    void test2() {
        String a = "123";
        String b = "123";
        String c = "49";
        String d = a;
        System.out.println("a.hashCode(): " + a.hashCode());
        System.out.println("b.hashCode(): " + b.hashCode());
        System.out.println("c.hashCode(): " + c.hashCode());
        System.out.println("d.hashCode(): " + d.hashCode());
        System.out.println("a.equals(b)?: " + a.equals(b));
        System.out.println("a.equals(c)?: " + a.equals(c));
        /* Since a points to d, they are equal in reference comparison */
        System.out.println("a.equals(d)?: " + a.equals(d));
    }

    @Test
    void test3() {
        String x = "apple";
        String y = "apple";
        String z = "banana";
        System.out.println("x.hashCode(): " + x.hashCode());
        System.out.println("y.hashCode(): " + y.hashCode());
        System.out.println("z.hashCode(): " + z.hashCode());

        /* equal() only applies to wrapper class! */
        int f = 1, g = 1;
        // System.out.println(f.equals(g)); // gives error
    }

    @Test
    void test4() {
        int i = Integer.hashCode(152340);
        System.out.println(i);
    }
}

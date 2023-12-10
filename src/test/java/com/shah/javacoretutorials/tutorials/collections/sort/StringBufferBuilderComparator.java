package com.shah.javacoretutorials.tutorials.collections.sort;

/*
    ****DEPRECATED****

We will explore that Collections of String type can use sort() but not for buffer and builder.
why?
firstly, sort() sorts the specified list into ascending order, according to the natural ordering of its elements. And all elements in the list must implement the Comparable interface.
String class implements Comparable interface whereas StringBuffer and StringBuilder classes do not implement Comparable interface. If we run this, it will throw ClassCastException. 
How to overcome this?
There are many ways of sorting StringBuffer, StringBuilder classes. Some ways are given below:

1. By implementing Comparator interface
2. By converting StringBuffer to String using StringBuffer.toString() method

https://www.geeksforgeeks.org/sorting-collection-string-stringbuffer-java/

Need to confirm

THIS IS NO LONGER WIDELY USED AS WE CAN USE JAVA STREAMS TO ACHIEVE THE SAME WITH SHORTER CODE

*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class StringBufferBuilderComparator {
    Set<StringBuffer> set = new TreeSet<>();

    @BeforeEach
    void setUp() {
        set.add(new StringBuffer("hello"));
        set.add(new StringBuffer("shah"));
        set.add(new StringBuffer("world"));
        set.add(new StringBuffer("my"));
        set.add(new StringBuffer("name"));
        set.add(new StringBuffer("shah"));
    }

    @Test
    void test() {
        set.forEach(System.out::println);
    }

    @Test
    void test2() {
        set.stream().sorted(new SortByDesc()).forEach(System.out::println);
    }
}

class SortByDesc implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}

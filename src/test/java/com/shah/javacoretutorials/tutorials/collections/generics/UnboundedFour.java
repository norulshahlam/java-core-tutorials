package com.shah.javacoretutorials.tutorials.collections.generics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/*

Unbounded Wildcards
The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>. This is called a list of unknown types. There are two scenarios where an unbounded wildcard is a useful approach:

- If you are writing a method that can be implemented using functionality provided in the Object class.

- When the code is using methods in the generic class that don't depend on the type parameter. For example, List.size or List.clear. In fact, Class<?> is so often used because most of the methods in Class<T> do not depend on T.

https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html

*/
class UnboundedFour {

    @Test
    void test() {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");

        // this method can support any object type
        printList(li);
        printList(ls);

        // printList2(li);
        // printList2(ls);
    }

    /*
     * The goal of printList2 is to print a list of any type, but it fails to
     * achieve that goal — it prints only a list of Object instances; it cannot
     * print List<Integer>, List<String>, List<Double>, and so on, because they are
     * not subtypes of List<Object>. To write a generic printList method, use
     * List<?>:
     */
    public static void printList2(List<Object> l) {
        l.forEach(System.out::println);
    }

    public static void printList(List<?> l) {
        l.forEach(System.out::println);
    }
}
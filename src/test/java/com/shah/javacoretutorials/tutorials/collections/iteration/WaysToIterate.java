package com.shah.javacoretutorials.tutorials.collections.iteration;

/*
5 ways to loop through a collections:

1. for loop
2. Iterator,
3. Enhanced for loop
4. Static method reference
5. forEach

‘Iterator’ is an interface that belongs to collection framework. It allows us to traverse the collection,
access the data element and remove the data elements of the collection

An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping. It is an interface that belongs to the collection framework.

The iterator() method can be used to get an Iterator for any collection:

To loop through a collection, use the hasNext() and next() methods of the Iterator

hasNext() - returns true if current iteration has element
next() - contains the elements
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class WaysToIterate {

    @Test
    void test() {

        List<Integer> values = new ArrayList<Integer>();
        values.add(88);
        values.add(44);
        values.add(3);
        values.add(3254);

        System.out.println("\nMethod 1... ");
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        System.out.println("\nMethod 2... ");
        Iterator<Integer> i = values.iterator();
        while (i.hasNext()) System.out.println(i.next());

        System.out.println("\nMethod 3... ");
        for (Object j : values)
            System.out.println(j);

        System.out.println("\nMethod 4... ");
        values.forEach(System.out::println);

        System.out.println("\nMethod 5... ");
        values.forEach(k -> System.out.println(k));
    }
}

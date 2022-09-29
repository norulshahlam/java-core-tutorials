package com.shah.javacoretutorials.tutorials.collections.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.shah.javacoretutorials.model.Fruits.numbers;

/*
   List allow element to be added by inserting into index specified by user.
   the concept of mentioning what type of data (ie integer, Float, even Objects!) in your collection is called GENERICS
 */
class ArrayListOne {

    @Test
    void testSort() {
        List<Integer> values = new ArrayList<>();
        values.addAll(numbers);
        values.add(1, 5); // add this element to the 1st index

        System.out.println("Before sort");
        for (Object j : values)
            System.out.print(", "+j);

        // List allow element to be sorted by natural order - increasing order
        Collections.sort(values);
        System.out.println("\nafter sort");
        for (Object k : values)
            System.out.print(", "+k);
    }

}

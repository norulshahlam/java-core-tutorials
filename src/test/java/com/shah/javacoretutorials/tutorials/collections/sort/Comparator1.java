package com.shah.javacoretutorials.tutorials.collections.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    ****DEPRECATED****

THIS IS NO LONGER WIDELY USED AS WE CAN USE JAVA STREAMS TO ACHIEVE THE SAME WITH SHORTER CODE
*/
class Comparator1 {
    private static int compare(Integer o1, Integer o2) {
        return o1 % 10 > o2 % 10 ? 1 : -1;
    }

    @Test
    void test() {
        List<Integer> val1 = Arrays.asList(403, 109, 845, 330, 23);
        System.out.println("before sort:" + val1);

        val1.sort(new CompSet());
        System.out.println("after sort:" + val1);

        // Leveraging method reference
        val1.sort(Comparator1::compare);
    }
}

// a)
class CompSet implements Comparator<Integer> {

    // b)
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("o1: " + o1 + ", o2: " + o2);
        // compare the last digit of each element only by using modulus
        if (o1 % 10 > o2 % 10) return 1;
        return -1;
    }
}
/*
 * How it works?
 *
 * it all starts with this line: Collections.sort(val1, com); sort() takes in 2
 * param - the List and a Comparator. Comparator has 2 param where it is being
 * compared against each other Compares its two arguments for order. Returns a
 * negative integer,zero, or a positive integer as the first argument is less
 * than, equal to, or greater than the second o1 will keep checking and store
 * after checking against o2 we have to create class, implements Comparator,
 * define the logic then use this obj of it as param for sort()
 *
 * Comparator is functional interface ie 1 abstract method which means we can
 * use lambda expression we can define the method logic and run it in 1 line:
 *
 * Collections.sort(val1, (o1,o2) -> { return o1%10 > o2%10 ? 1 : -1; });
 *
 * this is another way of implementing d)
 *
 * Laymen: if o1 > o2, return 1. else return -1. repeat for next element. this
 * is how sorting works
 */

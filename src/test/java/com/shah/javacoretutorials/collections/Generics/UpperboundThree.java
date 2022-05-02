package com.shah.javacoretutorials.collections.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

/*
Upper Bounded Wildcards

You can use an upper bounded wildcard to relax the restrictions on a variable. For example, say you want to write a method that works on List<Integer>, List<Double>, and List<Float>; you can achieve this by using an upper bounded wildcard.

https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html

*/
class UpperboundThree {

    @SuppressWarnings("unused")
    @Test
    void test() {
        total(List.of(1, 2, 3, 4, 5));
        total(List.of(1.5, 2.6, 3.1, 4.9, 5.2));
        total(List.of(14654L, 46842L, 49893L, 79844L, 46455L));

        /* b. enter into the datatype and u will c it all extends Numbers */
        Integer a = 0;
        Float b = 0.0f;
        Long c = 35456445L;
    }

    /*
        a. previously u can add only 1 type here but now we can add
        any type that extend Numbers can be used eg int,float,long
        static void total(List<Integer> list) {
    */
    static void total(List<? extends Number> n) {

        double sum = 0.00;

        for (Number nn : n) {
            sum += nn.doubleValue();
        }
        System.out.println(sum);

    }
}
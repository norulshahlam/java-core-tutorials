package com.shah.javacoretutorials.practice.async;

import com.shah.javacoretutorials.parallelStreams.ParallelStreamPerformance;
import com.shah.javacoretutorials.util.DataSet;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformanceTest {

    /**
     * This demonstrates that using parallel streams doesn't necessarily improve performance. It might be worse so always test!
     * <p>
     * When to use parallel streams?
     * - Lots of data
     * - Longer computation time
     * - More cores in your machine.
     * <p>
     * When NOT to use parallel streams?
     * - When are lots of data splits and combine as demonstrates below.
     * - Dataset is small.
     * - When there are auto-boxing and unboxing.
     * Stream operators like iterate(), limit();
     */

    ParallelStreamPerformance intStreamExample = new ParallelStreamPerformance();

    @Test
    @Order(1)
    void sum_using_intstream() {
        /* IntStream is best used without parallel  */

        //when
        int sum = intStreamExample.sum_using_intstream(1000000, false);
        System.out.println("sum_using_intstream not parallel : " + sum);

        //then
        assertEquals(1784293664, sum);
    }

    @Test
    @Order(1)
    void sum_using_intstream_parallel() {
        /* IntStream will take longer time when using parallel  */

        //when
        int sum = intStreamExample.sum_using_intstream(1000000, true);
        System.out.println("sum_using_intstream parallel : " + sum);

        //then
        assertEquals(1784293664, sum);
    }

    @Test
    @Order(2)
    void sum_using_list() {

        /* IntStream is best used without parallel  */
        //given
        int size = 1000000;
        ArrayList<Integer> inputList = DataSet.generateArrayList(size);
        //when
        int sum = intStreamExample.sum_using_list(inputList, false);
        System.out.println("sum_using_list not parallel : " + sum);

        //then
        assertEquals(1784293664, sum);
    }

    @Test
    @Order(2)
    void sum_using_list_parallel() {
        /* IntStream will take longer time when using parallel  */
        //given
        int size = 1000000;
        ArrayList<Integer> inputList = DataSet.generateArrayList(size);
        //when
        int sum = intStreamExample.sum_using_list(inputList, true);
        System.out.println("sum_using_list parallel : " + sum);

        //then
        assertEquals(1784293664, sum);
    }

    @Test
    @Order(3)
    void sum_using_iterate() {
        //given

        //when
        int sum = intStreamExample.sum_using_iterate(1000000, false);
        System.out.println("sum_using_iterate not parallel : " + sum);

        //then
        assertEquals(1784293664, sum);
    }

    @Test
    @Order(3)
    void sum_using_iterate_parallel() {
        //given

        //when
        int sum = intStreamExample.sum_using_iterate(1000000, true);
        System.out.println("sum_using_iterate parallel : " + sum);

        //then
        assertEquals(1784293664, sum);
    }


}
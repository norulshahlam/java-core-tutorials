package com.shah.javacoretutorials.tutorials.collections.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.shah.javacoretutorials.model.Fruits.numbers;

/*  show how to add values into Collections in 3 ways   */

class ArrayListAddValues {

    @Test
    void addValues() {

        // method 1 - add 1 by 1
        List<Integer> values = new ArrayList<>(numbers);

        for (int i : values)
            System.out.println("1st method: " + i);
    }

    @Test
    void addValues2() {
        // method 2. if you know the values you can add during instantiation
        List<Integer> num2 = Arrays.asList(3, 9, 6);

        for (int i : num2)
            System.out.println("2nd method: " + i);
    }

    @Test
    void addValues3() {
        // method 3. use double braces. note that the values added is still inside the
        // instantiation
        List<Integer> num3 = new ArrayList<>() {
            {
                add(3);
                add(9);
                add(6);
            }
        };

        for (int i : num3)
            System.out.println("3rd method: " + i);
    }
}

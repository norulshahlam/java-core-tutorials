package com.shah.javacoretutorials.tutorials.beginner;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

/*
Variable arguments: Var args methods accept zero or more arguments (args) of a given type.
Such methods can have a variable number of arguments and thus useful for passing of dynamic data.
*/
class VariableArguments {
    @Test
    void test() {
        /* user can input any number of arguments */
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        average(ints);
    }

    void average(int @NotNull ... numbers) {
        int total = 0;
        for (int x : numbers)
            total = total + x;
        System.out.println("total sum of number:" + total + ", total element: " + numbers.length);
    }
}


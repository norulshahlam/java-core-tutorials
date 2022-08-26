package com.shah.javacoretutorials.tutorials.advance.objectCopy;

import java.util.Arrays;

public class ExTwo {
    private int[] data;

    // makes a shallow copy of values
    public ExTwo(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}
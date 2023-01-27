package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

public class GFG
{
    // public instance initialized when loading the class
    private static final GFG instance = new GFG();

    private GFG()
    {
        // private constructor
    }
    public static GFG getInstance(int i){

        return instance;
    }

    @Test
    void test() {
       GFG instance1 = GFG.getInstance(1);
        System.out.println(instance1);
    }
}

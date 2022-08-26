package com.shah.javacoretutorials.tutorials.intermediate.enums;

import org.junit.jupiter.api.Test;

/*
A Java Enum is a special Java type used to define collections of constants. 
Sometimes, a variable should only hold a restricted set of values. 
For example, you may sell clothes or pizza in four sizes: small, medium, large, and extra large.
*/
enum clothesSizes {
    SMALL, MEDIUM, LARGE;
}

class IntroOne {

    @Test
    void test() {

        System.out.println(clothesSizes.LARGE);
    }
}
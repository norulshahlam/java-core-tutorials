package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

/*
The Java ternary operator functions like a simplified Java if statement. 
The ternary operator consists of a condition that evaluates to either true or false, 
plus a value that is returned if the condition is true and 
another value that is returned if the condition is false. 
Here is a simple Java ternary operator example:
 */
class TernaryOperator {

    @Test
    void test() {

        int i = 2;

        /* if i==1, then assign 2 into j. else assign 1 into j */
        int j = (i == 1 ? 2 : 3);

        /* statement is same as if(i==1) j=2; else j=3; */

        System.out.println(j);
    }
}

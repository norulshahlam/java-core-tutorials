package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

class BreakContinue {
    @Test
    void test() {

        /***** CONTINUE
         Skips one iteration if condition is met, and continues with the next iteration in the loop. This example skips the value of 4
         * *******/
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("Skip this iteration");
                continue;
            }
            System.out.println(i);
        }

        /***** BREAK
         Breaks whole iteration if condition is met. unlike Continue, it wont continue with the next iteration. This example breaks the whole loop when i is equal to 4:
         * *******/
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("iteration stops after this");
                break;
            }
            System.out.println(i);
        }
    }
}

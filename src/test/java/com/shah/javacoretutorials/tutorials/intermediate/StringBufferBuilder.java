package com.shah.javacoretutorials.tutorials.intermediate;

/*
The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable.

Only different btwn builder and buffer

StringBuffer
-- synchronized i.e., thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
-- Hence is less efficient (slower) than StringBuilder.

StringBuilder 
-- non-synchronized i.e., not thread safe. It means two threads can call the methods of StringBuilder simultaneously and can cause data inconsistencies.
-- But it is more efficient (faster) than StringBuffer.

******************************************

We run test on which one is faster and why
 */

import org.junit.jupiter.api.Test;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

class StringBufferBuilder {
    @Test
    void test() {

        long N = Integer.MAX_VALUE;
        {
            StringBuffer sb = new StringBuffer();
            long t = currentTimeMillis();
            for (long i = N; i-- > 0; ) {
            }
            out.println("StringBuffer: " + (currentTimeMillis() - t) + "ms");
            out.println(sb);
        }

        {
            StringBuilder sb = new StringBuilder();
            long t = currentTimeMillis();
            for (long i = N; i > 0; i--) {
            }
            out.println("StringBuilder: " + (currentTimeMillis() - t) + "ms");
        }
    }    //builder is faster due to non-synchronised

}

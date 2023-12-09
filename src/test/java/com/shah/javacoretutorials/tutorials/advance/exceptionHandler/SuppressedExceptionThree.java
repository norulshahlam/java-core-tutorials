package com.shah.javacoretutorials.tutorials.advance.exceptionHandler;

/*
Some resources like FileReader, BufferedReader, SQLConnections etc. require you to use try-catch because they have the potential to cause exceptions.
You can avoid handling this by suppressing them by adding 'throws Exception' in your main method. This will ignore ALL resources. If u only 1 2 suppress certain resources, use that specific handler eg 'throws IOException'. NOTE: use this if you are certain there's no error
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuppressedExceptionThree {
    /* remove the throws statement n c what happens */
    @Test
    @Disabled
    void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter something");
        String str = br.readLine();
        System.out.println("You typed: " + str);

        // NOW YOU DON'T NEED TO INCLUDE 'CATCH'
    }
}

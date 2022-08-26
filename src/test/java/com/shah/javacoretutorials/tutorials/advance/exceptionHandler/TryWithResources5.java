package com.shah.javacoretutorials.tutorials.advance.exceptionHandler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/*
Java try-with-resources, is an exception handling mechanism that can automatically close resources like a Java InputStream or a JDBC Connection or Scanner.input when you are done with them.

In Java, the try-with-resources statement is a try statement that declares one or more resources. The resource is as an object that must be closed after finishing the program. The try-with-resources statement ensures that each resource is closed at the end of the statement execution.
Before Java 7 introduced this feature, we had to use the finally block to ensure that the resource is closed to avoid resource leaks.

How to?
Simply create the instance of the resource inside try as arg. 
*/

class TryWithResources5 {

    @Disabled
    @Test
    void test() {

        // try-with-resources - simply create the obj here & compiler will close for u
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter something");
            String str = br.readLine();
            System.out.println("You typed: " + str);
        }
        // YOU DON'T NEED TO INCLUDE 'CATCH'
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

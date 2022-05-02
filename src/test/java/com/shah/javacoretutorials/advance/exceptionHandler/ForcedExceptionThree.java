package com.shah.javacoretutorials.advance.exceptionHandler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

class ForcedExceptionThree {
    @Test
    @Disabled
    void test() {

        /*
         * 1. we show that we can force an error if certain user input doesnt meet
         * requirements 2. we can use 1 try with many catch to handle diff type of
         * exceptions defined by us
         */
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("enter number 10 or more: ");
            int input = scanner.nextInt();
            if (input < 10) {
                // The throw statement allows you to create a custom error. It can force
                // exception n set the error type if requirements r not met
                throw new ArithmeticException();
            } else {
                System.out.println("input passed");
            }
        }
        // if user input < 10
        catch (ArithmeticException e) {
            System.out.println(e + " number must be more than 10");
        }
        // if user input other than int
        catch (InputMismatchException e) {
            System.out.println("pls enter digitz only");
        } finally {
            System.out.println("end of program");
            scanner.close();
        }
    }
}

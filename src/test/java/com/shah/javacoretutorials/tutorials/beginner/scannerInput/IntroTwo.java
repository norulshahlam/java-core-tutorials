package com.shah.javacoretutorials.tutorials.beginner.scannerInput;

/*
 * this class demos the manipulation of string from user input. it counts how many uppercase / lowercase letters
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static java.lang.Character.*;

class IntroTwo {

    @Disabled
    @Test
    void test() {

        int upperCase = 0, lowerCase = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the char");

        String input = scanner.nextLine();

        // if input is not empty then do the counting
        if (!input.isEmpty()) {
            for (char ch : input.toCharArray()) {
                if (!isDigit(ch) && isAlphabetic(ch)) {
                    if (isUpperCase(ch)) {
                        upperCase++;
                    }
                    if (isLowerCase(ch)) {
                        lowerCase++;
                    }
                }
            }
            System.out.println("upper case letter is: " + upperCase);
            System.out.println("lower case letter is: " + lowerCase);
        } else
            System.out.println("pls enter a char!");

        scanner.close();
    }
}

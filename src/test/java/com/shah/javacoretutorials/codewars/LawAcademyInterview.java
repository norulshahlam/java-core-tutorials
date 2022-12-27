package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

public class LawAcademyInterview {


    @Test
    void question3() {
        /*
        Hash any string using any encoder
         */
        String password = "apple";
//        System.out.println(password.hashCode());
//        System.out.println( password.charAt(0));
        int c = Character.compare(password.charAt(0), 'c');
    }

    @Test
    void coderByte() {
    }

    public static String SearchingChallenge(String str) {

        int leftBracket = 0;
        int rightBracket = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.compare(str.charAt(i), '(') == 0)
                leftBracket++;
            if (str.charAt(i) == ')')
                rightBracket++;
        }
        System.out.println(leftBracket + " " + rightBracket);
        if (leftBracket == rightBracket)
            return "1";
        else
            return "0";
    }

}

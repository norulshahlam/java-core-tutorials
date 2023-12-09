package com.shah.javacoretutorials.tutorials.intermediate;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegularExpression {
    @Test
    void replaceTest() {
        /*
        how to:

        1. replace all words with another
        2. replace first matching word found with another
        */

        String currentText = "Sam is rich. Sam loves to eat. Sam is old";
        String chosenText = "Sam";

        Pattern pattern = Pattern.compile(chosenText);
        Matcher matcher = pattern.matcher(currentText);
        //replace all that contains Sam with Tom
        String replaceAll = matcher.replaceAll("Tom");
        //replace only the first "Sam", not all "Sam"
        String replaceFirst = matcher.replaceFirst("Adam");

        System.out.println("current text: " + currentText);
        System.out.println("replace all text: " + replaceAll);
        System.out.println("replace first text: " + replaceFirst);
    }

    @Test
    void isMatchedTest() {

        // this function checks if two strings are same
        String a = "test";
        String b = "test";
        String c = "test1";
        String d = "test1";
        String e = "test";

        boolean isMatched = Pattern.matches(a, b);
        System.out.println(isMatched);
        boolean isMatched2 = Pattern.matches(c, d);
        System.out.println(isMatched2);

        boolean isMatched3 = Pattern.matches(a, e);
        System.out.println(isMatched3);
    }

    @Test
    void test() {

        //variable u 1 2 search in
        String input = "hop,mop,shop,chop";
        //your query
        Pattern pattern = Pattern.compile("hop");
        //search!
        Matcher matcher = pattern.matcher(input);

        //this prints false as matcher check if both content is same ie check the whole String
        System.out.println(matcher.matches());

        //returns true as it check the beginning of the String
        System.out.println(matcher.lookingAt());

        while (matcher.find()) {
            System.out.println(matcher.group() + ":" + matcher.start() + ":" + matcher.end());
            //it will check any part of string that has "hop". if yes, it indicates the index start & end
        }

    }
}
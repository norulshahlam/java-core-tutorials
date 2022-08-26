package com.shah.javacoretutorials.tutorials.intermediate.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
how to:

1. replace all words with another
2. replace first matching word found with another
*/
class Replace {

    @Test
    void test() {

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

}

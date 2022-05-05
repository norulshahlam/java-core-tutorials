package com.shah.javacoretutorials.intermediate.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Regular Expressions or Regex (in short) is an API for defining String patterns that can be used for searching, manipulating and editing a string in Java. Email validation and passwords are few areas of strings where 
Regex are widely used to define the constraints. 

Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern

https://www.w3schools.com/java/java_regex.asp
*/

class MatcherOne {

    @Test
    void test() {

        //varaible u 1 2 search in
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

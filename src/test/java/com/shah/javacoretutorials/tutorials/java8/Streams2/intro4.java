package com.shah.javacoretutorials.tutorials.java8.Streams2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class intro4 {
    @Test
    void listDoesGuaranteeOrderOfInsertion() {
        List<Integer> numbers = Arrays.asList(9, 4, 6, 3, 8, 2);

        Optional<Integer> first = numbers
                .stream()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1L)
                .findFirst();
        first.ifPresent(System.out::println);
    }

    @Test
    void listDoesGuaranteeOrderOfInsertion2() {

        String name = "My name is Norul";
        // convert to char array
        char[] nameArray = name.toCharArray();

        int i = 0, j = nameArray.length - 1;
        for (char temp : nameArray) {
            nameArray[i++]= nameArray[j--];
            nameArray[j+1] = temp;
            if (i>=j)
                break;
        }
        System.out.println(nameArray);
    }
}

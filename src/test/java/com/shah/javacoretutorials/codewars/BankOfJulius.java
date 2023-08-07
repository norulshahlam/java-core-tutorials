package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class BankOfJulius {


    @Test
    void codilityTest1() {
        String[] L = {"BILL", "BOB"};
        String S = "BILLOBILLOLLOBBI";


//        String[] L = {"ILOVEMYDOG", "CATS"};
//        String S = "CAT";
        solution(S, L);

    }

    public int solution(String S, String[] L) {
        HashMap<Character, Integer> stringOfWords = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (stringOfWords.containsKey(S.charAt(i))) {
                stringOfWords.put(S.charAt(i), stringOfWords.get((S.charAt(i))) + 1);
            } else
                stringOfWords.put(S.charAt(i), 1);
        }
        ArrayList<Integer> finalCounter = new ArrayList<>();

        for (int j = 0; j < L.length; j++) {
            if (L[j].length() > S.length()) {

                continue;
            }

            HashMap<Character, Integer> countedString = countArrayString(L[j]);
            System.out.println();
            ArrayList<Integer> counter = new ArrayList<>();


            countedString.forEach((k, v) -> {
                if (stringOfWords.containsKey(k)) {
                    counter.add(stringOfWords.get(k) / v);
                }
            });
            System.out.println(counter);
            Integer integer = counter.stream().min(Comparator.comparing(Integer::valueOf)).orElse(0);
            finalCounter.add(integer);
        }
        Integer ss = finalCounter.stream().max(Comparator.comparing(Integer::valueOf)).orElse(0);
        System.out.println(ss);
        return finalCounter.stream().max(Comparator.comparing(Integer::valueOf)).orElse(0);
    }
            /*
        B 1
        I 1
        L 2
        *****
        L 6
        0 3
        B 4
        I 3
        *****
        [4,3,]

         */

    public HashMap<Character, Integer> countArrayString(String L) {
        HashMap<Character, Integer> arrayOfWords = new HashMap<>();

        for (int i = 0; i < L.length(); i++) {
            if (arrayOfWords.containsKey(L.charAt(i))) {
                arrayOfWords.put(L.charAt(i), arrayOfWords.get((L.charAt(i))) + 1);
            } else
                arrayOfWords.put(L.charAt(i), 1);
        }
        return arrayOfWords;
    }


    public int solution2(String S, String[] L) {
        HashMap<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i]);
            for (int j = 0; j < L[i].length(); j++) {
                // B,I,L,L
                System.out.println(L[i].charAt(j));
                for (int k = 0; k < S.length(); k++) {
                    if (L[i].charAt(j) == S.charAt(k)) {

                    }
                }
            }
        }
        return 1;
    }

}
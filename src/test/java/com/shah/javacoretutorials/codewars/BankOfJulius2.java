package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            System.out.println("");
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

    /*
    You've received a BigDecimal that represents a set of laboratory
samples. Before the input data is passed on for further processing, you are
required to perform some pre((-))processing on it. What you must do is:

<li>Eliminate all null and negative values (noises).</li>
<li>Divide the data into triple((-))groups of three samples and retain only complete triples.</li>
<li>Eliminate all triples whose average is higher than 30.</li>
<li>Join all the triples again.</li>
<li>Use <code>SampleNormalizer</code> to normalize the values. Unfortunately, due to poor design it returns <code>Optional&lt;Optional&lt;BigDecimal&gt;&gt;</code> and is a bit buggy: it may return nulls (empty optionals), which you must eliminate. <code>SampleNormalizer</code>'s <code>normalize</code> method accepts a single <code>BigDecimal</code>.</li>
<li>Return a <code>Stream&lt;BigDecimal&gt;</code>.</li>
     */
    @Test
    void codilityTest2() {
        List<BigDecimal> sample = new ArrayList<>();
        sample.add(BigDecimal.valueOf(9.9));
        sample.add(BigDecimal.valueOf(1.0));
        sample.add(BigDecimal.valueOf(19.99));
        sample.add(BigDecimal.valueOf(5.99));
        sample.add(BigDecimal.valueOf(0.2));
        sample.add(BigDecimal.valueOf(5.5));
        sample.add(BigDecimal.valueOf(-0.5));
        sample.add(null);


        Stream<BigDecimal> input = sample.stream();
        preprocess(input);
    }

    Stream<BigDecimal> preprocess(Stream<BigDecimal> input) {
        List<BigDecimal> collect = input
                .filter(Objects::nonNull)
                .filter(i -> i.compareTo(BigDecimal.valueOf(0.0)) == 1)
                .collect(Collectors.toList());
        int remainder = collect.size() % 3;
        ArrayList<BigDecimal> avg = new ArrayList<>();
        for (int i = 0; i < collect.size(); i = i + 3) {
            if (i + 2 > collect.size())
                break;
            BigDecimal sum = collect.get(i).add(collect.get(i + 1)).add(collect.get(i + 2));
            BigDecimal divide = sum.divide(BigDecimal.valueOf(3), 2, RoundingMode.CEILING);
            if (divide.compareTo(BigDecimal.valueOf(30.0)) != 1) {
                avg.add(divide);
            }
        }
        System.out.println("ss");
        System.out.println(avg);
        return avg.stream();
    }

    class Task {
        private BigInteger id;
        private String description;
        private BigInteger priority;
        

    }
}
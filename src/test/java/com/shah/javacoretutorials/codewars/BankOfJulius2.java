package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BankOfJulius2 {


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

}
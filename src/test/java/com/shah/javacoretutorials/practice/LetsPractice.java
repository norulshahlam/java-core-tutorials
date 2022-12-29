package com.shah.javacoretutorials.practice;

import com.shah.javacoretutorials.model.Groceries;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class LetsPractice {

    List<Groceries> groceries = null;

    @BeforeEach
    void setUp() throws IOException {
        groceries = InitCourseData.init();
    }

    @AfterEach
    void tearDown() {
        groceries = null;
    }

    @Test
    void sizeOfListIs100() {
        Assertions.assertThat(groceries.size()).isEqualTo(100);
    }
    @Test
    void groupByCountries() {
        Map<String, List<Groceries>> countriesSet = groceries.stream().collect(Collectors.groupingBy(Groceries::getCountry));
        countriesSet.forEach((k,v )-> System.out.println(k+" : "+v));
        Assertions.assertThat(groceries.size()).isEqualTo(100);
    }
}

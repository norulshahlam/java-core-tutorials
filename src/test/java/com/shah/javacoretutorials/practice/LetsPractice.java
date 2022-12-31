package com.shah.javacoretutorials.practice;

import com.shah.javacoretutorials.model.Groceries;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(groceries).hasSize(100);
    }

    @Test
    void groupByBrandAndCount() {
        Map<String, Long> listMap = groceries
                .stream()
                .collect(
                        Collectors.groupingBy(Groceries::getBrand, Collectors.counting()));
        listMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void groupByCategoriesAndCount() {
        Map<String, Long> listMap = groceries
                .stream()
                .collect(
                        Collectors.groupingBy(Groceries::getCategory, Collectors.counting()));
        listMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void priceBiggerThan15() {
        List<Groceries> list = groceries
                .stream()
                .filter(
                        price -> price.getCostPrice().compareTo(BigDecimal.valueOf(15.00)) > 0)
                .toList();
        list.forEach(i -> assertThat(i.getCostPrice()).isGreaterThan(BigDecimal.valueOf(15.00)));
    }

    @Test
    void sellingPriceAllItemsBy20percent() {
        Map<BigDecimal, BigDecimal> collect = groceries
                .stream()
                .collect(Collectors
                        .toMap(Groceries::getCostPrice,
                                i -> i.getCostPrice().multiply(BigDecimal.valueOf(1.2)),
                                (existing, replacement) -> existing));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void showOnlyItem() {
        List<String> items = groceries
                .stream()
                .map(Groceries::getItem)
                .toList();
        items.forEach(
                i -> assertThat(i).isInstanceOf(String.class));
    }

    @Test
    void totalNestleProducts() {
        List<Groceries> collect = groceries
                .stream()
                .filter(
                        brand -> brand.getBrand().equals("Carlsberg"))
                .toList();
        assertThat(collect).hasSize(7);
        collect.forEach(System.out::println);
    }

    @Test
    void totalCostOfEveryProducts() {
        Map<String, Double> collect = groceries
                .stream()
                .collect(Collectors.groupingBy(
                        Groceries::getBrand,
                        Collectors.summingDouble(i -> Double.parseDouble(i.getCostPrice().toString()))));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void itemStatisticsOfEveryProducts() {
        Map<String, LongSummaryStatistics> collect = groceries
                .stream()
                .collect(Collectors.groupingBy(
                        Groceries::getBrand,
                        Collectors.summarizingLong(Groceries::getQuantity)));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void sortAllItemsByQuantityReverse() {
        List<Groceries> collect = groceries
                .stream()
                .sorted(Comparator.comparing(Groceries::getQuantity)
                        .reversed())
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void ItemWithMinimumQuantity() {
        Groceries minGroceries = groceries.stream()
                .min(Comparator.comparing(Groceries::getQuantity))
                .orElse(null);
        System.out.println(minGroceries);
    }

}

package com.shah.javacoretutorials.practice;

import com.shah.javacoretutorials.model.Groceries;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
    void sortAllItemsByQuantityReverse() {
        List<Groceries> collect = groceries
                .stream()
                .sorted(Comparator.comparing(Groceries::getQuantity)
                        .reversed())
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void showOnlyUniqueBrandSorted() {
        List<String> items = groceries
                .stream()
                .map(Groceries::getBrand)
                .sorted()
                .distinct()
                .toList();
        items.forEach(System.out::println);
        items.forEach(
                i -> assertThat(i).isInstanceOf(String.class));
        assertThat(items).hasSize(26);
    }

    @Test
    void itemPriceBiggerThan15() {
        List<Groceries> list = groceries
                .stream()
                .filter(
                        price -> price.getCostPrice().compareTo(BigDecimal.valueOf(15.00)) > 0)
                .toList();
        list.forEach(System.out::println);
        list.forEach(i -> assertThat(i.getCostPrice()).isGreaterThan(BigDecimal.valueOf(15.00)));
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
    void findItemArriveDate() {
        List<Groceries> collect = groceries.stream()
                .filter(date -> date.getArrivalDate().compareTo(LocalDate.of(2022, 8, 1)) == 0)
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void earliest5ItemsToArrive() {
        List<Groceries> collect = groceries.stream()
                .sorted(Comparator.comparing(Groceries::getArrivalDate))
                .limit(5)
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void findItemWithLetterA() {
        List<Groceries> collect = groceries.stream()
                .filter(i -> StringUtils.containsIgnoreCase(
                        i.getItem(), "A"))
                .toList();
        collect.forEach(System.out::println);
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
    void AllCarlsbergProducts() {
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
    void ItemWithMinimumQuantity() {
        Groceries minGroceries = groceries
                .stream()
                .min(Comparator.comparing(Groceries::getQuantity))
                .orElse(null);
        System.out.println(minGroceries);
        assertThat(minGroceries).isNotNull();
        assertThat(minGroceries.getQuantity()).isEqualTo(2);
    }

    @Test
    void minQuantityOfEachBrand() {
        List<Groceries> groceryList = groceries.stream()
                .collect(Collectors.groupingBy(
                        Groceries::getBrand,
                        Collectors.minBy(Comparator.comparingLong(Groceries::getQuantity))
                ))
                .values()
                .stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
        System.out.println(groceryList.size());
        groceryList.forEach(System.out::println);
    }

    @Test
    void groupByCountryAndCountAndSortByHighestCount() {
        LinkedHashMap<String, Long> collect = groceries
                .stream()
                .collect(
                        Collectors.groupingBy(Groceries::getCountry, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

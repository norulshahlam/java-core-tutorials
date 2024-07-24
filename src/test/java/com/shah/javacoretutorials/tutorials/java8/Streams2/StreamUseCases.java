package com.shah.javacoretutorials.tutorials.java8.Streams2;

import com.shah.javacoretutorials.model.GroceriesInfo;
import com.shah.javacoretutorials.parallelStreams.InitData;
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

class StreamUseCases {

    List<GroceriesInfo> groceries = null;

    @BeforeEach
    void setUp() throws IOException {
        groceries = InitData.initGroceries();
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
        List<GroceriesInfo> collect = groceries
                .stream()
                .sorted(Comparator.comparing(GroceriesInfo::getQuantity)
                        .reversed())
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void showOnlyUniqueBrandSorted() {
        List<String> items = groceries
                .stream()
                .map(GroceriesInfo::getBrand)
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
        List<GroceriesInfo> list = groceries
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
                        Collectors.groupingBy(GroceriesInfo::getBrand, Collectors.counting()));
        listMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void findItemArriveDate() {
        List<GroceriesInfo> collect = groceries.stream()

                .filter(date -> date.getArrivalDate().isEqual(LocalDate.of(2022, 8, 1)))
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void earliest5ItemsToArrive() {
        List<GroceriesInfo> collect = groceries.stream()
                .sorted(Comparator.comparing(GroceriesInfo::getArrivalDate))
                .limit(5)
                .toList();
        collect.forEach(System.out::println);
    }

    @Test
    void findItemWithLetterA() {
        List<GroceriesInfo> collect = groceries.stream()
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
                        .toMap(GroceriesInfo::getCostPrice,
                                i -> i.getCostPrice().multiply(BigDecimal.valueOf(1.2)),
                                (existing, replacement) -> existing));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }


    @Test
    void AllCarlsbergProducts() {
              List<GroceriesInfo> collect = groceries
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
                        GroceriesInfo::getBrand,
                        Collectors.summingDouble(i -> Double.parseDouble(i.getCostPrice().toString()))));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void itemStatisticsOfEveryProducts() {
        Map<String, LongSummaryStatistics> collect = groceries
                .stream()
                .collect(Collectors.groupingBy(
                        GroceriesInfo::getBrand,
                        Collectors.summarizingLong(GroceriesInfo::getQuantity)));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    void ItemWithMinimumQuantity() {
        GroceriesInfo minGroceriesInfo = groceries
                .stream()
                .min(Comparator.comparing(GroceriesInfo::getQuantity))
                .orElse(null);
        System.out.println(minGroceriesInfo);
        assertThat(minGroceriesInfo).isNotNull();
        assertThat(minGroceriesInfo.getQuantity()).isEqualTo(2);
    }

    @Test
    void minQuantityOfEachBrand() {
        List<GroceriesInfo> groceryList = groceries.stream()
                .collect(Collectors.groupingBy(
                        GroceriesInfo::getBrand,
                        Collectors.minBy(Comparator.comparingLong(GroceriesInfo::getQuantity))
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
                        Collectors.groupingBy(GroceriesInfo::getCountry, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

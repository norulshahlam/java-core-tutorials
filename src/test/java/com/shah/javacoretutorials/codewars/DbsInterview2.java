package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class DbsInterview2 {

    @Test
    void codilityTest3() {
        /*
         * 2D array , find top 3 counter id & total sales
         * input = 2d array, {counter id & total sales} = {1,2},{2,4},{1,3}
         * expected output= {1,5},{2,4}
         */
        int[][] salesData = {
                {1, 2}, {2, 4}, {1, 3}
        };
        int[][] topSalesData = getTopSalesData(salesData);
        for (int[] sale : topSalesData) {
            System.out.println(sale[0] + " : " + sale[1]);
        }
    }

    int[][] getTopSalesData(int[][] salesData) {
        Map<Integer, Integer> counterSalesMap = new HashMap<>();

        // Calculate total sales for each counter
        for (int[] sale : salesData) {
            int counterId = sale[0];
            int sales = sale[1];

            counterSalesMap.put(counterId, counterSalesMap.getOrDefault(counterId, 0) + sales);
        }
        return counterSalesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .limit(3)
                .map(entry -> new int[]{entry.getKey(), entry.getValue()})
                .toList()
                .toArray(new int[0][0]);
    }
}
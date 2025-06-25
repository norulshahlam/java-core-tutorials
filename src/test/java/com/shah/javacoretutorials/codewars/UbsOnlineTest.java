package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UbsOnlineTest {

    @Test
    void name() {

    }

    public static List<List<String>> getProductsSuggestions(List<String> products, String search) {
        Collections.sort(products);

        List<List<String>> output = new ArrayList<>();
        StringBuilder pre = new StringBuilder();

        for (char j : search.toCharArray()) {
            pre.append(j);
            String currPre = pre.toString();

            int start = 0, end = products.size();
            while (start < end) {
                int center = start + (end - start) / 2;
                if (products.get(center).compareTo(currPre) < 0) {
                    start = center + 1;
                } else {
                    end = center;
                }
            }

            List<String> isMmatching = new ArrayList<>();
            for (int i = start; i < Math.min(start + 3, products.size()); i++) {
                if (products.get(i).startsWith(currPre)) {
                    isMmatching.add(products.get(i));
                } else {
                    break;
                }
            }

            if (isMmatching.size() < 3) {
                for (int k = start + isMmatching.size(); k < products.size() && isMmatching.size() < 3; k++) {
                    if (products.get(k).startsWith(currPre)) {
                        isMmatching.add(products.get(k));
                    }
                }
            }
            output.add(isMmatching);
        }
        return output;
    }
}


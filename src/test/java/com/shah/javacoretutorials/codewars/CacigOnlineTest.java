package com.shah.javacoretutorials.codewars;


import org.junit.jupiter.api.Test;

import java.util.*;

class CacigOnlineTest {


    @Test
    void testfilterWords() {
        String[] words = {"the", "dog", "got", "a", "bone"};
        String letters = "z";
        String[] strings = filterWords(words, letters);
        System.out.println(Arrays.toString(strings));
    }


    public static String[] filterWords(String[] words, String letters) {
        Set<Character> setOfLetters = new HashSet<>();
        for (char c : letters.toCharArray())
            setOfLetters.add(c);

        List<String> wordsToFilter = new ArrayList<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (setOfLetters.contains(c)) {
                    wordsToFilter.add(word);
                    break;
                }
            }
        }
        if (wordsToFilter.isEmpty())
            return new String[0];
        return wordsToFilter.toArray(new String[setOfLetters.size()]);
    }


    public static String solve(int width, int height, int length, int mass) {
        int volume = width * height * length;
        boolean bulkyFlag = (volume >= 1000000) || (width >= 150 || height >= 150 || length >= 150);
        boolean heavyFlag = mass >= 20;

        if (bulkyFlag && heavyFlag) {
            return "REJECTED";
        } else if (bulkyFlag || heavyFlag) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    @Test
    void testPPackageSorter() {
        // Example usage
        System.out.println(solve(100, 100, 100, 10));  // Output: STANDARD
        System.out.println(solve(200, 50, 50, 15));   // Output: SPECIAL
        System.out.println(solve(200, 50, 50, 25));   // Output: SPECIAL
        System.out.println(solve(200, 150, 50, 25));  // Output: REJECTED
    }

    public static int luckyMoney(int money, int giftees) {
        if (money < giftees) {
            return 0;
        }
        int luckyEight = money / 8;
        if (money % giftees == 0 && money / giftees == 8) {
            return giftees;
        }

        for (int i = luckyEight; i >= 0; i--) {
            int moneyBal = money - (i * 8);
            int grandchildBal = giftees - i;

            if (grandchildBal > 0 && moneyBal >= grandchildBal && moneyBal % grandchildBal != 4) {
                return i;
            }
        }
        return 0;
    }

    @Test
    void GiftDistribution() {
        // Example usage
        System.out.println(luckyMoney(100, 2));  // Output: 1
        System.out.println(luckyMoney(32, 4));  // Output: 4
        System.out.println(luckyMoney(12, 2));  // Output: 0

    }

}


	



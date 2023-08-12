package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class DbsInterview {

    /*

    11/8/2023
    you are given two 0-indexed 's' and 'target' you can take some letters from 's' and rearrange them to form new strings

    return the maximum number of copies of 'target' that can be performed by taking letters from 's' and rearranging them.

    s = "ilovecodingonleetcode"
    target="code"
    output=2

    s = "abcba"
    target="abc"
    output=1

    s = "abbaccaddaeea"
    target="aaaaa"
    output=1
     */
    @Test
    void test() {
        int i = rearrangeCharacters("ilovecodingonleetcode", "code");
        assertThat(i).isEqualTo(2);

        i = rearrangeCharacters("abcba", "abc");
        assertThat(i).isEqualTo(1);

        i = rearrangeCharacters("abbaccaddaeea", "aaaaa");
        assertThat(i).isEqualTo(1);
    }

    private int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> sFreq = new HashMap<>();
        Map<Character, Integer> targetFreq = new HashMap<>();

        // Count the frequency of characters in 's'
        for (char c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
        }

        // Count the frequency of characters in 'target'
        for (char c : target.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        int maxCopies = Integer.MAX_VALUE;

        // Calculate the maximum possible copies of 'target'
        for (char c : targetFreq.keySet()) {
            if (!sFreq.containsKey(c)) {
                return 0; // Character from 'target' not present in 's'
            }
            int copiesPossible = sFreq.get(c) / targetFreq.get(c);
            maxCopies = Math.min(maxCopies, copiesPossible);
        }
        return maxCopies;
    }
    /*
    Explanation:

    To solve this problem, we can count the frequency of characters in both the given string s and the target string target. Then, we can determine how many copies of the target string can be formed using the characters from the given string s.

    We first count the frequency of characters in both the input string s and the target string target using two hash maps. Then, we calculate the maximum possible copies of the target string by dividing the frequency of each character in s by the frequency of the corresponding character in target. The final result is the minimum of all such values, as we can't form more copies than the limiting factor imposed by the characters in the target string.
     */
}



package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.*;
import static org.assertj.core.api.Assertions.assertThat;


public class LargestFiveDigitNumbersTest {

    /**
     * n the following 6 digit number: 283910
     * 91 is the greatest sequence of 2 consecutive digits.
     * <p>
     * In the following 10 digit number: 1234567890
     * 67890 is the greatest sequence of 5 consecutive digits.
     * <p>
     * Complete the solution so that it returns the greatest sequence of five consecutive digits found within the number given. The number will be passed in as a string of only digits. It should return a five digit integer. The number passed may be as large as 1000 digits.
     */
    @Test
    public void exampleTests1() {
        assertThat(solve("283910")).isEqualTo(83910);
    }

    @Test
    public void exampleTests2() {
        assertThat(solve("1234567890")).isEqualTo(67890);
    }

    @Test
    public void exampleTests3() {
        assertThat(solve("731674765")).isEqualTo(74765);
    }

    public static int solve(final String digits) {
        int largest = MIN_VALUE;
        for (int i = 0; i <= digits.length() - 5; i++) {
            int number = Integer.parseInt(digits.substring(i, i + 5));
            largest = Math.max(number, largest);
        }
        return largest;
    }
}

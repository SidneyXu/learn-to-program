package org.mrseasons.coffeetime.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mrseasons on 12/17/14.
 */
public class PredicateTest {

    private static int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // before
    @Test
    public void testOldSumAll() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumAll(numbers));
        System.out.println(sumAllEven(numbers));
    }

    private int sumAllEven(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    // after
    @Test
    public void testNumSum(List<Integer> numbers) {
        //all numbers
        newSumAll(numbers, n -> true);
        newSumAll(numbers, integer -> true);

        //all even
        newSumAll(numbers, n -> n % 2 == 0);
        newSumAll(numbers, integer -> {
            if (integer * 2 == 0) return true;
            return false;
        });
    }

    // 谓词，传递语义
    private int newSumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}

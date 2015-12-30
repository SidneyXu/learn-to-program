package org.mrseasons.coffeetime.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by mrseasons on 12/10/14.
 */
public class ResourceTest {

    //before
    @Test
    public void testOldUseResource() {
        Res res = new Res();
        try {
            res.operate();
        } finally {
            res.dispose();
        }
    }

    //after
    @Test
    public void testNewUseResource() {
        NRes.withResource(Res::operate);
    }

    //before
    @Test
    public void testOldFilter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            if (number % 2 == 0) {
                int n2 = number * 2;
                if (n2 > 5) {
                    System.out.println(n2);
                    break;
                }
            }
        }
    }

    //after
    @Test
    public void testNewFilter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(n->{
            if (n % 2 == 0) {
                int n2 = n * 2;
                if (n2 > 5) {
                    return false;
                }
            }
            return  true;
        }).forEach(System.out::println);


        //build under version 40
//        numbers.stream().filter(Predicate<Object>::is);

        //stream
//		System.out.println(
//			    numbers.stream()
//			            .filter(Lazy::isEven)
//			            .map(Lazy::doubleIt)
//			            .filter(Lazy::isGreaterThan5)
//			            .findFirst()
//			);

//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//		List<String> filteredNames = names
//		        .filter(e -> e.length() >= 4)
//		        .into(new ArrayList<String>());

    }

    static class Res {
        public Res() {
            System.out.println("open res");
        }

        public void operate() {
            System.out.println("operate");
        }

        public void dispose() {
            System.out.println("dispose");
        }
    }

    // consumer
    static class NRes {

        public static void withResource(Consumer<Res> consumer) {
            Res res = new Res();
            try {
                consumer.accept(res);
            } finally {
                res.dispose();
            }
        }

    }
}

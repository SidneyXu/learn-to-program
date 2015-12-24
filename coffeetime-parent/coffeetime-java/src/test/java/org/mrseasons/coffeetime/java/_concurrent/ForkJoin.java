package org.mrseasons.coffeetime.java._concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Created by mrseasons on 2015/2/28.
 */
public class ForkJoin {
    public static void main(String[] args) {
        String question = "question";
        List<String> baseUrls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            baseUrls.add("base_" + i);
        }
        String result = getFirstResult(question, baseUrls);
        System.out.println(result);
    }

    private static String getFirstResult(String question, List<String> engines) {
        System.out.println(Runtime.getRuntime().freeMemory());
        // get element as soon as it is available
        Optional<String> result = engines.stream().parallel().map((base) -> {
            String url = base + "?q=" + question;
            return connect(url);
        }).findAny();

        System.out.println(Runtime.getRuntime().freeMemory());
        return result.get();
    }

    public static String connect(String url) {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(10_000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return url;
    }
}

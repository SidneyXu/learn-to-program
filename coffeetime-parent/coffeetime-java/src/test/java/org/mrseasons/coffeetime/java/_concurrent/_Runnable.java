package org.mrseasons.coffeetime.java._concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by mrseasons on 2015/2/28.
 */
public class _Runnable {

    public static void main(String[] args) {
        String question = "question";
        List<String> baseUrls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            baseUrls.add("base_" + i);
        }
        String result = getFirstResult(question, baseUrls);
        System.out.println(result);

//        125566608
//        122153208
//        base_31?q=question
    }

    private static String getFirstResult(String question, List<String> baseUrls) {
        System.out.println(Runtime.getRuntime().freeMemory());
        AtomicReference<String> result = new AtomicReference<>();
        for (String base : baseUrls) {
            String url = base + "?q=" + question;
            new Thread(() -> {
                result.compareAndSet(null, connect(url));
            }).start();
        }
        System.out.println(Runtime.getRuntime().freeMemory());
        while (result.get() == null) ; // wait for some result to appear
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

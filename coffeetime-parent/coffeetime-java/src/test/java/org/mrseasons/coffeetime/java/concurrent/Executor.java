package org.mrseasons.coffeetime.java.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

/**
 * Created by mrseasons on 2015/2/28.
 */
public class Executor {
    public static void main(String[] args) {
        String question = "question";
        List<String> baseUrls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            baseUrls.add("base_" + i);
        }
        String result = getFirstResultExecutors(question, baseUrls);
        System.out.println(result);

//        125566608
//        124203280
//        base_2question
    }

    private static String getFirstResultExecutors(String question, List<String> baseUrls) {
        System.out.println(Runtime.getRuntime().freeMemory());
        ExecutorCompletionService<String> service = new ExecutorCompletionService<>(Executors.newFixedThreadPool(10));
        for (String base : baseUrls) {
            String url = base + "?q=" + question;
            service.submit(() -> connect(url));
        }
        System.out.println(Runtime.getRuntime().freeMemory());

        try {
            return service.take().get();
        } catch (InterruptedException | ExecutionException e) {
            return null;
        }
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

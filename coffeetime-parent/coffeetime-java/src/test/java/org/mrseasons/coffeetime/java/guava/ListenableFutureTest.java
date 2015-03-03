package org.mrseasons.coffeetime.java.guava;

import com.google.common.base.Function;
import com.google.common.util.concurrent.*;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by mrseasons on 3/3/15.
 */
public class ListenableFutureTest {

    public static void main(String[] args) {
//        core();

        chain();
    }


    private static void core() {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run at " + Thread.currentThread().getName());
                return random.nextInt(10);
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(executorService);
        for (int i = 0; i < 10; i++) {
            ListenableFuture<Integer> future = listeningExecutorService.submit(callable);
            Futures.addCallback(future, new FutureCallback<Integer>() {
                @Override
                public void onSuccess(Integer result) {
                    System.out.println("result:" + result);
                }

                @Override
                public void onFailure(Throwable t) {
                    t.printStackTrace();
                }
            });
        }
        listeningExecutorService.shutdown();
    }

    private static void chain() {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run at " + Thread.currentThread().getName());
                return random.nextInt(10);
            }
        };
        Callable<String> callable2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "abc";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(executorService);
        ListenableFuture<Integer> firstFuture = listeningExecutorService.submit(callable);
        AsyncFunction<Integer, String> function = new AsyncFunction<Integer, String>() {
            @Override
            public ListenableFuture<String> apply(Integer input) throws Exception {
                System.out.println("input:" + input);
                return listeningExecutorService.submit(callable2);
            }
        };
        ListenableFuture future = Futures.transform(firstFuture, function);
        try {
            String object = (String) future.get();
            System.out.println(object);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        listeningExecutorService.shutdown();
    }


}

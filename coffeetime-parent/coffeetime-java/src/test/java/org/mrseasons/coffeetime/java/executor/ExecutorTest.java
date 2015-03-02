package org.mrseasons.coffeetime.java.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by mrseasons on 3/2/15.
 */
public class ExecutorTest {

    public static void main(String[] args) {
//        testFixedThreadPool();

//        testCachedThreadPool();

//        testCallableWithThread();

//        testCallableWithExecutor();

        testCallableWithCompletionService();
    }

    public static void testFixedThreadPool() {
        Executor executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int n = i;
            executor.execute(() -> {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task " + n + " run at " + Thread.currentThread().getName());
            });
        }

        //shutdown after all tasks completed
        ExecutorService executorService = (ExecutorService) executor;
        executorService.shutdown();
    }

    public static void testCachedThreadPool() {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int n = i;
            executor.execute(() -> {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task " + n + " run at " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }

    public static void testCallableWithThread() {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return random.nextInt(10);
            }
        };
        //FutureTask implements Future and Runnable
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("blocking");
        try {
            Integer result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testCallableWithExecutor() {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(3000) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run at " + Thread.currentThread().getName());
                return random.nextInt(10);
            }
        };
        //FutureTask implements Future and Runnable
        int cpuCoreNumber = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cpuCoreNumber);
        List<FutureTask> futureTasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            FutureTask task = new FutureTask<>(callable);
            futureTasks.add(task);
            executor.execute(task);
        }

        System.out.println("blocking");
        try {
            int result = 0;
            for (FutureTask task : futureTasks) {
                //block until the selected task completed
                Integer r = (Integer) task.get();
                result += r;
                System.out.println(r);
            }
            System.out.println("result is:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }

    public static void testCallableWithCompletionService() {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(3000) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run at " + Thread.currentThread().getName());
                return random.nextInt(10);
            }
        };
        //FutureTask implements Future and Runnable
        int cpuCoreNumber = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cpuCoreNumber);
        //contains a blocking queue
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executor);

        for (int i = 0; i < 10; i++) {
            completionService.submit(callable);
        }

        System.out.println("blocking");
        try {
            int result = 0;
            for (int i = 0; i < 10; i++) {
                //block until the one of tasks completed
                Integer r = completionService.take().get();
                result += r;
                System.out.println(r);
            }

            System.out.println("result is:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}

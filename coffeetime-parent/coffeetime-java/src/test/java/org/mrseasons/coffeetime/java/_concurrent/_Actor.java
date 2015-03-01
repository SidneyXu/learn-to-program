package org.mrseasons.coffeetime.java._concurrent;

import akka.actor.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by mrseasons on 2015/2/28.
 */
public class _Actor {

    public static void main(String[] args) {
        String question = "question";
        List<String> baseUrls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            baseUrls.add("base_" + i);
        }
        String result = getFirstResultActors(question, baseUrls);
        System.out.println(result);

//        125566656
//        113069264
//        base_8?q=question
    }

    private static String getFirstResultActors(String question, List<String> baseUrls) {
        System.out.println(Runtime.getRuntime().freeMemory());

        ActorSystem system = ActorSystem.create("Search");
        AtomicReference<String> result = new AtomicReference<>();

        final ActorRef q = system.actorOf(Props.create(Querier.class, () -> new Querier(question, baseUrls, result)), "master");

        q.tell(new Object(), ActorRef.noSender());
        System.out.println(Runtime.getRuntime().freeMemory());

        while (result.get() == null) ;
        return result.get();
    }

    static class Message {
        String url;

        Message(String url) {
            this.url = url;
        }
    }

    static class Result {
        String html;

        Result(String html) {
            this.html = html;
        }
    }

    static class UrlFetcher extends UntypedActor {

        @Override
        public void onReceive(Object message) throws Exception {
            if (message instanceof Message) {
                Message work = (Message) message;
                String result = connect(work.url);
                getSender().tell(new Result(result), getSelf());
            } else {
                unhandled(message);
            }
        }
    }

    static class Querier extends UntypedActor {
        private String question;
        private List<String> engines;
        private AtomicReference<String> result;

        public Querier(String question, List<String> engines, AtomicReference<String> result) {

            this.question = question;
            this.engines = engines;
            this.result = result;
        }

        @Override
        public void onReceive(Object message) throws Exception {
            if (message instanceof Result) {
                result.compareAndSet(null, ((Result) message).html);
                getContext().stop(self());
            } else {
                for (String base : engines) {
                    String url = base + "?q=" + question;
                    ActorRef fetcher = this.getContext().actorOf(Props.create(UrlFetcher.class), "fetcher-" + base.hashCode());
                    Message m = new Message(url);
                    fetcher.tell(m, self());
                }
            }
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

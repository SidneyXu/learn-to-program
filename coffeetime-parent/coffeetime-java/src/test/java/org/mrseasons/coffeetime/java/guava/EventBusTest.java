package org.mrseasons.coffeetime.java.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import junit.framework.TestCase;

import java.util.Random;
import java.util.concurrent.CountDownLatch;


/**
 * Created by mrseasons on 3/4/15.
 */
public class EventBusTest extends TestCase {

    public void test1() throws InterruptedException {
        EventBus eventBus = new EventBus();

        //register event listener to event producer
        eventBus.register(new EventBusChangeRecorder());

        final CountDownLatch latch = new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ChangeEvent event = new ChangeEvent();

                    //post event to event listener
                    eventBus.post(event);
                    latch.countDown();
                }
            }).start();
        }

        latch.await();

    }

    class ChangeEvent {
        public int getChange() {
            return new Random().nextInt(1000);
        }
    }


    class EventBusChangeRecorder {

        //event listener,public method
        @Subscribe
        public void recordCustomerChange(ChangeEvent e) {
            recordChange(e.getChange());
        }

        private void recordChange(int change) {
            System.out.println(Thread.currentThread().getName() + " record:" + change);
        }
    }

}

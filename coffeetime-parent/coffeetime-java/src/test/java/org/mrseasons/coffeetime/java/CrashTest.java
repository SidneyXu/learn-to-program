package org.mrseasons.coffeetime.java;

import org.junit.*;

public class CrashTest {

    @org.junit.Test
    public void testShutdownHook(){
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println(123456);
            }
        });
        throw new RuntimeException();
    }
}

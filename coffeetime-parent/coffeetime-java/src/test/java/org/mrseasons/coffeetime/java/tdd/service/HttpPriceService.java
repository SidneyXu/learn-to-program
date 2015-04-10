package org.mrseasons.coffeetime.java.tdd.service;

import java.util.Random;

/**
 * Created by mrseasons on 3/2/15.
 */
public class HttpPriceService {
    public static  int getInitialPrice(){
        //access network
        return new Random().nextInt(10);
    }
}
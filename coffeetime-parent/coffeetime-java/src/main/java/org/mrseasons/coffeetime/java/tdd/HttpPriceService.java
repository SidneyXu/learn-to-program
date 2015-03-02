package org.mrseasons.coffeetime.java.tdd;

import java.util.Random;

/**
 * Created by mrseasons on 3/2/15.
 */
class HttpPriceService{
    static  int getInitialPrice(){
        //access network
        return new Random().nextInt(10);
    }
}
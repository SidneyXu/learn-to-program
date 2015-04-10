package org.mrseasons.coffeetime.java.tdd.bean;


import org.mrseasons.coffeetime.java.tdd.service.HttpPriceService;

/**
 * Created by mrseasons on 3/2/15.
 */
public class HttpPrice implements Price{
    @Override
    public int getInitialPrice() {
        return HttpPriceService.getInitialPrice();
    }
}
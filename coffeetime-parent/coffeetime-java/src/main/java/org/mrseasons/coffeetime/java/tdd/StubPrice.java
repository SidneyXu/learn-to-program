package org.mrseasons.coffeetime.java.tdd;

/**
 * Created by mrseasons on 14-12-16.
 */
public class StubPrice implements Price {
    @Override
    public int getInitialPrice() {
        return 10;
    }
}

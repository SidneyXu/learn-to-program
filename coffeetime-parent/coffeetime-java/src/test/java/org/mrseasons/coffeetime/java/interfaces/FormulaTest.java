package org.mrseasons.coffeetime.java.interfaces;

/**
 * Created by mrseasons on 2/3/15.
 */
public interface FormulaTest {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

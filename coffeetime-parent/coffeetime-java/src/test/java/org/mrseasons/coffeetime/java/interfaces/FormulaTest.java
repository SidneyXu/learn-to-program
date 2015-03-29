package org.mrseasons.coffeetime.java.interfaces;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by mrseasons on 2/3/15.
 */
public class FormulaTest extends TestCase {

    @Test
    public void testCore() {
        Formula formual = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        assert 100.0 == formual.calculate(100);
        assert 4.0 == formual.sqrt(16);
    }

    private interface Formula {
        double calculate(int a);

        //接口的默认实现方法
        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }
}

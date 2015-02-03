package org.mrseasons.coffeetime.java.container;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mrseasons on 2/3/15.
 */
public class LambdaTest extends TestCase {


    public void testSort() {
        List<Integer> list = Arrays.asList(5, 6, 2, 12, 8, 1, 20);
        Collections.sort(list, (first, second) -> first - second);
        System.out.println(list);   //[1, 2, 5, 6, 8, 12, 20]
    }
}

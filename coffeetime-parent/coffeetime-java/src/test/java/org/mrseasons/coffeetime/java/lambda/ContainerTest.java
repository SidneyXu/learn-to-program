package org.mrseasons.coffeetime.java.lambda;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mrseasons on 4/10/15.
 */
public class ContainerTest extends TestCase {

    public void testSort() {
        List<Integer> list = Arrays.asList(5, 6, 2, 12, 8, 1, 20);
        Collections.sort(list, (first, second) -> first - second);
        System.out.println(list);   //[1, 2, 5, 6, 8, 12, 20]
    }

    public void testLoop(){
        List<Integer> list = Arrays.asList(5, 6, 2, 12, 8, 1, 20);
        list.forEach(System.out::println);
//        list.forEach(l-> System.out.println(l));
    }
}

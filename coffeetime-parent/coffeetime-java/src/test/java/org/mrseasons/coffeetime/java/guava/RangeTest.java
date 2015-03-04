package org.mrseasons.coffeetime.java.guava;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import junit.framework.TestCase;

/**
 * Created by mrseasons on 3/4/15.
 */
public class RangeTest extends TestCase {

    public void test1() {
        Range<Integer> range = Range.lessThan(5);
        System.out.println(range);
        System.out.println(range.contains(-65535));

        range = Range.range(2, BoundType.CLOSED, 7, BoundType.OPEN);
        System.out.println(range);

        range = Range.openClosed(2, 7);
        System.out.println(range);

        System.out.println(range.lowerEndpoint());
        System.out.println(range.upperEndpoint());


    }
}

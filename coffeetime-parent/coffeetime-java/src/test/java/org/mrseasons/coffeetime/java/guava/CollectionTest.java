package org.mrseasons.coffeetime.java.guava;

import junit.framework.TestCase;

/**
 * Created by mrseasons on 2/3/15.
 */
public class CollectionTest extends TestCase{

    /**
     * JDK 也有提供Collections.unmodifiable之类的方法，但是这些方法返回的结果才是不可变的集合，无法保证原集合是否被改变
     * 且这些不可变的集合保有对原集合的引用，太过笨重
     * Guava 的不可变集合还有一个区别就是不接受null 值
     */
    public void testImmutable(){

    }
}

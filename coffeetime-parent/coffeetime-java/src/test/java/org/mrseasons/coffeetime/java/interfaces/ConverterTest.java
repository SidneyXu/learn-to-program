package org.mrseasons.coffeetime.java.interfaces;

import junit.framework.TestCase;

/**
 * 函数式接口
 * <p/>
 * 一个所谓的函数式接口必须要有且仅有一个抽象方法声明
 * 任意只包含一个抽象方法的接口，我们都可以用来做成lambda表达式
 * 应当在接口前加上@FunctionalInterface 标注，不写也是正确的
 * <p/>
 * Created by mrseasons on 2/3/15.
 */
public class ConverterTest extends TestCase {

    //声明为函数式接口
    @FunctionalInterface
    private interface Converter<F, T> {
        T convert(F from);
    }

    public void testCore() {
        Converter<String, Integer> converter = (from) -> Integer.parseInt(from);
        System.out.println(converter.convert("123"));
    }
}

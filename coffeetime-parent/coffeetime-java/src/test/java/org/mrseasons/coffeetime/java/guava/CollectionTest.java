package org.mrseasons.coffeetime.java.guava;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by mrseasons on 2/3/15.
 */
public class CollectionTest extends TestCase {

    /**
     * JDK 也有提供Collections.unmodifiable之类的方法，但是这些方法返回的结果才是不可变的集合，无法保证原集合是否被改变
     * 且这些不可变的集合保有对原集合的引用，太过笨重
     * Guava 的不可变集合还有一个区别就是不接受null 值
     */
    public void testImmutable() {
        ImmutableSet<Person> persons = ImmutableSet
                .<Person>builder()
                .add(new Person("Jack"))
                .addAll(Arrays.asList(new Person("Jane")))
                .build();
        System.out.println(persons);

        ImmutableSortedSet<String> letters=ImmutableSortedSet.of("a","b","a","c","b","d");
        System.out.println(letters);


    }

    private static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

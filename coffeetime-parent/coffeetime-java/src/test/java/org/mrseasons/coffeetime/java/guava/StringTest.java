package org.mrseasons.coffeetime.java.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by mrseasons on 3/3/15.
 */
public class StringTest extends TestCase {

    class Person{
        private String name;
        public Person(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public void testJoiner(){
        Joiner joiner = Joiner.on("; ").skipNulls();
        String result=joiner.join("a","b",null,"c");
        System.out.println(result); //a; b; c

        joiner=Joiner.on(",").useForNull("empty");
        result=joiner.join(new Person("Peter"), new Person("Anna"),null,new Person("Jack"));
        System.out.println(result); //Peter,Anna,empty,Jack
    }

    public void testSplitter(){
        String str="a, b,c ,d,";
        String[]arr=str.split(",");
        for (String s:arr){
            System.out.print(s + "~");
        }
        System.out.println();

        Splitter splitter=Splitter.on(",").trimResults();
        Iterable<String> iterable=splitter.split(str);
        for (String s:iterable){
            System.out.print(s + "~");
        }
        System.out.println();
    }
}

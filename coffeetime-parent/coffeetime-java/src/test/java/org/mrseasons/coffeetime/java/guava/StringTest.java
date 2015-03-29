package org.mrseasons.coffeetime.java.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by mrseasons on 3/3/15.
 */
public class StringTest extends TestCase {

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

    public void testCharMatcher(){
        String str="123af1.24a3";
        String result= CharMatcher.DIGIT.retainFrom(str);
        System.out.println(result);

        result=CharMatcher.DIGIT.removeFrom(str);
        System.out.println(result);

        result= CharMatcher.JAVA_DIGIT.retainFrom(str);
        System.out.println(result);

        result=CharMatcher.JAVA_DIGIT.removeFrom(str);
        System.out.println(result);

        str=" 123 456 ";
        result=CharMatcher.WHITESPACE.trimAndCollapseFrom(str,'-');
        System.out.println(result);


        str="　 　123　 456　 　";
        result=CharMatcher.WHITESPACE.trimAndCollapseFrom(str,'-');
        System.out.println(result);

        str="　 　123　 456　 　";
        result=CharMatcher.WHITESPACE.trimLeadingFrom(str);
        System.out.println(result);

    }

    class Person {
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

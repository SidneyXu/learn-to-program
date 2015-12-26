package org.mrseasons.coffeetime.java.constructor;

import junit.framework.TestCase;

/**
 * 构造函数引用
 * ::可以用于引用构造函数或静态方法
 * <p/>
 * Created by mrseasons on 2/3/15.
 */
public class ConstructorTest extends TestCase {

    public void testReferStaticMethod() {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;    //startsWith是接口Converter的实现
        String converted = converter.convert("Java");
        System.out.println(converted);    // "J"
    }

    public void testReferConstructor() {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
    }

    @FunctionalInterface
    private interface Converter<F, T> {
        T convert(F from);
    }

    @FunctionalInterface
    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    private static class Something {
        String startsWith(String s) {   //用于实现 Converter 的 convert 方法
            return String.valueOf(s.charAt(0));
        }
    }

    private static class Person {
        String firstName;
        String lastName;

        Person() {
        }

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

}

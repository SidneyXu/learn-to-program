package org.mrseasons.coffeetime.java;

import org.junit.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mrseasons on 12/10/14.
 */
public class Third {

    private static void hello() {
        System.out.println("hello");
    }

    @Test
    public void testOldFunctionalInterface() {
        List<Object> list = new ArrayList<>();
        Button button = new Button();
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                list.add(e.getModifiers());
            }
        });
    }

    @Test
    public void testNewFunctionalInterface() {
        //功能接口，只含一个方法
        List<Object> list = new ArrayList<>();
        Button button = new Button();
        button.addActionListener(e -> {
            list.add(e.getModifiers());
        });
    }

    @Test
    public void testNewMethodRef() {
        // 方法引用
        Arrays.asList("a", "b", "c").forEach(System.out::println);

        Address address = new Address("a", "b");
        Accessor<Address, String> accessor = Address::getCity;
        System.out.println(accessor.access(address));
    }

    interface Accessor<BEAN, PROPERTY> {
        PROPERTY access(BEAN bean);
    }

    class Address {
        String city;

        public Address(String a, String b) {
            city = a + b;
        }

        public String getCity() {
            return city;
        }
    }
}

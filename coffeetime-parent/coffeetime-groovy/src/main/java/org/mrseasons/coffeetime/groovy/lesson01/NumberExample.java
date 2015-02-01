package org.mrseasons.coffeetime.groovy.lesson01;

import java.math.BigDecimal;

/**
 * Created by mrseasons on 2015/2/1.
 */
public class NumberExample {

    public static void main(String[]args){
        System.out.println(3+0.2);

        BigDecimal x=new BigDecimal(3);
        BigDecimal y=new BigDecimal(0.2);
        System.out.println(x.add(y));

        BigDecimal xx=new BigDecimal("3");
        BigDecimal yy=new BigDecimal("0.2");
        System.out.println(xx.add(yy));
    }
}

package org.mrseasons.coffeetime.groovy._07_exception;

/**
 * Created by mrseasons on 2015/3/30.
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    static class MyException extends Exception{}
}

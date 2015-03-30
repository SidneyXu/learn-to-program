package org.mrseasons.coffeetime.groovy._07_exception

/**
 * Created by mrseasons on 2015/3/30.
 */
class exceptionExample {

    static void main(args) {
        throw new MyException();
    }

    static class MyException extends Exception {

    }
}

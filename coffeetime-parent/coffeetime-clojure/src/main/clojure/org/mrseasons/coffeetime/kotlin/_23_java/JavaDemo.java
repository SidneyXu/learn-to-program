package org.mrseasons.coffeetime.kotlin._23_java;

import clojure.lang.ISeq;
import clojure.lang.StringSeq;

/**
 * Created by mrseasons on 2015/07/27.
 */
public class JavaDemo {

    public static void main(String[] args) {
        ISeq seq = StringSeq.create("foobar");
        while (seq != null) {
            Object first = seq.first();
            seq = seq.next();
            System.out.println(first);
        }
    }
}

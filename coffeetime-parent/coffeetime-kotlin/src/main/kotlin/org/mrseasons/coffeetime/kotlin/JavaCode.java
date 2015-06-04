package org.mrseasons.coffeetime.kotlin;


import java.util.HashSet;
import java.util.Set;

public class JavaCode {
    public static Set<String> set =new HashSet<>();

//    private final int i;

    public JavaCode() {
//        this.getClass()
        set.add(this.getClass().getName());
    }
}

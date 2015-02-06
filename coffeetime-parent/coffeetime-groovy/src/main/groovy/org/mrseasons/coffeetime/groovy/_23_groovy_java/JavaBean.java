package org.mrseasons.coffeetime.groovy._23_groovy_java;

/**
 * Created by mrseasons on 2/6/15.
 */
public class JavaBean {

    private String name;

    public JavaBean(String name) {
        this.name = name;
    }

    public int calc(int x, int y) {
        return x + y;
    }

    public String getName() {
        return name;
    }
}

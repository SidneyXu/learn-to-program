package org.mrseasons.coffeetime.java.reflect.model;

/**
 * Created by mrseasons on 2015/06/16.
 */
public class User {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String hello() {
        return "My name is " + name;
    }

    public String echo(String info) {
        return name + " says: " + info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package org.mrseasons.coffeetime.java.tdd;

/**
 * Created by mrseasons on 3/2/15.
 */
public class Ticket {

    private String name;
    private int price;

    public Ticket(String name, int price){
        this.name=name;
        this.price=price;
    }

    public Ticket(Price price){
        this.price=price.getInitialPrice();
    }

    public float getDisountPrice(){
        return price*0.9f;
    }
}
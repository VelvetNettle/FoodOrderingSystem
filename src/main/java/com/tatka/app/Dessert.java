package com.tatka.app;

/**
 * Created by Tatka on 19.02.2017.
 */
public class Dessert extends Product {
    private Kitchen kitchen;

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Dessert(int i) {
        super(i);
    }

    public Dessert(String name, Integer price, Kitchen kitchen) {
        super(name, price);
        this.kitchen = kitchen;
    }
}

package com.tatka.app;

/**
 * Created by Tatka on 19.02.2017.
 */
public class Dish extends Product{
    private Kitchen kitchen;

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Dish(int i) {
        super(i);
    }

    public Dish(String name, Integer price, Kitchen kitchen) {
        super(name, price);
        this.kitchen = kitchen;
    }
}

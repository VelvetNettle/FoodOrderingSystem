package com.tatka.app;

import java.util.List;

/**
 * Created by Tatka on 19.02.2017.
 */
public class Drink extends Product {
    private List<Product> additions;

    public List<Product> getAdditions() {
        return additions;
    }

    public Drink(int i) {
        super(i);
    }

    public Drink(String name, Integer price) {
        super(name, price);
    }

    @Override
    public Integer getPrice(){
        return this.additions.stream().mapToInt(x -> x.getPrice()).sum();
    }
}

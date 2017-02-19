package com.tatka.app;

/**
 * Created by Tatka on 19.02.2017.
 */
public class Product {
    private String name;
    private Integer price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(int index) {

    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

}

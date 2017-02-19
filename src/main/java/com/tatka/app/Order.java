package com.tatka.app;

import java.util.List;

/**
 * Created by Tatka on 19.02.2017.
 */
public class Order {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public Integer getPrice(){
       return this.products.stream().mapToInt(x->x.getPrice()).sum();
    }
}

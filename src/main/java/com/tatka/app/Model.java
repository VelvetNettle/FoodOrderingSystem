package com.tatka.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Tatka on 19.02.2017.
 */
public class Model {
    private MenuHard menu;
    private Order order;


    public Model(MenuHard menu) {
        this.menu = menu;
        this.order = new Order();
    }

    public List<Product> getProducts(Kitchen kitchen) {
        return null;
    }

    public List<Dessert> getDesserts(Kitchen kitchen) {
        return this.menu.getDesserts().stream().filter(x -> x.getKitchen() == kitchen)
                .collect(Collectors.toList());
    }

    public void addProduct(Product product) {
        this.order.getPrice();
    }

    public void editDrink(Product product) {

    }
    public List<Dish> getDishList(Kitchen kitchen) {
        return this.menu.getDishs().stream().filter(x -> x.getKitchen() == kitchen)
                .collect(Collectors.toList());
    }


    public List<Drink> getDrinkList() {
        return this.menu.getDrinks();
    }

    public Integer getPrice() {
        return 0;
    }
}

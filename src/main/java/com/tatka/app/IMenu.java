package com.tatka.app;

import java.util.List;

/**
 * Created by Tatka on 19.02.2017.
 */
public interface IMenu {
    List<Dessert> getDesertList(Kitchen kitchen);

    List<Dish> getDishList(Kitchen kitchen);

    List<Drink> getDrinkList();
}

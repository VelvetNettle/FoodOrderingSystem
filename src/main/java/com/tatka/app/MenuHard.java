package com.tatka.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Tatka on 19.02.2017.
 */
public class MenuHard implements IMenu {

    private List<Dessert> desserts;
    private List<Dish> dishs;
    private List<Drink> drinks;
    private List<Product> additions;

    public MenuHard() {
        this.desserts = new ArrayList<>(6);
        this.desserts.add(new Dessert("sharlotka", 9, Kitchen.POLISH));
        this.desserts.add(new Dessert("cziastko", 5,Kitchen.POLISH));
        this.desserts.add(new Dessert("tiramisu", 12,Kitchen.ITALIAN ));
        this.desserts.add( new Dessert("creme brulee", 10, Kitchen.ITALIAN));
        this.desserts.add (new Dessert("flan", 10, Kitchen.MEXICAN));
        this.desserts.add( new Dessert("pudding", 8, Kitchen.MEXICAN));

        this.dishs = new ArrayList<>(6);
        this.dishs.add( new Dish("zurek", 7, Kitchen.POLISH));
        this.dishs.add( new Dish("bigos", 6, Kitchen.POLISH));
        this.dishs.add( new Dish("pasta", 11, Kitchen.ITALIAN));
        this.dishs.add( new Dish("pizza", 13, Kitchen.ITALIAN));
        this.dishs.add( new Dish("taco", 10, Kitchen.MEXICAN));
        this.dishs.add(new Dish("burrito", 12, Kitchen.MEXICAN));

        this.drinks = new ArrayList<>(4);
        this.drinks.add(new Drink("cola", 5));
        this.drinks.add(new Drink("fresh", 10));
        this.drinks.add(new Drink("tea", 5));
        this.drinks.add(new Drink("coffee", 8));

        this.additions = new ArrayList<>();
        this.additions.add(new Product("ice", 2));
        this.additions.add(new Product("lemon", 1));

    }

    public List<Dessert> getDesserts() {
        return desserts;
    }

    public List<Dish> getDishs() {
        return dishs;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Product> getAdditions() {
        return additions;
    }

    @Override
    public List<Dessert> getDesertList(Kitchen kitchen) {
        return this.desserts.stream().filter(x -> x.getKitchen() == kitchen)
                .collect(Collectors.toList());
    }

    @Override
    public List<Dish> getDishList(Kitchen kitchen) {
        return this.dishs.stream().filter(x -> x.getKitchen() == kitchen)
                .collect(Collectors.toList());
    }

    @Override
    public List<Drink> getDrinkList() {
        return this.drinks;
    }
}

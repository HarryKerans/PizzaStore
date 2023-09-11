package com.pizzamain.food;

import java.util.ArrayList;
import java.util.List;

public class AbstractPizza implements PizzaInterface {
    List<String> Toppings = new ArrayList<>();

    public AbstractPizza(List<String> Toppings) {
        this.Toppings = Toppings;
    }

    public List<String> getToppings() {
        return Toppings;
    }

}

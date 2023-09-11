package com.pizzamain.recipes;

import java.util.ArrayList;
import java.util.List;

public class PizzaRecipes {
    public List<String> Toppings = new ArrayList<>();
    public PizzaRecipes() {

    }
    public List<String> prepareToppings() {
        return Toppings;
    }
}

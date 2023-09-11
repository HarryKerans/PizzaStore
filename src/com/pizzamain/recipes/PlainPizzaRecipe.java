package com.pizzamain.recipes;

import java.util.ArrayList;
import java.util.List;

public class PlainPizzaRecipe extends PizzaRecipes {
    List<String> Toppings = new ArrayList<>();

    public List<String> prepareToppings()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
        return Toppings;
    }


}


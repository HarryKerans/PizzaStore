package com.pizzamain.recipes;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaRecipe extends PizzaRecipes {
    List<String> Toppings = new ArrayList<>();
    public List<String> prepareToppings()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
        Toppings.add("Pineapple");
        Toppings.add("Ham");
        return Toppings;
    }
}

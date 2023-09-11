package com.pizzamain.recipes;

import java.util.ArrayList;
import java.util.List;

public class EmptyPizzaRecipe extends PizzaRecipes {
    List<String> Toppings = new ArrayList<>();
    public List<String> prepareToppings()
    {
        return Toppings;
    }
}

package com.pizzamain.recipes;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizzaRecipe extends PizzaRecipes {
    List<String> Toppings = new ArrayList<>();
    public List<String> prepareToppings()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
        Toppings.add("Pepperoni");
        return Toppings;
    }

}

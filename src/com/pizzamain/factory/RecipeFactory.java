package com.pizzamain.factory;

import com.pizzamain.recipes.*;

public class RecipeFactory {
    public PizzaRecipes prepareRecipe(String pizza) {
        return switch(pizza) {
            case "Pepperoni" -> new PepperoniPizzaRecipe();
            case "Plain" -> new PlainPizzaRecipe();
            case "Hawaiian" -> new HawaiianPizzaRecipe();
            default -> new EmptyPizzaRecipe();
        };
    }
}

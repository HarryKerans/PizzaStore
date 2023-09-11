package com.pizzamain.chef;

import com.pizzamain.food.Pizza;
import com.pizzamain.recipes.PizzaRecipes;

public class Chef implements ChefInterface {
    public Pizza Prepare(PizzaRecipes recipe) {
        return new Pizza(recipe.prepareToppings());
    }
}


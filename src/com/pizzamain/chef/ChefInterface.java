package com.pizzamain.chef;

import com.pizzamain.food.Pizza;
import com.pizzamain.recipes.PizzaRecipes;

public interface ChefInterface {
    public Pizza Prepare(PizzaRecipes recipe);
}

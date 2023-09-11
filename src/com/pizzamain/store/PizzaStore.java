package com.pizzamain.store;

import com.pizzamain.chef.Chef;
import com.pizzamain.factory.RecipeFactory;
import com.pizzamain.food.Pizza;
import com.pizzamain.recipes.PizzaRecipes;

import java.util.ArrayList;
import java.util.List;

public class PizzaStore {

    public List<Pizza> Order(List<String> pizzaOrder) {
        List<Pizza> order = new ArrayList<>();
        RecipeFactory recipeFactory = new RecipeFactory();
        for(String pizza : pizzaOrder) {
            PizzaRecipes recipeToMake = recipeFactory.prepareRecipe(pizza);
            Chef chef = new Chef();
            order.add(chef.Prepare(recipeToMake));
        }
        return order;
    }
}



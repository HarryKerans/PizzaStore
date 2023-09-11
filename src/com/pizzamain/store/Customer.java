package com.pizzamain.store;

import com.pizzamain.food.Pizza;

import java.util.List;

public class Customer {
    private List<Pizza> order;
    public void Order(List<String> pizzaOrder)
    {
        PizzaStore store = new PizzaStore();
        order = store.Order(pizzaOrder);
        InspectPizzaToppings();
    }

    public List<Pizza> InspectPizzaToppings()
    {
        for(Pizza Pizza : order) {
            System.out.println(Pizza.getToppings());
        }
        return order;
    }

}

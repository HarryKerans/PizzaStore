package com.pizzamain.food;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends AbstractPizza{
    public List<String> Toppings = new ArrayList<>();
    public Pizza(List<String> toppings) {
        super(toppings);
        this.Toppings = toppings;
    }
    public List<String> getToppings() {return Toppings;}

}

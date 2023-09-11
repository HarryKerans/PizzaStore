package com.pizzamain;

import com.pizzamain.store.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> PizzaOrder = new ArrayList<>();

        Customer customer = new Customer();

        PizzaOrder.add("Pepperoni");
        PizzaOrder.add("Plain");

        customer.Order(PizzaOrder);

    }
}

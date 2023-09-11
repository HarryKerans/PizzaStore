package testfiles;

import com.pizzamain.store.Customer;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {
    @Test
    public void TestReturnFoo() {
        assertEquals("foo", "foo");
    }

    @Test
    public void TestPepperoniPizzaOrder() {
        List<String> PizzaOrder = new ArrayList<>();
        Customer customer = new Customer();
        PizzaOrder.add("Pepperoni");
        customer.Order(PizzaOrder);
        String[] pizzaTop = {"Tomato", "Cheese", "Pepperoni"};
        List<String> toppings = Arrays.asList(pizzaTop);
        assertEquals(toppings, customer.InspectPizzaToppings().get(0).getToppings());
    }

    @Test
    public void TestPlainPizzaOrder() {
        List<String> PizzaOrder = new ArrayList<>();
        Customer customer = new Customer();
        PizzaOrder.add("Plain");
        customer.Order(PizzaOrder);
        String[] pizzaTop = {"Tomato", "Cheese"};
        List<String> toppings = Arrays.asList(pizzaTop);
        assertEquals(toppings, customer.InspectPizzaToppings().get(0).getToppings());
    }

    @Test
    public void TestEmptyPizzaOrder() {
        List<String> PizzaOrder = new ArrayList<>();
        Customer customer = new Customer();
        PizzaOrder.add("Whatever");
        customer.Order(PizzaOrder);
        String[] pizzaTop = {};
        List<String> toppings = Arrays.asList(pizzaTop);
        assertEquals(toppings, customer.InspectPizzaToppings().get(0).getToppings());
    }

    @Test
    public void TestHawaiianPizzaOrder() {
        List<String> PizzaOrder = new ArrayList<>();
        Customer customer = new Customer();
        PizzaOrder.add("Hawaiian");
        customer.Order(PizzaOrder);
        String[] pizzaTop = {"Tomato", "Cheese", "Pineapple", "Ham"};
        List<String> toppings = Arrays.asList(pizzaTop);
        assertEquals(toppings, customer.InspectPizzaToppings().get(0).getToppings());
    }
}

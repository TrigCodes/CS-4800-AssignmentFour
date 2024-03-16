package Pizza;
import java.util.ArrayList;

public abstract class PizzaFactory 
{
    public enum Size 
    {
        Small,
        Medium,
        Large
    }

    protected Size size;
    protected ArrayList<String> toppings = new ArrayList<>();

    public abstract Pizza create_pizza();

    public PizzaFactory set_size(Size size) 
    {
        this.size = size;
        return this;
    }

    // Topping methods
    public PizzaFactory add_pepperoni() 
    {
        toppings.add("Pepperoni");
        return this;
    }

    public PizzaFactory add_sausage() 
    {
        toppings.add("Sausage");
        return this;
    }

    public PizzaFactory add_mushrooms() 
    {
        toppings.add("Mushrooms");
        return this;
    }

    public PizzaFactory add_bacon() 
    {
        toppings.add("Bacon");
        return this;
    }

    public PizzaFactory add_onions() 
    {
        toppings.add("Onions");
        return this;
    }

    public PizzaFactory add_extra_cheese() 
    {
        toppings.add("Extra Cheese");
        return this;
    }

    public PizzaFactory add_peppers() 
    {
        toppings.add("Peppers");
        return this;
    }

    public PizzaFactory add_chicken() 
    {
        toppings.add("Chicken");
        return this;
    }

    public PizzaFactory add_olives() 
    {
        toppings.add("Olives");
        return this;
    }

    public PizzaFactory add_spinach() 
    {
        toppings.add("Spinach");
        return this;
    }

    public PizzaFactory add_tomato_and_basil() 
    {
        toppings.add("Tomato and Basil");
        return this;
    }

    public PizzaFactory add_beef() 
    {
        toppings.add("Beef");
        return this;
    }

    public PizzaFactory add_ham() 
    {
        toppings.add("Ham");
        return this;
    }

    public PizzaFactory add_pesto() 
    {
        toppings.add("Pesto");
        return this;
    }

    public PizzaFactory add_spicy_pork() 
    {
        toppings.add("Spicy Pork");
        return this;
    }

    public PizzaFactory add_ham_and_pineapple() 
    {
        toppings.add("Ham and Pineapple");
        return this;
    }

    public static class PizzaHutFactory extends PizzaFactory 
    {
        @Override
        public Pizza create_pizza() 
        {
            Pizza pizza = new Pizza("Pizza Hut", this.size, new ArrayList<>(this.toppings));
            this.toppings.clear();
            return pizza;
        }
    }

    public static class LittleCaesarsFactory extends PizzaFactory 
    {
        @Override
        public Pizza create_pizza() 
        {
            Pizza pizza = new Pizza("Little Caesars", this.size, new ArrayList<>(this.toppings));
            this.toppings.clear();
            return pizza;
        }
    }

    public static class DominosFactory extends PizzaFactory 
    {
        @Override
        public Pizza create_pizza() 
        {
            Pizza pizza = new Pizza("Dominos", this.size, new ArrayList<>(this.toppings));
            this.toppings.clear();
            return pizza;
        }
    }
}

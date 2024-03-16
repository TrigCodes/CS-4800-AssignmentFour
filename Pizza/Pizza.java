package Pizza;
import java.util.ArrayList;

public class Pizza 
{
    private String chain;
    private PizzaFactory.Size size;
    private ArrayList<String> toppings;

    public Pizza(String chain, PizzaFactory.Size size, ArrayList<String> toppings) 
    {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() 
    {
        System.out.println("Eating " + chain + " " + size + " pizza with toppings: " + toppings);
    }
}
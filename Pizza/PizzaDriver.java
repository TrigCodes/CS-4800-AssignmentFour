package Pizza;
public class PizzaDriver 
{

    public static void main(String[] args) 
    {
        // Part 1
        PizzaFactory pizza_hut_factory = new PizzaFactory.PizzaHutFactory();

        Pizza pizza_one = pizza_hut_factory
            .set_size(PizzaFactory.Size.Small)
            .add_pepperoni()
            .add_mushrooms()
            .add_onions()
            .create_pizza();

        Pizza pizza_two = pizza_hut_factory
            .set_size(PizzaFactory.Size.Medium)
            .add_pepperoni()
            .add_sausage()
            .add_mushrooms()
            .add_bacon()
            .add_onions()
            .add_extra_cheese()
            .create_pizza();

        Pizza pizza_three = pizza_hut_factory
            .set_size(PizzaFactory.Size.Large)
            .add_pepperoni()
            .add_sausage()
            .add_mushrooms()
            .add_bacon()
            .add_onions()
            .add_extra_cheese()
            .add_peppers()
            .add_chicken()
            .add_olives()
            .create_pizza();

        // Eating the pizzas
        pizza_one.eat();
        pizza_two.eat();
        pizza_three.eat();

        // Part 2
        PizzaFactory little_caesars_factory = new PizzaFactory.LittleCaesarsFactory();
        PizzaFactory dominos_factory = new PizzaFactory.DominosFactory();

        Pizza pizza_four = pizza_hut_factory
            .set_size(PizzaFactory.Size.Large)
            .add_pepperoni()
            .add_sausage()
            .add_mushrooms()
            .create_pizza();

        Pizza pizza_five = pizza_hut_factory
            .set_size(PizzaFactory.Size.Small)
            .add_pepperoni()
            .add_sausage()
            .create_pizza();

        Pizza pizza_six = little_caesars_factory
            .set_size(PizzaFactory.Size.Medium)
            .add_pepperoni()
            .add_sausage()
            .add_mushrooms()
            .add_bacon()
            .add_onions()
            .add_extra_cheese()
            .add_peppers()
            .add_chicken()
            .create_pizza();

        Pizza pizza_seven = little_caesars_factory
            .set_size(PizzaFactory.Size.Small)
            .add_pepperoni()
            .add_sausage()
            .add_mushrooms()
            .add_bacon()
            .add_onions()
            .add_extra_cheese()
            .create_pizza();

        Pizza pizza_eight = dominos_factory
            .set_size(PizzaFactory.Size.Small)
            .add_pepperoni()
            .create_pizza();

        Pizza pizza_nine = dominos_factory
            .set_size(PizzaFactory.Size.Large)
            .add_pepperoni()
            .add_sausage()
            .add_mushrooms()
            .create_pizza();

        // Eating the pizzas
        pizza_four.eat();
        pizza_five.eat();
        pizza_six.eat();
        pizza_seven.eat();
        pizza_eight.eat();
        pizza_nine.eat();
    }

}
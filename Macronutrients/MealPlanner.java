package Macronutrients;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MealPlanner
{
    private Customer customer;
    private MacronutrientFactory carb_factory;
    private MacronutrientFactory protein_factory;
    private MacronutrientFactory fat_factory;

    public MealPlanner(Customer customer) 
    {
        this.customer = customer;
        this.carb_factory = MacronutrientFactory.get_factory(MacronutrientType.CARB);
        this.protein_factory = MacronutrientFactory.get_factory(MacronutrientType.PROTEIN);
        this.fat_factory = MacronutrientFactory.get_factory(MacronutrientType.FAT);
    }

    public List<Food> plan_meal() 
    {
        List<Food> meal = new ArrayList<>();

        // Select Carbs
        String[] carb_options = get_carb_options();
        meal.add(carb_factory.get_food(carb_options[new Random().nextInt(carb_options.length)]));

        // Select Protein
        String[] protein_options = get_protein_options();
        meal.add(protein_factory.get_food(protein_options[new Random().nextInt(protein_options.length)]));

        // Select Fats
        String[] fat_options = get_fat_options();
        meal.add(fat_factory.get_food(fat_options[new Random().nextInt(fat_options.length)]));

        return meal;
    }

    private String[] get_carb_options() 
    {
        switch (customer.get_diet_plan()) 
        {
            case Food.DietPlan.Paleo:
                return new String[] { "Pistachio" };
            case Food.DietPlan.Vegan:
                return new String[] { "Bread", "Lentils", "Pistachio" };
            case Food.DietPlan.NutAllergy:
                return new String[] { "Cheese", "Bread", "Lentils" };
            default:
                return new String[] { "Cheese", "Bread", "Lentils", "Pistachio" };
        }
    }

    private String[] get_protein_options() 
    {
        switch (customer.get_diet_plan()) 
        {
            case Food.DietPlan.Paleo:
                return new String[] { "Fish", "Chicken", "Beef" };
            case Food.DietPlan.Vegan:
                return new String[] { "Tofu" };
            case Food.DietPlan.NutAllergy:
                return new String[] { "Fish", "Chicken", "Beef", "Tofu" };
            default:
                return new String[] { "Fish", "Chicken", "Beef", "Tofu" };
        }
    }

    private String[] get_fat_options() 
    {
        switch (customer.get_diet_plan()) 
        {
            case Food.DietPlan.Paleo:
                return new String[] { "Avocado", "Tuna", "Peanuts"};
            case Food.DietPlan.Vegan:
                return new String[] { "Avocado", "Peanuts" };
            case Food.DietPlan.NutAllergy:
                return new String[] { "Avocado", "Sour cream", "Tuna" };
            default:
                return new String[] { "Avocado", "Sour cream", "Tuna", "Peanuts" };
        }
    }
}

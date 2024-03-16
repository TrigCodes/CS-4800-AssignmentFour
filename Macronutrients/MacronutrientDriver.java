package Macronutrients;
import java.util.List;

public class MacronutrientDriver 
{
    public static void main(String[] args) 
    {
        Customer[] customers = new Customer[] 
        {
                new Customer("Sam", Food.DietPlan.None),
                new Customer("Andy", Food.DietPlan.Vegan),
                new Customer("Kris", Food.DietPlan.NutAllergy),
                new Customer("Chris", Food.DietPlan.Paleo),
                new Customer("Nathaniel", Food.DietPlan.Vegan),
                new Customer("Omar", Food.DietPlan.NutAllergy)
        };

        for (Customer customer : customers) 
        {
            MealPlanner meal_planner = new MealPlanner(customer);
            List<Food> meal = meal_planner.plan_meal();

            System.out.println("Customer: " + customer.get_name() + " (" + customer.get_diet_plan() + ")");

            System.out.println("Meal:");
            meal.forEach(food -> System.out.println("- " + food.get_name()));
            System.out.println();
        }
    }
}
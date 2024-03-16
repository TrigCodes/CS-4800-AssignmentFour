package Macronutrients;

public class Customer 
{
    private String name;
    private Food.DietPlan diet_plan;

    public Customer(String name, Food.DietPlan diet_plan) 
    {
        this.name = name;
        this.diet_plan = diet_plan;
    }

    public String get_name() 
    {
        return name;
    }

    public Food.DietPlan get_diet_plan() 
    {
        return diet_plan;
    }

    @Override
    public String toString() 
    {
        return "Customer {Name = '" + name + "', Diet Plan = '" + diet_plan + "'}";
    }
}
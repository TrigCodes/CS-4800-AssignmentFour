package Macronutrients;

public interface Food
{
    public static enum DietPlan 
    {
        None,
        Paleo,
        Vegan,
        NutAllergy
    }

    String get_name();
}
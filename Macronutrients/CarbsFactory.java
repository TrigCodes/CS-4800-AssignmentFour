package Macronutrients;
import Macronutrients.Foods.*;

public class CarbsFactory extends MacronutrientFactory 
{
    @Override
    public Food get_food(String food) 
    {
        switch (food) 
        {
            case "Cheese":
                return new Cheese();
            case "Bread":
                return new Bread();
            case "Lentils":
                return new Lentils();
            case "Pistachio":
                return new Pistachio();
            default:
                throw new IllegalArgumentException("Unknown Carb Based Food.");
        }
    }
}
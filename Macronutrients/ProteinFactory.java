package Macronutrients;
import Macronutrients.Foods.*;

public class ProteinFactory extends MacronutrientFactory 
{

    @Override
    public Food get_food(String food) 
    {
        switch (food) 
        {
            case "Fish":
                return new Fish();
            case "Chicken":
                return new Chicken();
            case "Beef":
                return new Beef();
            case "Tofu":
                return new Tofu();
            default:
                throw new IllegalArgumentException("Unknown Protein Based Food.");
        }
    }
}
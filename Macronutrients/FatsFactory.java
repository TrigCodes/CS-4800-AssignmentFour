package Macronutrients;
import Macronutrients.Foods.*;

public class FatsFactory extends MacronutrientFactory 
{
    @Override
    public Food get_food(String food) 
    {
        switch (food) {
            case "Avocado":
                return new Avocado();
            case "Sour cream":
                return new SourCream();
            case "Tuna":
                return new Tuna();
            case "Peanuts":
                return new Peanuts();
            default:
                throw new IllegalArgumentException("Unknown Fat Based Food.");
        }
    }
}
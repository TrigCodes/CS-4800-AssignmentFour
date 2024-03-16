package Macronutrients;

public abstract class MacronutrientFactory 
{
    private static CarbsFactory carb_factory_instance;
    private static ProteinFactory protein_factory_instance;
    private static FatsFactory fat_factory_instance;

    protected MacronutrientFactory(){}

    public static MacronutrientFactory get_factory(MacronutrientType type) 
    {
        switch (type) 
        {
            case CARB:
                if (carb_factory_instance == null) 
                {
                    carb_factory_instance = new CarbsFactory();
                }
                return carb_factory_instance;
            case PROTEIN:
                if (protein_factory_instance == null) 
                {
                    protein_factory_instance = new ProteinFactory();
                }
                return protein_factory_instance;
            case FAT:
                if (fat_factory_instance == null) 
                {
                    fat_factory_instance = new FatsFactory();
                }
                return fat_factory_instance;
            default:
                throw new IllegalArgumentException("Factory Does Not Exist.");
        }
    }

    public abstract Food get_food(String food);
}

enum MacronutrientType 
{
    CARB,
    PROTEIN,
    FAT
}
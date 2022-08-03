package factorymethod.DrinkCreators.Abstractions;

import factorymethod.Drinks.Enums.DrinkTypes;
import factorymethod.Drinks.Interfaces.Drink;

public abstract class DrinkCreator {

    public abstract Drink pourDrink();

    /*public abstract Drink pourDrink(DrinkTypes types);*/

    public String displayMessage() {
        return "Take your ";
    }
}

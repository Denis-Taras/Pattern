package factorymethod.DrinkCreators;

import factorymethod.DrinkCreators.Abstractions.DrinkCreator;
import factorymethod.Drinks.Enums.DrinkTypes;
import factorymethod.Drinks.Enums.TeaTypes;
import factorymethod.Drinks.Interfaces.Drink;
import factorymethod.Drinks.Tea.*;

public class TeaCreator extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Tea();
    }

/*    @Override
    public Drink pourDrink(DrinkTypes type) {
        Drink tea = null;
        switch ((TeaTypes) type) {
            case BLACK -> tea = new BlackTea();
            case GREEN -> tea = new GreenTea();
            case WHITE -> tea = new WhiteTea();
            case MILK_OOLONG -> tea = new MilkOolongTea();
        }
        return tea;
    }*/
}

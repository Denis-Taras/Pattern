package factorymethod.DrinkCreators;

import factorymethod.DrinkCreators.Abstractions.DrinkCreator;
import factorymethod.Drinks.Coffee.*;
import factorymethod.Drinks.Enums.CoffeeTypes;
import factorymethod.Drinks.Enums.DrinkTypes;
import factorymethod.Drinks.Interfaces.Drink;

public class CoffeeCreator extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Coffee();
    }

/*    @Override
    public Drink pourDrink(DrinkTypes type) {
        Drink coffee = null;
        switch ((CoffeeTypes) type) {
            case ESPRESSO -> coffee = new Espresso();
            case LATE -> coffee = new Late();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }*/

    public static Drink pourDrink(DrinkTypes type) {
        Drink coffee = null;
        switch ((CoffeeTypes) type) {
            case ESPRESSO -> coffee = new Espresso();
            case LATE -> coffee = new Late();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }
}

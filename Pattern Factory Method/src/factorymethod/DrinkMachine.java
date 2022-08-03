package factorymethod;

import factorymethod.DrinkCreators.Abstractions.DrinkCreator;
import factorymethod.DrinkCreators.CoffeeCreator;
import factorymethod.DrinkCreators.TeaCreator;
import factorymethod.Drinks.Enums.CoffeeTypes;
import factorymethod.Drinks.Enums.TeaTypes;

public class DrinkMachine {

    public static void main(String[] args) {
        System.out.println("Factory Method");

        DrinkCreator teaCreator = new TeaCreator();
        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink();

/*        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink(TeaTypes.MILK_OOLONG);*/

        DrinkCreator coffeeCreator = new CoffeeCreator();
        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink();

/*        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink(CoffeeTypes.CAPPUCCINO);*/

    }
}

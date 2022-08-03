import PiizaBuilder.Builder.Director;
import PiizaBuilder.Builder.PizzaBuilder;
import PiizaBuilder.Builder.PizzaManualBuilder;
import PiizaBuilder.Components.*;
import PiizaBuilder.ManualPizzaConstructor;
import PiizaBuilder.Pizza;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello, Patterns");

       PizzaBuilder builder = new PizzaBuilder();
       Director director = new Director();

       director.constructSeaPizza(builder);
       Pizza seaPizza = builder.getResult();
       System.out.println("Your order is sea pizza: " + seaPizza);

//       director.constructMeatPizza(builder);
//       Pizza meatPizza = builder.getResult();
//       System.out.println("Your order is meat pizza: " + meatPizza);

//       ManualPizzaConstructor meatCheesyHotPizza;
//       PizzaManualBuilder manualBuilder = new PizzaManualBuilder();
//       director.constructMeatPizza(manualBuilder);
//       manualBuilder.addCheese(Cheese.PARMESAN, Cheese.SMETANKOVIY);
//       manualBuilder.addVegetables(Vegetables.CHILI_PEPPER, Vegetables.JALAPENO);
//       manualBuilder.addMeat(Meat.PROSHUTTO);
//       meatCheesyHotPizza = manualBuilder.getResult();
//       System.out.println("Your order: " + meatCheesyHotPizza);
    }
}
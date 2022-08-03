package mediator.SmartHouseController.controllers;

import mediator.SmartHouseController.model.Bedroom;
import mediator.SmartHouseController.model.Garage;
import mediator.SmartHouseController.model.Kitchen;
import mediator.SmartHouseController.model.Status;

import java.util.Scanner;

public class SmartHouseController {

    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(Status.WARM);
        Kitchen kitchen = new Kitchen(Status.BURN_BABY_BURN);
        Garage garage = new Garage(Status.COLD);
        Mediator mediator = new Mediator(bedroom, garage, kitchen);

        String strMethod;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the method: ");

        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "bedroom":
                    mediator.manageTemperature(1);
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                case "garage":
                    mediator.manageTemperature(2);
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                case "kitchen":
                    mediator.manageTemperature(3);
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                case "all":
                    mediator.manageTemperature(0);
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                case "outside":
                    mediator.checkOutsideStatus();
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                default:
                    System.out.println("Wrong method input! Try again");
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;
            }
        }
        reader.close();
    }    
    
}
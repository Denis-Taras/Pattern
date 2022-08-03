package state.droneFlightControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlightControlSystem flightControlSystem = new FlightControlSystem();

        String strMethod;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the action: ");
        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "take off":
                    flightControlSystem.takeOff();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "climb":
                    System.out.print("Enter the altitude: ");
                    while (!(strMethod = reader.nextLine()).equals("back")) {
                        try {
                            int alt = Integer.valueOf(strMethod);
                            if(alt > flightControlSystem.getState().getAltitude()) {
                                flightControlSystem.climb(alt);
                                break;
                            } else {
                                System.out.println("unable climb to altitude below current");
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong number format");
                            break;
                        }
                    }
                    System.out.print("Enter the action: ");
                    break;

                case "descend":
                    System.out.print("Enter the altitude: ");
                    while (!(strMethod = reader.nextLine()).equals("back")) {
                        try {
                            int alt = Integer.valueOf(strMethod);
                            if(alt < flightControlSystem.getState().getAltitude()) {
                                flightControlSystem.descend(alt);
                                break;
                            } else {
                                System.out.println("unable descent to altitude higher current");
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong number format");
                            break;
                        }
                    }
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "land":
                    flightControlSystem.land();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "status":
                    flightControlSystem.getStatusOfFlight();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                default:
                    System.out.println("Wrong action input! Try again");
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;
            }
        }
        reader.close();
    }
}


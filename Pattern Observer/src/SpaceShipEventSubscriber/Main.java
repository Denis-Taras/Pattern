package src.SpaceShipEventSubscriber;

import src.SpaceShipEventSubscriber.controlPanelsSubscribers.MainControlPanel;
import src.SpaceShipEventSubscriber.controlPanelsSubscribers.RemoteControlPanel;
import src.SpaceShipEventSubscriber.events.AirSupplySystemEvents;
import src.SpaceShipEventSubscriber.events.FireSystemEvents;
import src.SpaceShipEventSubscriber.events.PowerSystemEvents;
import src.SpaceShipEventSubscriber.statuses.AirSystemStatus;
import src.SpaceShipEventSubscriber.statuses.FireSystemStatus;
import src.SpaceShipEventSubscriber.statuses.PowerSystemStatus;
import src.SpaceShipEventSubscriber.systemsPublishers.AirSupplySystem;
import src.SpaceShipEventSubscriber.systemsPublishers.FireSystem;
import src.SpaceShipEventSubscriber.systemsPublishers.PowerSupplySystem;
import src.SpaceShipEventSubscriber.systemsPublishers.Publisher;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) {

        AirSupplySystemEvents airSupplySystemEvents = new AirSupplySystemEvents();
        FireSystemEvents fireSystemEvents = new FireSystemEvents();
        PowerSystemEvents powerSystemEvents = new PowerSystemEvents();

        Publisher airSupplySystem = new AirSupplySystem(airSupplySystemEvents);
        Publisher fireSystem = new FireSystem(fireSystemEvents);
        Publisher powerSupplySystem = new PowerSupplySystem(powerSystemEvents);

        MainControlPanel mainControlPanel = new MainControlPanel((AirSupplySystem)airSupplySystem, (FireSystem) fireSystem, (PowerSupplySystem) powerSupplySystem);
        RemoteControlPanel remoteControlPanel = new RemoteControlPanel((AirSupplySystem)airSupplySystem, (FireSystem) fireSystem);

        String strMethod;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the action: ");
        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "subscribe":
                    System.out.print("Enter the device-subscriber name: ");
                    while (!(strMethod = reader.nextLine()).equals("back")) {
                        switch (strMethod) {
                            case "main":
                                System.out.print("Enter the system-publisher name: ");
                                while (!(strMethod = reader.nextLine()).equals("back")) {
                                    switch (strMethod) {
                                        case "air":
                                            airSupplySystem.subscribe(airSupplySystemEvents, mainControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                        case "fire":
                                            fireSystem.subscribe(fireSystemEvents, mainControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                        case "power":
                                            powerSupplySystem.subscribe(powerSystemEvents, mainControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                        default:
                                            System.out.println("Wrong system-publisher name input! Try again");
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                    }
                                }
                                System.out.print("Enter the device-subscriber name: ");
                                break;
                            case "remote":
                                System.out.print("Enter the system-publisher name: ");
                                while (!(strMethod = reader.nextLine()).equals("back")) {
                                    switch (strMethod) {
                                        case "air":
                                            airSupplySystem.subscribe(airSupplySystemEvents, remoteControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                        case "fire":
                                            fireSystem.subscribe(fireSystemEvents, remoteControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                        case "power":
                                            powerSupplySystem.subscribe(powerSystemEvents, remoteControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                        default:
                                            System.out.println("Wrong system-publisher name input! Try again");
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name: ");
                                            break;
                                    }
                                }
                                System.out.print("Enter the device-subscriber name: ");
                                break;
                            default:
                                System.out.println("Wrong device-publisher name input! Try again");
                                System.out.println();
                                System.out.print("Enter the device-publisher name: ");
                                break;
                        }
                    }
                    System.out.print("Enter the action: ");
                    break;

                case "unsubscribe":
                    System.out.print("Enter the device-subscriber name to unsubscribe: ");
                    while (!(strMethod = reader.nextLine()).equals("back")) {
                        switch (strMethod) {
                            case "main":
                                System.out.print("Enter the system-publisher name to unsubscribe: ");
                                while (!(strMethod = reader.nextLine()).equals("back")) {
                                    switch (strMethod) {
                                        case "air":
                                            airSupplySystem.unSubscribe(airSupplySystemEvents, mainControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                        case "fire":
                                            fireSystem.unSubscribe(fireSystemEvents, mainControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                        case "power":
                                            powerSupplySystem.unSubscribe(powerSystemEvents, mainControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                        default:
                                            System.out.println("Wrong system-publisher name to unsubscribe input! Try again");
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                    }
                                }
                                System.out.print("Enter the device-subscriber name to unsubscribe: ");
                                break;
                            case "remote":
                                System.out.print("Enter the system-publisher name to unsubscribe: ");
                                while (!(strMethod = reader.nextLine()).equals("back")) {
                                    switch (strMethod) {
                                        case "air":
                                            airSupplySystem.unSubscribe(airSupplySystemEvents, remoteControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                        case "fire":
                                            fireSystem.unSubscribe(fireSystemEvents, remoteControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                        case "power":
                                            powerSupplySystem.unSubscribe(powerSystemEvents, remoteControlPanel);
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                        default:
                                            System.out.println("Wrong system-publisher name to unsubscribe input! Try again");
                                            System.out.println();
                                            System.out.print("Enter the system-publisher name to unsubscribe: ");
                                            break;
                                    }
                                }
                                System.out.print("Enter the device-subscriber name to unsubscribe: ");
                                break;
                            default:
                                System.out.println("Wrong device-subscriber name input! Try again");
                                System.out.println();
                                System.out.print("Enter the device-subscriber name to unsubscribe: ");
                                break;
                        }
                    }
                    System.out.print("Enter the action: ");
                    break;

                case "normal":
                    ((AirSupplySystem) airSupplySystem).setStatus(AirSystemStatus.NORMAL);
                    ((FireSystem) fireSystem).setStatus(FireSystemStatus.NORMAL);
                    ((PowerSupplySystem) powerSupplySystem).setStatus(PowerSystemStatus.NORMAL);
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "decompression":
                    ((AirSupplySystem) airSupplySystem).setStatus(AirSystemStatus.DECOMPRESSION);
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "fire":
                    ((FireSystem) fireSystem).setStatus(FireSystemStatus.FIRE);
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "reactor":
                    ((PowerSupplySystem) powerSupplySystem).setStatus(PowerSystemStatus.REACTOR_MALFUNCTION);
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "electrical":
                    ((PowerSupplySystem) powerSupplySystem).setStatus(PowerSystemStatus.AUXILIARY_ELECTRICAL_FAILURE);
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "generator":
                    ((PowerSupplySystem) powerSupplySystem).setStatus(PowerSystemStatus.GENERATOR_FAILURE);
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

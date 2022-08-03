package strategy;

import strategy.domain.Order;
import strategy.domain.User;
import strategy.managers.OrderManager;
import strategy.strategies.RegisteredOrderStrategy;
import strategy.strategies.UnregisteredOrderStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> productList = new ArrayList<>();
        int orderCount = 0;
        User authorizedUser = null;
        String address;

        String strMethod;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the action: ");
        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "order":
                    System.out.print("Enter the product: ");
                    while (!(strMethod = reader.nextLine()).equals("stop")) {
                        productList.add(strMethod);
                        System.out.print("Enter the product: ");
                    }
                    System.out.print("Enter the action: ");
                    break;

                case "login":
                    String name;

                    System.out.print("Enter the User name: ");
                    name = reader.nextLine();

                    System.out.print("Enter the User address: ");
                    address = reader.nextLine();

                    authorizedUser = new User(name, address);
                    System.out.println("You have been logged in");
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "logout":
                    authorizedUser = null;
                    System.out.println("You have been logged out");
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "place":
                    if(authorizedUser != null) {
                        orderCount++;
                        OrderManager<RegisteredOrderStrategy> orderManager = new OrderManager<>(RegisteredOrderStrategy::new);
                        orderManager.placeOrder(productList, new Order("Order for: " + authorizedUser.getName()), authorizedUser.getAddress());
                    } else {
                        orderCount++;
                        System.out.print("Enter the User address: ");
                        address = reader.nextLine();
                        OrderManager<UnregisteredOrderStrategy> orderManager = new OrderManager<>(UnregisteredOrderStrategy::new);
                        orderManager.placeOrder(productList, new Order("order" + orderCount), address);
                    }
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

package visitor;

import visitor.messages.LongInformation;
import visitor.messages.ShortInformation;
import visitor.messages.abstractions.Element;
import visitor.visitors.Ticker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        List<Element> listOfMessages = new ArrayList<>();
        Ticker ticker = new Ticker();

        String strMethod;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the method: ");
        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "add":
                    System.out.print("Enter information: ");
                    strMethod = reader.nextLine();
                    if(strMethod.length() < 10) {
                        listOfMessages.add(new ShortInformation(strMethod));
                    } else {
                        listOfMessages.add(new LongInformation(strMethod));
                    }
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                case "remove":
                    System.out.print("Enter the number of information: ");
                    strMethod = reader.nextLine();
                    try {
                        int number = Integer.valueOf(strMethod);
                        listOfMessages.remove(number);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                        System.out.print("Enter the method: ");
                        break;
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Wrong index");
                        System.out.print("Enter the method: ");
                        break;
                    } finally {
                        System.out.println();
                        System.out.print("Enter the method: ");
                        break;
                    }

                case "print":
                    listOfMessages.forEach(m -> {
                        if(m.getClass().equals(LongInformation.class)) {
                            ticker.visit((LongInformation) m);
                        } else if (m.getClass().equals(ShortInformation.class)) {
                            ticker.visit((ShortInformation) m);
                        } else {
                            System.out.println("Wrong format of information");
                        }
                    });
                    System.out.println(ticker);
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;

                default:
                    System.out.println("Wrong method! Try again");
                    System.out.println();
                    System.out.print("Enter the method: ");
                    break;
            }
        }
        reader.close();
    }
}
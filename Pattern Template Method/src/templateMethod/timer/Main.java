package templateMethod.timer;

import templateMethod.timer.abstravtions.AbstractTimer;
import templateMethod.timer.algorithms.KitchenTimer;
import templateMethod.timer.algorithms.WorkTimer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AbstractTimer timer;

        String strMethod;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the timer you need: ");
        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "kitchen":
                    timer = new KitchenTimer();
                    int kitchenTime;
                    System.out.print("Enter the time you need: ");
                    try {
                        kitchenTime = Integer.valueOf(reader.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                        System.out.print("Enter the timer you need: ");
                        break;
                    }
                    timer.startTimer(kitchenTime);
                    System.out.println();
                    System.out.print("Enter the timer you need: ");
                    break;

                case "work":
                    timer = new WorkTimer();
                    int workTime;
                    System.out.print("Enter your work day duration: ");
                    try {
                        workTime = Integer.valueOf(reader.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                        System.out.print("Enter the timer you need: ");
                        break;
                    }
                    timer.startTimer(workTime);
                    System.out.println();
                    System.out.print("Enter the timer you need: ");
                    break;

                default:
                    System.out.println("Wrong timer input! Try again");
                    System.out.println();
                    System.out.print("Enter the timer you need: ");
                    break;
            }
        }
        reader.close();
    }
}

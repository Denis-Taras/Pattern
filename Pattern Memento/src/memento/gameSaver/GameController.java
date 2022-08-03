package memento.gameSaver;

import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {
        final SaveCard card = new SaveCard();
        BattleTank tank = new BattleTank();



        String strMethod;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the action: ");

        while (!(strMethod = reader.nextLine()).equals("exit")) {

            switch (strMethod) {

                case "infantry":
                    tank.attackInfantry();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "armored":
                    tank.armoredVehicleAttack();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "catch shell":
                    tank.getHit();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "mission complete":
                    tank.finishMission();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "status":
                    System.out.println(tank.toString());
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "get saves":
                    card.showSaves();
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "save":
                    card.addSave(tank.saveGame());
                    System.out.println();
                    System.out.print("Enter the action: ");
                    break;

                case "load":
                    System.out.print("Enter the index of save: ");
                    while (!(strMethod = reader.nextLine()).equals("back")) {
                        tank.loadGame(card.loadSave(Integer.valueOf(strMethod)));
                        System.out.println();
                        System.out.print("Enter the action: ");
                        break;
                    }

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

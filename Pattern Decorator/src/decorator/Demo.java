package decorator;

import decorator.advancedCharacters.Warrior;
import decorator.advancedCharacters.Wizard;
import decorator.standartCharacters.Dwarf;
import decorator.standartCharacters.Elf;
import decorator.standartCharacters.Human;
import decorator.abstractMunchkin.Munchkin;

public class Demo {

    public static void main(String[] args) {

        //Munchkin myMunchkin = new Dwarf();
        //Munchkin enemy = new Elf();

        Munchkin myMunchkin = new Warrior(new Dwarf());
        Munchkin enemy = new Wizard(new Elf());
        Munchkin superChar = new Warrior(new Wizard(new Dwarf()));

        /*System.out.println(myMunchkin.getStatus());
        System.out.println();
        System.out.println(enemy.getStatus());
        System.out.println();
        System.out.println(myMunchkin.fight(enemy));*/

        System.out.println(superChar.getStatus());
        System.out.println(myMunchkin.fight(superChar));
    }
}

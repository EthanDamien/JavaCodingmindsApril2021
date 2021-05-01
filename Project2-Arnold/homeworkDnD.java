import java.util.Scanner;

public class homeworkDnD {
    public static void main(String[] args){
        System.out.println("New RPG: Sleigh the Vampire Lord, Santus");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first initial: ");
        String First_Initial = sc.nextLine();
        System.out.println("Enter your middle initial: ");
        String Middle_Initial = sc.nextLine();
        System.out.println("Enter your last name: ");
        String Last_Name = sc.nextLine();
        System.out.println("Enter your HP: ");
        String HP = sc.nextLine();
        System.out.println("Enter your armor rating: ");
        String Defense = sc.nextLine();
        System.out.println("Enter your class: ");
        String Class = sc.nextLine();
        System.out.println("Enter your spell slots: ");
        String Spell = sc.nextLine();
        System.out.println("Enter your preferred weapon: ");
        String Weapon = sc.nextLine();
        System.out.println("Enter your origin: ");
        String Origin = sc.nextLine();
        System.out.println("Is your character undead? ");
        String Undead = sc.nextLine();

        System.out.println(
            "I am"+ First_Initial + " " + Middle_Initial + " " + Last_Name + "and I am a " + Class + " I have " + HP + "HP, " + Defense + "armor");
        System.out.println("My preferred weapon is my mind. My hometown is in a dimension much different than this one called Veggie Tales.");
    }
}

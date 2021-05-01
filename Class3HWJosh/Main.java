import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your character's first name");
        String First = s.nextLine();
        System.out.println("Enter your character's middle initial");
        String Middle = s.nextLine();
        System.out.println("Enter your character's last name");
        String Last = s.nextLine();
        System.out.println("You can be anything you want, just make sure your stats reflect your class" + "\n"+ "For example, a monk, warrior, bard, or snake oil salesman");
        System.out.println("Enter your class");
        String Class = s.nextLine();
        System.out.println("Enter your health points(A level one character has hp between 10 and 25)" + "\n"+ "tanky characters will have more hp");
        Integer hp = s.nextInt();
        if (hp <10){
            System.out.println("Invalid Value, please restart");
            System.exit(0);
        }
        if (hp >25){
            System.out.println("Invalid Value, please restart");
            System.exit(0);
        }
        System.out.println("Enter your armor rating(A level one charater has armor between 20 and 40");
        Integer armor = s.nextInt(); 
        if (armor <20){
            System.out.println("Invalid Value, please restart");
            System.exit(0);
        }
        if (armor >40){
            System.out.println("Invalid Value, please restart");
            System.exit(0);
        }
        System.out.println("Enter the amount of spell slots, the amount of spell slots depends on your class"+"\n"+"Magic people will have up to 6 spell slots while weapon using people will have up to 3 spell slots");
        Integer spellslots = s.nextInt();
        System.out.println("Enter your preferred weapon type");
        String WeaponType = s.nextLine();
        System.out.println("Enter the name of your signature attack or spell");
        String signame = s.nextLine();
        System.out.println("Enter the description of your signature attack or spell, for example:'Cabbage Baggage is a touch range spell that fills the targets bag with cabbage'");
        String sigdesc = s.nextLine();
        System.out.println("Enter your character's origin, for example:'my character hails from the abyssal depths of Michigan lake'");
        String Origin = s.nextLine();
        System.out.println("Is your character undead, answer 'yes' or 'no'");
        String Undead = s.nextLine();
        String x = "";
        if (spellslots>1){
            x += " Spell Slots.";
        }else if (spellslots ==1){
            x += " Spell Slot.";
        }
        System.out.println("I am "+First +" "+Middle+". "+Last +" and I am a " + Class +". I have "+hp +" hp, "+ armor +" armor, and "+ spellslots + x);
        System.out.println("My Signature skill is "+ signame +", "+sigdesc +".");
        System.out.println("My preferred weapon is "+ WeaponType +". " + Origin);
        if (Undead == "yes"){
            System.out.println("I am Undead.");
        }else if (Undead == "no"){
            System.out.println("I am not Undead.");
        }

    }   
}

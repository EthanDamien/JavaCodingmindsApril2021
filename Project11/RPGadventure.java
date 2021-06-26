import java.util.*;
import java.io.*;

public class RPGadventure {
    public static void main(String [] args)throws Exception {
        File f = new File("scores1.txt");
        PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
        Random rand = new Random();
        int Round_Survived = 0;
        String name = "";
        int health = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name, you have just been admitted into roblox!");
        name = s.nextLine();
        System.out.println("Welcome "+ name + " hopefully you die");
        while(true){
            Round_Survived += 1;
            int eventnum = rand.nextInt(2);
            switch(eventnum){
                case 0:
                    health = rollDie(health, rand, s);
                    break;
                case 1:
                    health = devilEncounter(health, rand, s);
                    break;
            }
            System.out.println("\nRound: "+Round_Survived);
            System.out.println("You have " + health + "hp");;
            
            if(health <=0){
                System.out.println("\nYou suck");
                System.out.println("you lived for " + Round_Survived + " rounds in roblox");
                // try{
                //     FileWriter fileWriter = new FileWriter("scores.txt");
                //     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                //     bufferedWriter.write("" +Round_Survived);
                // }
                // catch(IOException e) {
                //     System.out.println("Error writing to file");
                // }
                // break;
                pw.println(Round_Survived);
                pw.close();
                break;
            }
        }
        
    }

    public static int rollDie(int health, Random rand, Scanner s){
        System.out.println("Type anything to roll the die, if you roll an odd number, you gain 1 hp");
        s.nextLine();
        System.out.println("ur rolling the die thing");
        int healthloss = rand.nextInt(5)+1;
        if(healthloss % 2 == 1){
            System.out.println("You rolled a " + healthloss);
            System.out.println("lolugot1hpback");
            return health + 1;
        }
        
        health -= healthloss;
        System.out.println("You lost" + healthloss  + "hp");
        return health;
    }

    public static int devilEncounter(int health, Random rand, Scanner s){
        System.out.println("\nThe devil yeeted and asked you to pick a number from 1-5, you pick wrong and he commit dies you, but if you pick right he will grant you some chicken");
        System.out.println("First choice:");
        int thing = rand.nextInt(5) + 1;
        int healthgain = thing;
        if (s.nextInt() == thing){
            

            health += healthgain;
            System.out.println("You got " + healthgain + "hp" );

            return health;
        }
        else{
            System.out.println("\nSecond choice:");
            if(s.nextInt() == thing){

                health += healthgain;
                System.out.println("You got " + healthgain + "hp" );

                return health;
            }
            else{
                System.out.println("\nThe number was " + healthgain + " you loser");
                health -= thing;
                return health;
            }
        }
        
        
        
    }

}

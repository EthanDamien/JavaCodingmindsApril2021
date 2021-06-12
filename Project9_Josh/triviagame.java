import java.util.*;

public class triviagame {
    public static void main(String args[]){
        // Map<String, Integer> scores = new HashMap<String, Integer>();

        // scores.put("Dababy", 101);
        // scores.put("Jimothy", 1);

        // int value = scores.get("Dababy");
        // System.out.println(value);
        int round = 0;
        int points = 0;
        String PlayerInput = "";
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(input);

        while (!PlayerInput.equals("STOP")){
            System.out.println("Write STOP to stop the game");
            System.out.println("0 for history questions");
            System.out.println("1 for Math questons");
            System.out.println("2 for Minecraft questions");
            System.out.println("3 for Random queston");
            PlayerInput = scan.next();
            System.out.println("Round: "+ round)
            round++;
            System.out.println(PlayerInput);
        }
        public static int history{
        Map<String, String> questions = new HashMap<String, String>();

        questions.put("Who was the first american president?\n (A)Donald Trump (B) Abraham Lincoln (C) John F. Kennedy (D) George Washington", "D")
        return askQuestions(questions);
        }   

        public static int askQuestion(Map<String, String> questions){
        Random random = new Random();
        List<String> keys = new ArrayList<String>(questions.keySet());
        Scanner scan = new Scanner(System.in);
        String randomKey = "";
        String correctAns = "";
        String userAns = "";
        int points = 0;

        randomKey = keys.get(random.nextInt(keys.size()));
        correctAns = questions.get(randomKey);
        System.out.println(randomKey);
        userAns = scan.next();

        if(userAns.equals(correctAns)) {
            System.out.println("You got it right");
            points++;
        }
        else {
            System.out.println("You got it wrong");
        }
        return points;
    
    }   
}


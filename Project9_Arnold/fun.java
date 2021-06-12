import java.util.*;


public class fun {
    public static void main(String args[]){
        // Map<String, Integer> scores = new Hashmap<String, Integer>();

        // scores.put("Bob", 98);
        // scores.put("James", 0);

        // int value = scores.get("Bob");
        // System.out.println(value);
        

        int round = 1;
        int points = 0;
        String playerInput = "";
        Scanner scan = new Scanner(System.in);
        
        while(!playerInput.equals("STOP")){
            System.out.println("Write STOP to stop the game");
            System.out.println("0 for history questions");
            System.out.println("1 for Math questons");
            System.out.println("2 for Minecraft questions");
            System.out.println("3 for Random queston");
            
            playerInput = scan.next();
            if(playerInput.equals("0")){
                points+=history();
            }
            System.out.println("Round: "+ round);
            round++;
            System.out.println(playerInput);
        }
    }

    public static int history(){
        Map<String, String> questions = new HashMap<String, String>();

        questions.put("Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("2Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("3Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");

        return askQuestion(questions);
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

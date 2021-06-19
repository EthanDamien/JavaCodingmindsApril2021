import java.util.*;


public class triviagame {
    public static void main(String args[]){
        // Map<String, Integer> scores = new HashMap<String, Integer>();

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
            else if(playerInput.equals("1")){
                points+=math();
            }
            else if(playerInput.equals("2")){
                points+=minecraft();
            }
            else if(playerInput.equals("3")){
                Random random = new Random();
                int rand = random.nextInt(3);
                switch(rand){
                    case 0:
                        System.out.println("This is a History Question");
                        points+=history();
                        break;
                    case 1:
                        System.out.println("This is a Math Question");
                        points+=math();
                        break;
                    case 2:
                        System.out.println("This is a Minecraft Question");
                        points+=minecraft();
                        break;
                }

                switch(answer){
                    case "Good":
                        System.out.println("This is a History Question");
                        points+=history();
                        break;
                    case "Bad":
                        System.out.println("This is a Math Question");
                        points+=math();
                        break;
                    case "Ugly":
                        System.out.println("This is a Minecraft Question");
                        points+=minecraft();
                        break;
                }
            }
            else{
                System.out.println("Please Enter a Valid Number");
            }
            System.out.println("Round: "+ round);
            round++;
            System.out.println("Current Points: " +points);
        }
    }

    public static int history(){
        Map<String, String> questions = new HashMap<String, String>();

        questions.put("Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("2Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("3Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("2Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("3Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("2Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");
        questions.put("3Who was the first president of the USA?\nA.Abraham Lincoln B.Morgan Freeman C.Donald Trump D.George Washington", "D");

        return askQuestion(questions);
    }

    public static int minecraft(){
        Map<String, String> questions = new HashMap<String, String>();

        questions.put("How many blocks to create a Nether Portal", "10");
        questions.put("Naming Sheep Jeb_ will make it do what?\nA. Eat B. Baa C. Die D. Rainbow", "D");

        return askQuestion(questions);
    }

    public static int math(){
        Map<String, String> questions = new HashMap<String, String>();

        questions.put("1 + 1?", "2");
        questions.put("sin(90)?", "1");

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

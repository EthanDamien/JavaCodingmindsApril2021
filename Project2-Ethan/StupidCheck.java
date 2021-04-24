import java.util.Scanner;

public class StupidCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that is 5");
        int num = sc.nextInt();
        if(num == 5){
            System.out.println("You're not stupid");
        }
        else if(num < 5){
            int i = 0;
            while(i < 10){
                System.out.println("You're pretty darn stupid");
                i++;
            }
        }
        else{
            for(int i = 0; i < 10; i++){
                System.out.println("You're very stupid");
            }
        }

    }
}

import java.util.Scanner;
public class IfElse {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        Integer age = s.nextInt();
        if(age >60){
            System.out.println("You are a boomer");

        }
        else{
            System.out.println("You are not a booomer");
        }
    }
}

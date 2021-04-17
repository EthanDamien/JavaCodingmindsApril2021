import java.util.Scanner;

public class Scantest {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        
        String name = s.nextLine();
        System.out.println("Your name is : " + name);
    }
}

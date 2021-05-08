import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 20){
            System.out.println("Hi, boomer");
        }
        else{
            System.out.println("Hi, Zoomer");
        }
        // if(true){
        //     System.out.println("Chicken");
        // }
    }
}

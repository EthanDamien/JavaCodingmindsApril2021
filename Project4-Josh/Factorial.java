import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int product =1;
        System.out.println("Enter a number to do factorial");
        int num = sc.nextInt();
        int count = 1;
        for(int i = num; i > 0; i--){
            count*=i;

        }
        System.out.println(count);
    }
}

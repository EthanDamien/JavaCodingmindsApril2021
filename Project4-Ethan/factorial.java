import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to do factorial");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            product *= i;
        }
        System.out.println(product);
    }
}

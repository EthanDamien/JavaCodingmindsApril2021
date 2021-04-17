import java.util.Scanner;

public class ScanTestArnold {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = s.nextLine();
        System.out.println("Hello! " + name);

        System.out.println("Enter a number: ");
        String numInput = s.nextLine();

        int num = Integer.parseInt(numInput);

        System.out.println(num);
}

}
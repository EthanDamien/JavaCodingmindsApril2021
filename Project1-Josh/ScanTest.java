import java.util.Scanner;

public class ScanTest {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter your name");
        
        String x = s.nextLine();

        int num = Integer.parseInt(x);
        System.out.println((int)num);
    }
}

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Here are the operations you can choose");
        System.out.println("+, -, *, /, ^, %");
        System.out.println("Choose which one to use:");
        String option = null;
        option = sc.nextLine();
        if(option == "+"){
            addition();
        }
        if(option == "-"){
            subtraction();
        }
        if(option == "*"){
            multiplication();
        }
        if(option =="/"){
            division();

        }
        if(option == "^"){
            exponent();
        }
        if(option == "%"){
            remainder();
        }
    }
    public static void addition(){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter First Number:");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        num2 = sc.nextInt();

        System.out.println("Sum: "+ num1 + num2 );
    }
    public static void subtraction(){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter First Number:");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        num2 = sc.nextInt();
        System.out.println("Difference:" + num1 + num2 );

    }
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter First Number:");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        num2 = sc.nextInt();
        System.out.println("Product:" +num1+num2);
    }
    public static void division(){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter First Number(dividend):");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number(divisor):");
        num2 = sc.nextInt();
        System.out.println("Quotient:" +num1 + num2);
    }
    public static void exponent(){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter First Number(base number):");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number(exponent):");
        num2 = sc.nextInt();
        int product = 1;
        for (int i = 0; i < num2; i++){
            product *= num1;
        }
        System.out.println("Answer:" + product);

    }
    public static void remainder(){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter First Number(dividend):");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number(divisor):");
        num2 = sc.nextInt();
        System.out.println("Remainder:" + num1%num2);
    }
}

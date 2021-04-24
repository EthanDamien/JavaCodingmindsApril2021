import java.util.Scanner;

public class arnoldclass3 {
    public static void main(String[] args){
        //checking:
        //System.out.println("yeet");
        Scanner sc = new Scanner(System.in);
        // get name:
        // System.out.println("Enter Username plz: ");
        // String userName = sc.nextLine();
        // System.out.println("dis ur usename? " + userName);

        //get birth year:
        // System.out.println("gimmer ur birth year plz thank you: ");
        // int birthYear = sc.nextInt();
        // int age = 2021- birthYear;
        // System.out.println("me think ur like " + age + " yrs old");

        System.out.println("Enter a noun: ");
        String noun1 = sc.nextLine();
        System.out.println("Enter a noun: ");
        String noun2 = sc.nextLine();

        System.out.println(noun1 + " ate " + noun2 + ".");
    }
}

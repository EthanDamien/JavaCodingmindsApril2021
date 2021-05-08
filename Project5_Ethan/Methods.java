import java.util.Random;

public class Methods {
    public static void main(String args[]){
        // Random rand = new Random();
        // System.out.println(rand.nextInt(50));
        // int ans = multiply(3,3);

        // System.out.println(ans);

        // System.out.println(isOdd(2));

        // System.out.println(cubeVolume(3));
        //number of chicken per person
        int one = 0;
        int two = 1;
        int three = 4;
        int four = 7;

        int[] chickenholders = new int[10];
        int num = chickenholders.length();
        System.out.println(num);

    }

    public static int multiply(int a, int b){
        return a * b;
    } 

    public static boolean isOdd(int a){
        if(a % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static double cubeVolume(double side){
        double volume = side * side * side;
        return volume;
    }
}


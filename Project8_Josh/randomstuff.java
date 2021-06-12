import java.util.*;
import java.lang.Math;
public class randomstuff {
    public static void main(String args[]){
        // int num = random(-100, 100);
        // System.out.println(num+" " + yes(num));
        int[][] numberss = {{1,2,3,4,5,1,10,4}, {5,2,3,4,1,12,9,7}, {21, 54, 1, -5, 7, 8, 13}};
        int[] numbers = {1,2,3,4,5,1,10,4};
        System.out.println(maximum2d(numberss));
        // System.out.println(minimum(numbers));
        // System.out.println(maximum(numbers));
        // System.out.println(average(numbers));
        // System.out.println(areaOfSquare(10));
        // System.out.println(surfaceAreaOfCube(10));
    }
    public static int random(int x, int y){
        int rand = (int)(Math.random()*((y+1)-x));
        return (rand+x);
    }
    public static boolean yes(int z){
        if (z < 0){
            return false;

        }
        else{
            return true;
        }
    }

    public static int minimum(int numbers[]){
        int min = 2147483647;
        for(int i = 0; i<numbers.length; i++){
            if (numbers[i]<= min){
                min = numbers[i];
            } 
        }
        return min;
    }
    public static int maximum(int numbers[]){
        int max = -2147483648;
        for(int i = 0; i<numbers.length; i++){
            if (numbers[i]>= max){
                max = numbers[i];
            } 
        }
        return max;
    }
    public static int average(int numbers[]){
        int sum = 0;
        int average = 0;
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        average = sum/numbers.length;
        return average;
    }
    public static int areaOfSquare(int side){
        return (side*side);
    }
    public static int surfaceAreaOfCube(int side){
        return (6* areaOfSquare(side));
    }
    public static int maximum2d(int numberss[][]){
        int max = -2147483648;
        for(int i = 0; i<numberss.length; i++){
            for(int j = 0; j<numberss[i].length; j++){
                if (numberss[i][j] > max){
                    max = numberss[i][j];
                }
            }
        }
        return max;
    }
    
}

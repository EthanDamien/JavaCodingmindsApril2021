import java.util.*;
import java.lang.Math;

    public class random {
        
        public static void main(String args[]){
            // get a random number for 100 times, range is your choice
            //for(int i = 1; i <= 100; i++){
            //     int ans = get_random(99, 100);
            //     System.out.println(ans);
            // }

            // thing for checking non-negative
            // int rand = get_random(-3,3);
            // System.out.println(rand);
            // System.out.println(checkNonnegative(rand));
            
            //array for getting min, max, and average
            // int[] numbers = {1,2,3,4,5,1,10,4};
            // System.out.println(get_avg(numbers));

            int[][] arr = new int[2][4];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    arr[i][j] = i + j;
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int get_random(int a, int b){
            int rand = (int)(Math.random() * ((b+1) - a));
            return (rand + a);
        }

        public static boolean checkNonnegative(int a){
            if (a >= 0){
                return true;
            }
            else {
                return false;
            }
        }

        public static void traverse(int numbers[]){
            for(int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);
            }
        }

        public static int get_max(int numbers[]){
            int max = numbers[0];
            for(int i = 0; i < numbers.length; i++){
                if (i > max){
                    max = numbers[i];
                }
            }
            return max;
        }

        public static int get_min(int numbers[]){
            int min = numbers[0];
            for(int i = 0; i < numbers.length; i++){
                if (i < min){
                    min = numbers[i];
                }
            }
            return min;
        }

    public static double get_avg(int numbers[]){
        double sum = 0;
        double average = 0;
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

}
import java.util.*;

import javax.sound.midi.Soundbank;

import java.lang.Math;

public class randomstuff {
    public static void main(String args[]){
        int[][] arr = new int[4][6];
        //traverse 2d array
        
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = r+c;
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void traverse(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}

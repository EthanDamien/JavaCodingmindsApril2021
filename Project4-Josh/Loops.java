import java.util.Scanner;
public class Loops {
    public static void main(String args[]){
        int count = 0;
        while(count<5){
            System.out.println(count);
            count+=1;

        boolean divisible = false;
        int num =17;
        count = 100;
        while(!divisible){
            if (count% num ==0){
                System.out.println(count);
                divisible = true;
            
            }
            else{
                count++;
            }

        }
        }

        for(int i =0; i<5; i++){
            System.out.println(i);
        }
    }
}

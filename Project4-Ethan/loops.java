import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        
        //counts from 0 - 4
        int count = 0;
        while(count < 5){
            System.out.println(count);
            count++;
        }

        //finds the first num that's divisible by 17
        boolean divisible = false;
        int num = 17;
        count = 100;
        while(!divisible){
            if(count % 17 == 0){
                System.out.println(count);
                divisible = true;
                //break;
            }
            else{
                count++;
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}

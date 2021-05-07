public class fruity_loop {
    public static void main(String[] args){
        // while loop: count from 0-4
        int count = 0;
        while(count < 5){
            // System.out.println(count);
            count++;
        }


        // while loop: find first number bigger than 100 that is divisible by 97
        boolean divisible = false;
        int num = 17;
        count = 100;
        while (!divisible){
            if (count % 97 == 0){
                // System.out.println(count);
                divisible = true;   
            }
            else{
                count++;
            }
        }

        // for loop: find first number bigger than 100 that is divisible by 97
        for(int i = 0; i < 903; i++){
            System.out.println(i);
        }

    }
}

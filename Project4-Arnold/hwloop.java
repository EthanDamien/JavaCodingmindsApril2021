public class hwloop {
    public static void main(String[] args){
        // for loop printing even 2-22
        for(int i = 2;i <= 22; i = i + 2){
            System.out.println(i);
        }

        // while loop printing even numbers from 2-22
        boolean end = false;
        int count = 2;
        while (!end){
            if (count <= 22){
                System.out.println(count);
                count = count + 2;
            }
            else{
                end = true;
            }
        }
        
        // for loop odd 1-23
        for(int i = 1;i <= 23; i = i + 2){
            System.out.println(i);
        }

        //compute
        int times = 2;
        int loop = 1;
        for(int i = 1; i <= 8; i++){
            System.out.println("Loop " + loop + ": " + "2^" + loop + " = " + times);
            times = times * 2;
            loop++;
        }
    }
}

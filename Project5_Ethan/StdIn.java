public class StdIn {
    public static void main(String args[]){
        //first argument is the length
        //second argument is the width

        //sanity check
        if(args[0] == null || args[1] == null){
            System.out.println("Why u stupid? Put in a length");
            return;
        }
        for(int i = 0; i < Integer.parseInt(args[1]); i++){
            for(int j = 0; j < Integer.parseInt(args[0]); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

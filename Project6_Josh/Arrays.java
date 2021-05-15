public class Arrays {
    public static void main(String args[]){
        String[] words = {"Bob", "Nice", "Melon", "Ice", "Spice"};
        for(int i = 0;i<words.length;i++){
            if (words[i].length()>=4){
                System.out.println(words[i] + " " + "poop");
            }
            else{
                System.out.println(words[i]);
            }
        }
    }
}

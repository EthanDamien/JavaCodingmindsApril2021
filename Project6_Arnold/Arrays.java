public class Arrays {
    public static void main(String args[]){
        // String[] words = new String[10];
        String[] nice_words = {"Bob", "Nice", "Melon", "Ice", "Spice"};
        System.out.println(("Chicken").length());

        for (int i = 0; i < nice_words.length; i++){
            if (nice_words[i].length() >= 4){
                System.out.println(nice_words[i] + " " + "Poop");
                System.out.println("poop");
            }
            else{
                System.out.println(nice_words[i]);
            }
        }
        // words[0] = "Hell0";
        // System.out.println(words[0]);

        // System.out.println(words);
    }
}

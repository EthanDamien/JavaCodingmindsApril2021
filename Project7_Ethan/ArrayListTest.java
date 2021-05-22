import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ethan");
        System.out.println(names.get(0));

        int[] scores = {1,2,3,4,5};
        for(int score: scores){
            System.out.println(score);
        }
    }
}

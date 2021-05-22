import java.util.Scanner;

public class Crazy {
    public static void main(String args[]){
        String[] students = {
        "James", "Kevin", "Donald", "Josh", "potato", "Casey", "C4CodingMind"
        };
        double[] gpa = {
        1.1, 1.2, 1.4, 1.5, 1.6, 1.7, 2.2
        };
        System.out.println(getGPA("Kevin", students, gpa));
    }
    

    public static double getGPA(String a, String[] students, double[] gpa){ 
        int location = -1;
        for (int i = 0; i < students.length; i++){
            if((students[i]).equals(a)){
                location = i;
            }
        }
        if(location != -1){
            return gpa[location];
        }
        else{
            return -1;
        }
    }

    public static void updateGPA(String name, double newGPA, String[]students, double[]gpa){

    }
    
    
}
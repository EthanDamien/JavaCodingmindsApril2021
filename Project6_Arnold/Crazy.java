import java.util.Scanner;

public class Crazy {
    public static void main(String args[]){
        String[] students = {
        "James", "Kevin", "Donald", "Josh", "potato", "Casey", "C4CodingMind"
        };
        double[] gpa = {
        1.1, 1.2, 1.4, 1.5, 1.6, 1.7, 2.2
        };
        updateGPA(students, gpa);
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

    public static void updateGPA(String[]students, double[]gpa){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name: ");
        String student_name = sc.nextLine();
        System.out.println("enter the new GPA: ");
        double new_gpa = sc.nextDouble();
        for (int i = 0; i < students.length; i++){
            if((students[i]).equals(student_name)){
                gpa[i] = new_gpa;
            }
        }


    }
    
    
}
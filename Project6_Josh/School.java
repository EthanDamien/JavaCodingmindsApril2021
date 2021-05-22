
public class School {
    public static void main(String args[]){
        String[] students = {"James", "Kevin", "Donald", "Josh", "Arnold", "Casey", "C3Codingminds"};
        double[] gpa = {1.1,2.5,3.3,7.3,6.9,2,100};

        System.out.println(getGPA("poop", students, gpa));
        updateGPA("C3Codingminds", students, gpa, 5.3);
        System.out.println(getGPA("C3Codingminds", students, gpa));

    }
    public static double getGPA(String name, String[] students, double[] gpa){
        int position = 0;
        for(int i = 0;i<students.length;i++){
            if (students[i].equals(name)){
                position = i;
                return gpa[i];
            }
        }
        System.out.println("This person does not exist");
        return -1;
    }

    public static void updateGPA(String name, String[] students, double[] gpa, double newGPA){
        for(int i = 0;i<students.length;i++){
            if (students[i].equals(name)){
                gpa[i] = newGPA;
                return;
            }
        }
        System.out.println("Error: This person Does not Exist");
    }

    
}

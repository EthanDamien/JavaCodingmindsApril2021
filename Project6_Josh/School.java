
public class School {
    public static void main(String args[]){
        String[] students = {"James", "Kevin", "Donald", "Josh", "Arnold", "Casey", "C3Codingminds"};
        double[] gpa = {1.1,2.5,3.3,7.3,6.9,2,100};

        System.out.println(getGPA("C3Codingminds", students, gpa));

    }
    public static double getGPA(String name, String[] students, double[] gpa){
        int position = 0;
        for(int i = 0;i<7;i++){
            if (students[i].equals(name)){
                position = i;
                break;
            }
        }
        return gpa[position];
    }
}

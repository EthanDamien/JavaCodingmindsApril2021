import java.util.*;
import java.io.*;

public class horostition {
    public static void main(String [] args) {
        String fileName = "horostitionfile.txt";
        String line = null;
        try{
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner a = new Scanner(System.in);

            System.out.println("What is your element?");
            String ans = a.nextLine();

            while((line = bufferedReader.readLine()) != null) {
                if(line.equals(ans)){
                    System.out.println(bufferedReader.readLine());
                    break;
                }
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file " + fileName);
        }
        catch(IOException ex){
            System.out.println("Error reading file " + fileName);
        }
    }
}

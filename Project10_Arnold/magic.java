import java.io.*;
import java.util.*;

public class magic {
    public static void main(String [] args) {
        String fileName = "potatoes.txt";
        String line = null;

        try{
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello ");
            bufferedWriter.write("I like instant noodles \n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file " + fileName);
        }


        try{
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file " + fileName);
        }
        catch(IOException ex){
            System.out.println("Unable to open file " + fileName);
        }
    }
}
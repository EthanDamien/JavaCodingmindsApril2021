import java.util.*;
import java.io.*;
public class Superstition {
    public static void main(String args[]){
        String fileName = "temp.txt";
        String line = null;

        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readline()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Unable to open "+ fileName);
        }
        catch(IOException ex){
            System.out.println("Error Reading file "+ fileName);
        }

    }

}
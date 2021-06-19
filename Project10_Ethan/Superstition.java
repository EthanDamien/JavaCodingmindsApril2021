import java.io.*;

public class Superstition {
    public static void main(String [] args) {
        String fileName = "temp.txt";
        String line = null;

        try{
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello");
            bufferedWriter.write(" I like cheese\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file "+fileName);
        }




        

        try{
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
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

public class Horostition {
    public static void main(String args[]){
        String line = null;
        String fileName = "Horostitionfile.txt"
        try{
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner a = new Scanner();
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

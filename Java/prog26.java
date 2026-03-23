import java.io.*;
public class Prog26 {
    public static void main(String args[]){
        String filename="file.txt";
        try{
            FileWriter writer=new FileWriter(filename);
            BufferedWriter bWriter=new BufferedWriter(writer);
            bWriter.write("Hello this is a java program");
            bWriter.newLine();
            bWriter.write("This is used to handle files in java");
            bWriter.close();
        }
        catch(IOException e){
            System.out.println("Caught Exception "+e.getMessage());
        }
        try{
            FileReader reader=new FileReader(filename);
            BufferedReader bReader=new BufferedReader(reader);
            String line;
            while((line=bReader.readLine())!=null){
                System.out.println(line);
            }
            bReader.close();
        }
        catch(IOException e){
            System.out.println("Caught Exception "+e.getMessage());
        }
    }
}

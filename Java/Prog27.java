import java.io.*;
public class Prog27 {
    public static void main(String args[]){
        String file1="file.txt";
        String file2="file1.txt";
        try{
            FileReader reader=new FileReader(file1);
            BufferedReader bReader=new BufferedReader(reader);
            FileWriter writer=new FileWriter(file2);
            BufferedWriter bWriter=new BufferedWriter(writer);
            String line;
            while((line=bReader.readLine())!=null){
                bWriter.write(line);
                bWriter.newLine();
            }
            bWriter.close();
            bReader.close();
            System.out.println("Files copied successfully!");
        }
        catch(IOException e){
            System.out.println("Caught Exception "+e.getMessage());
        }
    }
}

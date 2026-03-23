import java.io.*;
public class Prog28 {
    public static void main(String args[]){
        String numFile="numFile.txt";
        String oddFile="oddFile.txt";
        String evenFIle="evenFile.txt";
        try{
            FileReader reader=new FileReader(numFile);
            BufferedReader bReader=new BufferedReader(reader);
            FileWriter oddWriter=new FileWriter(oddFile);
            BufferedWriter oddBWriter=new BufferedWriter(oddWriter);
            FileWriter evenWriter=new FileWriter(evenFIle);
            BufferedWriter evenBWriter=new BufferedWriter(evenWriter);
            String line;
            while((line=bReader.readLine())!=null){
                int num=Integer.parseInt(line.trim());
                if(num%2==0){
                    evenBWriter.write(num+"");
                    evenBWriter.newLine();
                }
                else{
                    oddBWriter.write(num+"");
                    oddBWriter.newLine();
                }
            }
            oddBWriter.close();
            evenBWriter.close();
            bReader.close();
            System.out.println("Files created successfully!");
        }
        catch(IOException e){
            System.out.println("Caught Exception "+e.getMessage());
        }
    }
}

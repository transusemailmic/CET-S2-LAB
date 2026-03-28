import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;
public class Prog25 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{

            // First Part - Listing Files

            System.out.println("Enter a path: ");
            String path=sc.nextLine();
            Path dir=Paths.get(path);
            DirectoryStream<Path> Stream =Files.newDirectoryStream(dir);
            System.err.println(path);
            for(Path file: Stream){
                System.out.println(" "+file.getFileName());
            }


            // Second Part - Searching for a file

            System.out.println("\nEnter the file to search: ");
            String myFile=sc.nextLine();

            found:{
                for(Path file: Files.newDirectoryStream(dir)){
                    if(file.getFileName().toString().equals(myFile)){
                        if(!Files.isRegularFile(file))
                            continue;
                        System.out.println("File Found");
                        break found;
                    }
                }
                System.out.println("File Not found");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}

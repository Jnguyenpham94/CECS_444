package Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyParser {

    public void parseText(File p) {
        try (Scanner scan = new Scanner(p)) 
        {
            while(scan.hasNextLine())
            {
                
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            //e.printStackTrace();
        }
        
    }
    
}

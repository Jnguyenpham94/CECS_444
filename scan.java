
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.awt.Desktop;
import java.io.File;

class Scan{

    //stores the reserved words and output text for scanning
    public static List<String> rwords;
    public static List<String> output;

    String status, f_print;
    int state, counter, buffer;
    HashMap<Integer, String> id = new HashMap<>();

    //scanner stuff goes here
    public static void myScanner() 
    {
        Desktop dtop = Desktop.getDesktop();
        File directory = null;
        try 
        {
            directory = new File(System.getProperty("user.dir"));
            dtop.open(directory);
            rwords = Files.readAllLines(Paths.get("rwords.txt"));
            for (String string : rwords) 
            {
                System.out.println(string);
            }
            output = Files.readAllLines(Paths.get("sample.txt"));
            for (String string : output) 
            {
                System.out.println(string);
            }
        } 
        catch (IllegalArgumentException iae)
        {
            System.out.println("File not found");
        }
        catch (Exception e) 
        {
            System.exit(1);
        }
        //TODO: continue here
    }

    public static void main(String[] args) 
    {
        myScanner();
    }
}
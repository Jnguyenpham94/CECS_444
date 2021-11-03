
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Scan{

    public static List<String> rwords;

    public static void myScanner() 
    {
        try 
        {
            //FileReader fr = new FileReader("rwords.txt");
            rwords = Files.readAllLines(Paths.get("rwords.txt"));
            for (String string : rwords) {
                System.out.println(string);
            }
            //fr.close();
        } 
        catch (Exception e) 
        {
            System.exit(1);
        }
    }

    public static void main(String[] args) 
    {
        myScanner();
    }
}
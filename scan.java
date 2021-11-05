
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.awt.Desktop;
import java.io.File;

class Scan {

    // stores the reserved words and output text for scanning
    public static List<String> rwords;
    public static List<String> output;
    public static List<String> scanFile;

    public static String status, f_print;
    public static int state, counter, buffer = 0;
    HashMap<Integer, String> id = new HashMap<>();

    // scanner stuff goes here
    public static void myScanner() {
        //Desktop dtop = Desktop.getDesktop();
        //File directory = null;
        try {
            /*
             * directory = new File(System.getProperty("user.dir")); dtop.open(directory);
             * scanFile = Files.readAllLines(Paths.get(directory.toString())); for (String
             * string : scanFile) { System.out.println(string); }
             */
            rwords = Files.readAllLines(Paths.get("rwords.txt"));
            for (String string : rwords) {
                System.out.println(string);
            }
            output = Files.readAllLines(Paths.get("sample.txt"));
            for (String string : output) {
                System.out.println(string);
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.exit(1);
        }
        // TODO: continue here
        while (counter < output.size()) {
            
        }
    }

    public static void main(String[] args) {
        myScanner();
    }
}
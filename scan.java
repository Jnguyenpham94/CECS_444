
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
//import java.awt.Desktop;
//import java.io.File;

class Scan {

    // stores the reserved words and output text for scanning
    public static List<String> rwords;
    public static List<String> output;
    public static List<String> scanFile;

    public static String status, f_print;
    public static int state, counter, buffer = 0;
    public static HashMap<Integer, String> tokens = new HashMap<>();

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
            //for (String string : rwords) {
            //    System.out.println(string);
            //}
            output = Files.readAllLines(Paths.get("sample.txt"));
            scanFile = Files.readAllLines(Paths.get("tokens.txt"));
            for (int i = 0; i < scanFile.size(); i++) 
            {
                String [] temp = scanFile.get(i).split(":(?!\\s)");
                tokens.put(i, temp[0]);
            }
            for (String s : tokens.values()) {
                System.out.println(s);
            }
            //remove whitespace
            for (int i = 0; i < output.size(); i++) {
               String temp = output.get(i).trim();
               //temp = output.get(i).split("\\n|;").toString();
               output.set(i, temp);
            }
            System.out.println(output);
        } catch (IllegalArgumentException iae) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.exit(1);
        }
        // TODO: continue here
        while (counter < output.size()) {
            String token = output.get(counter);
            tokens toks = new tokens();
            int current_read = toks.getToken(token);
            if (toks == null) {
                
            }
        }
    }

    public static void main(String[] args) {
        myScanner();
    }
}
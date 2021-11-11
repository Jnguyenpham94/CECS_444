
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
            rwords = Files.readAllLines(Paths.get("rwords.txt"));
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
        while (counter < output.size()) {
            statetable st = new statetable();
            actiontable act = new actiontable();
            lookuptable lk = new lookuptable();
            String token = output.get(counter);
            tokens toks = new tokens();
            int current_read = toks.getToken(token);
            if (st.getTable(state, current_read) != -1 && (act.getTable(state, current_read) == 1)) {
                status = status + toks;
            }
            else if (st.getTable(state, current_read) == -1 && (act.getTable(state, current_read) == 2)){
                buffer = 1;
                var result = codes.getCodes(lk.getTable(state, current_read));
                if (result == "id"){
                    if (check_rword(status) == true){
                        result = "reservedword";
                    }
                    else{// TODO: continue here
                        if(status){
                            tokens[status] += 1;
                        }
                        else{
                            tokens[status] = 1;
                        }
                    }
                }
            }
        }
    }

    public static boolean check_rword(String word)
    {
        int counter = 0; 
        int value = 0;
        for (int i = 0; i < rwords.size(); i++){
            if (rwords.get(counter) == word){
                value = 1;
            }
            counter += 1;
        }
        if (value == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        myScanner();
    }
}
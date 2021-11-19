
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

class Scan {

    // stores the reserved words and output text for scanning
    public static List<String> rwords;
    public static List<String> output;

    public static String status, f_print, token;
    public static int state, counter, buffer, current_read = 0;
    public static HashMap<String, Integer> tokens = new HashMap<>();
    

    // scanner stuff goes here
    public static <T> void myScanner() {
        try {
            rwords = Files.readAllLines(Paths.get("rwords.txt"));
            output = Files.readAllLines(Paths.get("sample_output.txt"));
            StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) 
        {
 
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) 
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
            //remove whitespace
            for (int i = 0; i < output.size(); i++) {
               String temp = output.get(i).trim();
               //temp = output.get(i).split("\\n|;").toString();
               output.set(i, temp);
            }
            //System.out.println(output);
        } catch (IllegalArgumentException iae) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.exit(1);
        }

        statetable st = new statetable();
        actiontable act = new actiontable();
        lookuptable lk = new lookuptable();
        tokens toks = new tokens();

        while (counter < output.size()) {
            //TODO: problem HERE!!! the token in the front is not recognized but instead the entire String is
            token = output.get(counter);
            current_read = toks.getToken(token);

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
                    else{
                        if(tokens.containsKey(status)){
                            tokens.put(status, tokens.get(status) + 1);
                        }
                        else{
                            tokens.put(status, 1);
                        }
                    }
                }
                if (result != "space"){
                    f_print += "Token Discovered is " + result + " -> " + status.trim() + "\n";
                }
                state = 0;
                status = "";
            }
            if (buffer != 1){
                counter += 1;
            }
            else{
                buffer = 0;
            }
        }
        output<T> out = new output<>();
        out.out_gui("Tokens Scanned: ", "Scanner", f_print);
        out.output_map(tokens);
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
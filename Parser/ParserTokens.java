package Parser;

import java.util.ArrayList;
import java.util.HashMap;

public class ParserTokens {
    
    static String token_lookup[] = {"0","library","program","id",";","var",":",",","int","real","sci","currency",
                        "string","begin","return",":=","device_open","file","for","to","do","repeat",
                        "until","(",")","while","if","then","else","device_close","read_from_device",
                        "write_to_device","writeln","readln","<",">","<=",">=","==","!=","+","-","*",
                        "/","abs","fabs","stop","$"};

    public static HashMap<Integer, int[]> valMap = new HashMap<>(){{
        put(1, new int[]{4,2,3});
    }};
    
    public static String getToken(int token) {
        var tVal = "0";
        try{
            tVal = token_lookup[token];
        }
        catch(Exception b){
            return "0";
        }
        return String.valueOf(Integer.parseInt(tVal) * -1);
    }

    public int[] getVal(int token) {
        int[] pval = {};
        if (token == 0) {
            System.out.println("Read error");
            System.exit(1);
        }
        else if(token == 61){
            System.out.println("Scan error");
            System.exit(1);
        }
        else if(token == 62){
            System.out.println("Pop error");
            System.exit(1);
        }

        try {
            pval = valMap.get(token);
        } catch (Exception e) {
            return new int[]{}; //empty anon array
        }
        
        return pval;
    }
}

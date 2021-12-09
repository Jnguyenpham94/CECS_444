package Parser;

import java.util.HashMap;

public class ParserTokens {
    
    static String token_lookup[] = {"0","library","program","id",";","var",":",",","int","real","sci","currency",
                        "string","begin","return",":=","device_open","file","for","to","do","repeat",
                        "until","(",")","while","if","then","else","device_close","read_from_device",
                        "write_to_device","writeln","readln","<",">","<=",">=","==","!=","+","-","*",
                        "/","abs","fabs","stop","$"};

    public static HashMap<Integer, int[]> valMap = new HashMap<>(){{
        put(1, new int []{4,2,3});
        put(2, new int []{4});
        put(3, new int []{2,3});                
        put(5, new int []{-1});                  
        put(6, new int []{5});                              
        put(8, new int []{23,12,6,-4,-3,-2});              
        put(9, new int []{7,-4,11,-6,8,-5});
        put(10, new int[]{7,-4,11,-6,8}); 
        put(12, new int[]{9,10}); 
        put(13, new int[]{9,10,-7}); 
        put(15, new int[]{-3}); 
        put(16, new int[]{-8}); 
        put(17, new int[]{-9}); 
        put(18, new int[]{-10}); 
        put(19, new int[]{-11}); 
        put(20, new int[]{-12}); 
        put(21, new int[]{-4,-8,-14,13,-13}); 
        put(22, new int[]{14,15}); 
        put(23, new int[]{14,15});
        put(25, new int[]{-4,18,-15,-3});
        put(26, new int[]{-4,-17,-16});
        put(27, new int[]{-4,-20,23,13,-20,-3,-19,-3,-15,-3,-18});
        put(28, new int[]{-4,-20,23,-24,16,-23,-22,13,-20,-21});
        put(29, new int[]{-4,-20,23,13,-20,-24,16,-23,-25});
        put(30, new int[]{-4,23,13,-13,-28,-4,23,13,-13,-27,-24,16,-23,-26});
        put(31, new int[]{-4,-17,-29});
        put(32, new int[]{-4,-17,-30});
        put(33, new int[]{-4,-17,-31});
        put(34, new int[]{-4,-24,18,-23,-32});
        put(35, new int[]{-4,-24,8,-23,-33});
        put(36, new int[]{18,17,18});
        put(37, new int[]{-34});
        put(38, new int[]{-35});
        put(39, new int[]{-36});
        put(40, new int[]{-37});
        put(41, new int[]{-38});
        put(42, new int[]{-39});
        put(43, new int[]{19,20});
        put(44, new int[]{-12});
        put(45, new int[]{19,20,-41});
        put(46, new int[]{19,20,-41});
        put(48, new int[]{21,22});
        put(49, new int[]{21,22,-43});
        put(50, new int[]{21,22,-43});
        put(52, new int[]{-24,18,-23});
        put(53, new int[]{-3});
        put(54, new int[]{-8});
        put(55, new int[]{-9});
        put(56, new int[]{-10});
        put(57, new int[]{-11});
        put(58, new int[]{-24,18,-23,-44});
        put(59, new int[]{-24,18,-23,-44});
        put(60, new int[]{-46});
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

    public static int[] getVal(int token) {
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

package Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MyParser {

    public static String everything = "";
    public static ArrayList<String> scanResult = new ArrayList<>();
    public static ArrayList<Integer> valResult = new ArrayList<>();
    public Stack<Integer> stk = new Stack<>();
    int counter = 0;
    int topStack = 0;

    public void parseText(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine().strip();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                everything = sb.toString();
            } finally {
                br.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            // e.printStackTrace();
        } catch (IOException io) {
            System.out.println("Input Error");
        }
        System.out.println(everything);
        
        //removing the unneeded words
        //remove "Token Discovered is " & "->""
        everything = everything.replaceAll("Token Discovered is", "");
        everything = everything.replaceAll(" ->", "");
        System.out.println("REPLACED");
        System.out.println(everything);
        stk.push(1);
        String tem[] = everything.strip().split(" ");
        //fill arraylist with scanned results
        for (String string : tem) {
            string = string.trim();
            if (!string.equals("")) {
                scanResult.add(string);
            }
        }
        removeFromList(scanResult, "comment");
        System.out.print(scanResult);
        
        //reverse the arraylists for stack popping
        Collections.reverse(valResult);
        Collections.reverse(scanResult);
        
        //contains final print stuff
        String parserPrint = "";
        
        ParserTokens pt = new ParserTokens();
        while(counter < scanResult.size()){
            valResult.add(pt.getToken(Integer.parseInt(scanResult.get(counter))));
        }

        while (valResult.size() > 0) {
            try {
                topStack = stk.lastElement(); //top of stack aka first to be popped
            } catch (Exception e) {
                try {
                    topStack = stk.firstElement(); //bottom of stack
                } catch (Exception f) {
                    System.out.println("STACK EMPTY. Something went wrong. GOODBYE!");
                    System.exit(1);
                }
            }
            
        }

        var tokenNum = valResult.get(valResult.size()-1);
        var currentToken = scanResult.get(scanResult.size() - 1);

        if (topStack > 0) {
            
        }
        else if(topStack <= tokenNum){
            parserPrint += "Match and Pop" + " ";
            
            if(currentToken == "stop"){
                parserPrint += "Goooaaal!!!" + "\n";
                System.exit(1);
            }
            //popping values from stack and arraylists
            stk.pop();
            scanResult.remove(scanResult.size() - 1);
            valResult.remove(valResult.size() - 1);
        }
        else{
            System.out.println("ERROR. DEAD");
            System.exit(1);
        }
    }

    public void removeFromList(ArrayList<String> list, String word) {
        ArrayList<String> del = new ArrayList<>();
        del.add(word);
        if (list.contains(word)) {
            list.removeAll(del);
        }
    }
}
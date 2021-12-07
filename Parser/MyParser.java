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
    public static ArrayList<String> valResult = new ArrayList<>();
    public Stack<String> stk = new Stack<>();
    int counter = 0;

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
        stk.push("1");
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
        ArrayList<String> parserPrint = new ArrayList<>();
    }

    public void removeFromList(ArrayList<String> list, String word) {
        ArrayList<String> del = new ArrayList<>();
        del.add(word);
        if (list.contains(word)) {
            list.removeAll(del);
        }
    }
}
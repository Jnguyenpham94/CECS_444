package Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyParser {

    public static String everything = "";

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
    }
}

public class tokens {
    public int getToken(String strings){
        int val = 0;
        if (strings.equals("`")) 
                val = 0;

        else if (strings.equals("<"))
            val = 1;    

        else if (strings.equals(">"))
            val = 2;

        else if (strings.equals("["))
            val = 3;

        else if (strings.equals( "]"))
            val = 4;

        else if (strings.equals( "{"))
            val = 5;

        else if (strings.equals("}"))
            val = 6;

        else if (strings.equals("@"))
            val = 7; 

        else if (strings.equals("&"))
            val = 8;
                
        else if (strings.equals("#"))
            val = 9;
                
        else if (strings.equals("!"))
            val = 10;
                
        else if (strings.equals("~"))
            val = 11;
            
        else if (strings.equals("'"))
            val = 12;
                
        else if (strings.equals("\""))
            val = 13;
                
        else if (strings.equals("$"))
            val = 14;
                
        else if (strings.equals(":"))
            val = 15;   

        else if (strings.equals(";"))
            val = 16;  

        else if (strings.equals("."))
            val = 17;  

        else if (strings.equals(","))
            val = 18;    

        else if (strings.equals("+"))
            val = 19;    
                
        else if (strings.equals("-"))
            val = 20;

        else if (strings.equals("/"))
            val = 21;   

        else if (strings.equals("\\"))
            val = 22; 

        else if (strings.equals("*"))
            val = 23; 

        else if (strings.equals("="))
            val = 24;  

        else if (strings.equals("^"))
            val = 25;

        else if (strings.equals("("))
            val = 26;

        else if (strings.equals("))"))
            val = 27;

        else if (strings.equals("^[a-zA-Z]*$")) //is alphabet in regex
            val = 28;

        else if (strings.equals("\\d+"))//is digit in regex
            val = 29;

        else if (strings.equals(" "))
            val = 30; 

        else if (strings.equals("_"))
            val = 31;
            
        else
            val = 32;
            
        return val;
    
    }
}

public class tokens {
    public int getToken(String strings){
        int val = 0;
        if (strings == "`") 
                val = 0;
                
        else if (strings == "<")
            val = 1;    

        else if (strings == ">")
            val = 2;

        else if (strings == "[")
            val = 3;

        else if (strings ==  "]")
            val = 4;

        else if (strings ==  "{")
            val = 5;

        else if (strings == "}")
            val = 6;

        else if (strings == "@")
            val = 7; 

        else if (strings == "&")
            val = 8;
                
        else if (strings == "#")
            val = 9;
                
        else if (strings ==  "!")
            val = 10;
                
        else if (strings == "~")
            val = 11;
            
        else if (strings == "'")
            val = 12;
                
        else if (strings == "\"")
            val = 13;
                
        else if (strings == "$")
            val = 14;
                
        else if (strings == ":")
            val = 15;   

        else if (strings == ";")
            val = 16;  

        else if (strings == ".")
            val = 17;  

        else if (strings == ",")
            val = 18;    

        else if (strings == "+")
            val = 19;    
                
        else if (strings == "-")
            val = 20;

        else if (strings == "/")
            val = 21;   

        else if (strings == "\\")
            val = 22; 

        else if (strings == "*")
            val = 23; 

        else if (strings == "=")
            val = 24;  

        else if (strings == "^")
            val = 25;

        else if (strings == "(")
            val = 26;

        else if (strings == ")")
            val = 27;

        else if (strings == "^[a-zA-Z]*$") //is alphabet in regex
            val = 28;

        else if (strings == "\\d+")//is digit in regex
            val = 29;

        else if (strings == " ")
            val = 30; 

        else if (strings == "_")
            val = 31;
            
        else
            val = 32;
            
        return val;
    
    }
}
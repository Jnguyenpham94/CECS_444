
public class tokens {
    public int getToken(char token){
        int val = 0;
        if (token == ('`')) 
                val = 0;

        else if (token == ('<'))
            val = 1;    

        else if (token == ('>'))
            val = 2;

        else if (token == ('['))
            val = 3;

        else if (token == ( ']'))
            val = 4;

        else if (token == ( '{'))
            val = 5;

        else if (token == ('}'))
            val = 6;

        else if (token == ('@'))
            val = 7; 

        else if (token == ('&'))
            val = 8;
                
        else if (token == ('#'))
            val = 9;
                
        else if (token == ('!'))
            val = 10;
                
        else if (token == ('~'))
            val = 11;
            
        else if (token == ('\''))
            val = 12;
                
        else if (token == ('\"'))
            val = 13;
                
        else if (token == ('$'))
            val = 14;
                
        else if (token == (':'))
            val = 15;   

        else if (token == (';'))
            val = 16;  

        else if (token == ('.'))
            val = 17;  

        else if (token == (','))
            val = 18;    

        else if (token == ('+'))
            val = 19;    
                
        else if (token == ('-'))
            val = 20;

        else if (token == ('/'))
            val = 21;   

        else if (token == ('\\'))
            val = 22; 

        else if (token == ('*'))
            val = 23; 

        else if (token == ('='))
            val = 24;  

        else if (token == ('^'))
            val = 25;

        else if (token == ('('))
            val = 26;

        else if (token == (')'))
            val = 27;

        else if (isAlpha(token)) //is alphabet in regex
            val = 28;

        else if (isDigit(token))//is digit in regex
            val = 29;

        else if (token == (' '))
            val = 30; 

        else if (token == ('_'))
            val = 31;
            
        else if (token == ('\n'))
            val = 32;
        else 
            val = 33;
        return val;
    
    }

    public boolean isAlpha(char name) {
    
        if(!Character.isLetter(name)) {
                return false;
            }
        return true;
    }

    public boolean isDigit(char name) {
    
        if(!Character.isDigit(name)) {
                return false;
            }
        return true;
    }
}
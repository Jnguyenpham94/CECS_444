public class codes {                //  0          1            2             3            4                      
    static String [] lookup_codes = {"!accept",   "grave",     "leftbracket", "rightbracket", "leftbrace",  //0-4
                                    "rightbrace", "leftsquig", "rightsquig",  "atsymbol", "ampersand",      //5-9
                                    "pound",      "bang",      "tilde",       "singlequote","dollarsign",   //10-14
                                    "colon",      "semicolon", "period",      "comma", "plus",              //15-19
                                    "minus",      "slash",     "backslash",   "star", "equal",              //20-24
                                    "carat",      "leftparen", "rightparen",  "id", "integer",              //25-29
                                    "space",      "dless",     "spaceship",   "lesseq", "dgreater",         //30-34
                                    "greatereq",  "dbang",     "noteq",       "coloneq", "dplus",           //35-39
                                    "plusminus",  "minusplus", "ddash",       "slasheq", "eqeq",            //40-44
                                    "fixed",      "string",    "comment",     "currency", "file",           //45-49
                                    "library",    "scinotation"};                                           //50-51

    public static String getCodes(int code){
        return codes.lookup_codes[code];
    }
}

public class codes {
    static String [] lookup_codes = {"!accept", "grave", "leftbracket", "rightbracket", "leftbrace", "rightbrace", "leftsquig", "rightsquig", "atsymbol", "ampersand", "pound", "bang", "tilde", "singlequote", "dollarsign", "colon", "semicolon", "period", "comma", "plus", "minus", "slash", "backslash", "star", "equal", "carat", "leftparen", "rightparen", "id", "integer", "space", "dless", "spaceship", "lesseq", "dgreater", "greatereq", "dbang", "noteq", "coloneq", "dplus", "plusminus", "minusplus", "ddash", "slasheq", "eqeq", "fixed", "string", "comment", "currency", "file", "library", "scinotation"};

    public static String getCodes(int code){
        return codes.lookup_codes[code];
    }
}

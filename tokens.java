public class tokens {
    public int getToken(String token){
        int current_val = 0;
        switch (token) {
            case "`":
                current_val = 1;
                break;
            case "<":
                current_val = 2;
                break;
            case ">":
                current_val = 3;
                break;
            case "[":
                current_val = 4;
                break;
            case "]":
                current_val = 5;
                break;
            case "{":
                current_val = 6;
                break;
            case "}":
                current_val = 7;
                break;
            case "@":
                current_val = 8;
                break;
            case "&":
                current_val = 9;
                break;
            case "#":
                current_val = 10;
                break;
            case "!":
                current_val = 11;
                break;
            case "~":
                current_val = 12;
                break;
            case "'":
                current_val = 13;
                break;
            case "\"":
                current_val = 14;
                break;
            case "$":
                current_val = 15;
                break;
            case ":":
                current_val = 16;
                break;
            case ";":
                current_val = 17;
                break;
            case ".":
                current_val = 18;
                break;
            case ",":
                current_val = 19;
                break;
            case "+":
                current_val = 20;
                break;
            case "-":
                current_val = 21;
                break;
            case "/":
                current_val = 22;
                break;
            case "\\":
                current_val = 23;
                break;
            case "*":
                current_val = 24;
                break;
            case "=":
                current_val = 25;
                break;
            case "^":
                current_val = 26;
                break;
            case "(":
                current_val = 27;
                break;
            case ")":
                current_val = 28;
                break;
            case "--":
                current_val = 29;
                break;
            case "++":
                current_val = 30;
                break;
            case "+-":
                current_val = 31;
                break;
            case "-+":
                current_val = 32;
                break;
            case ">=":
                current_val = 33;
                break;
            case "<=":
                current_val = 34;
                break;
            case "!=":
                current_val = 35;
                break;
            case "<>":
                current_val = 36;
                break;
            case "==":
                current_val = 37;
                break;
            case ":=":
                current_val = 38;
                break;
            case "<<":
                current_val = 39;
                break;
            case ">>":
                current_val = 40;
                break;
            case "/=":
                current_val = 41;
                break;
            case "!!":
                current_val = 42;
                break;
            case "::":
                current_val = 43;
                break;
            case " ":
                current_val = 44;
                break;
            case "\n":
                current_val = 45;
                break;
            default:
                current_val = 46;
                break;
        }
        return current_val;
    }
}

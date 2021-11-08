public class tokens {
    public int getToken(String token){
        int val = 0;
        switch (token) {
            case "`":
                val = 0;
                break;
            case "<":
                val = 1;
                break;
            case ">":
                val = 2;
                break;
            case "[":
                val = 3;
                break;
            case "]":
                val = 4;
                break;
            case "{":
                val = 5;
                break;
            case "}":
                val = 6;
                break;
            case "@":
                val = 7;
                break;
            case "&":
                val = 8;
                break;
            case "#":
                val = 9;
                break;
            case "!":
                val = 10;
                break;
            case "~":
                val = 11;
                break;
            case "'":
                val = 12;
                break;
            case "\"":
                val = 13;
                break;
            case "$":
                val = 14;
                break;
            case ":":
                val = 15;
                break;
            case ";":
                val = 16;
                break;
            case ".":
                val = 17;
                break;
            case ",":
                val = 18;
                break;
            case "+":
                val = 19;
                break;
            case "-":
                val = 20;
                break;
            case "/":
                val = 21;
                break;
            case "\\":
                val = 22;
                break;
            case "*":
                val = 23;
                break;
            case "=":
                val = 24;
                break;
            case "^":
                val = 25;
                break;
            case "(":
                val = 26;
                break;
            case ")":
                val = 27;
                break;
            case "[a-zA-Z]+": //is alphabet in regex
                val = 28;
                break;
            case "\\d+"://is digit in regex
                val = 29;
                break;
            case " ":
                val = 30;
                break;
            case "_":
                val = 31;
                break;
            default:
                val = 32;
                break;
        }
        return val;
    }
}

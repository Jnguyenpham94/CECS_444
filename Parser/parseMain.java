package Parser;
import java.io.File;

class parseMain {

    public static void main(String[] args) {
        MyParser parse = new MyParser();
        File p = new File("sample_output.txt");
        parse.parseText(p);
    }
}
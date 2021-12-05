package Parser;
public class parsetable {
    
    static int[][] parsetable = {{}};

    public int getTable (int num, int token){
        return parsetable[num][token];
    }
}

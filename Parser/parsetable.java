package Parser;
public class parsetable {
    
    static int[][] parsetable = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0, 1, 2,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61},
    {0, 3, 4,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62, 4},
    {0, 5,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61},
    {0,62, 6,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62, 7},
    {0,62, 8,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61},
    {0,62,62,62,62, 9,62,62,62,62,62,62,62,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62},
    {0,62,62,10,62,62,62,62,62,62,62,62,62,11,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62},
    {0,62,62,12,62,62,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62},
    {0,62,62,62,62,62,14,13,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,14,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62},
    {0,62,62,15,62,62,61,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62},
    {0,62,62,62,61,62,62,62,16,17,18,19,20,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62},
    {0,62,62,62,62,62,62,62,62,62,62,62,62,21,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61,62},
    {0,62,62,22,62,62,62,62,62,62,62,62,62,62,61,62,22,62,22,62,62,22,61,62,62,22,22,62,62,22,22,22,22,22,62,62,62,62,62,62,62,62,62,62,62,62,61,62},
    {0,62,62,23,62,62,62,62,62,62,62,62,62,62,24,62,23,62,23,62,62,23,24,62,62,23,23,62,62,23,23,23,23,23,62,62,62,62,62,62,62,62,62,62,62,62,24,62},
    {0,62,62,25,62,62,62,62,62,62,62,62,62,62,61,62,26,62,27,62,62,28,61,62,62,29,30,62,62,31,32,33,34,35,62,62,62,62,62,62,62,62,62,62,62,62,61,62},
    {0,62,62,36,62,62,62,62,36,36,36,36,36,62,62,62,62,62,62,62,62,62,62,36,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,36,36,62,62},
    {0,62,62,61,62,62,62,62,61,61,61,61,61,62,62,62,62,62,62,62,62,62,62,61,62,62,62,62,62,62,62,62,62,62,37,38,39,40,41,42,62,62,62,62,61,61,62,62},
    {0,62,62,43,61,62,62,62,43,43,43,43,44,62,62,62,62,62,62,62,62,62,62,43,61,62,62,62,62,62,62,62,62,62,61,61,61,61,61,61,62,62,62,62,43,43,62,62},
    {0,62,62,62,47,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,47,62,62,62,62,62,62,62,62,62,47,47,47,47,47,47,45,46,62,62,62,62,62,62},
    {0,62,62,48,61,62,62,62,48,48,48,48,62,62,62,62,62,62,62,62,62,62,62,48,61,62,62,62,62,62,62,62,62,62,61,61,61,61,61,61,61,61,62,62,48,48,62,62},
    {0,62,62,62,51,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,51,62,62,62,62,62,62,62,62,62,51,51,51,51,51,51,51,51,49,50,62,62,62,62},
    {0,62,62,53,61,62,62,62,54,55,56,57,62,62,62,62,62,62,62,62,62,62,62,52,61,62,62,62,62,62,62,62,62,62,61,61,61,61,61,61,61,61,61,61,58,59,62,62},
    {0,62,62,62,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,60,61}};

    public int getTable (int num, int token){
        return parsetable[num][token];
    }
}

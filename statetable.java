import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class statetable<T> {
                            //    `  <  >  [  ]  {  }  @  &  #   !   ~   '   \   $   :   ;   .   ,   +   -   /   \   *   =   ^   (   )    _   L   D  Other
    static int[][] stateTable = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32},
                                 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32}};
    List<int[]> list = Arrays.asList(stateTable);

    public List<int[]> getTable(int new_state, int new_c) {
        return list;
    }
}

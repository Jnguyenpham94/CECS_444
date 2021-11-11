import java.util.HashMap;
public class output<T> {
    
    public static<K,V> void output_map(HashMap<K,V> map){
        for (K i : map.keySet()) {
            String key = i.toString();
            String value = map.get(i).toString();
            System.out.println(key + " " + value);
        }
    }
}

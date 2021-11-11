import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JTextArea;
public class output<T> {
    
    public <K,V> void output_map(HashMap<K,V> map){
        for (K i : map.keySet()) {
            String key = i.toString();
            String value = map.get(i).toString();
            System.out.println(key + " " + value);
        }
    }

    public void out_gui(String out_message, String out_title, String out_text){
        JFrame frame = new JFrame(out_title);
        JTextArea text = new JTextArea(out_message);
        JTextArea t_out = new JTextArea(out_text);
        frame.add(text);
        frame.add(t_out);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

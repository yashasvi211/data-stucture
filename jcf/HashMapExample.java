 
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "abc");
        hm.put(2, "def");
        hm.put(3, "ghi");
        hm.put(4, "jkl");
        hm.put(5, "mno");

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
} 

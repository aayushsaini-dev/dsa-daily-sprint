import java.util.*;

public class hash {

    public static void main(String[] args) {
        // create
        HashMap<String, Integer> h = new HashMap<>();

        // insert - O(1)
        h.put("India", 100);
        h.put("china", 150);
        h.put("US", 50);
        h.put("Nepal", 5);
        h.put("Indonesia", 6);

        System.out.println(h);

        // // get - O(1)
        // int population = h.get("India");
        // System.out.println(population);

        // // ContainsKey - O(1)
        // System.out.println(h.containsKey("India"));
        // System.out.println(h.containsKey("Indonesia"));

        // // Remove - O(1)
        // System.out.println(h.remove("china"));
        // System.out.println(h);

        // // size
        // System.out.println(h.size());

        // // Is Empty
        // System.out.println(h.isEmpty());

        // // clear
        // h.clear();
        // System.out.println(h.isEmpty());

        // Iterate

        Set<String> keys = h.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key ="+k+", value ="+h.get(k));
        }

    }
}
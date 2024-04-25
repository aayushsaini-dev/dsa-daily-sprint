
import java.util.*;

public class Treemap {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("China", 170);
        tm.put("US", 50);
        tm.put("nepal", 5);

        System.out.println(tm);
    }
}
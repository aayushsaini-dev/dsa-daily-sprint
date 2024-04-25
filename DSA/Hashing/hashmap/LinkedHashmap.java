import java.util.*;

public class LinkedHashmap {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 170);
        lhm.put("US", 50);
        lhm.put("nepal", 5);

        System.out.println(lhm); 
    }
}

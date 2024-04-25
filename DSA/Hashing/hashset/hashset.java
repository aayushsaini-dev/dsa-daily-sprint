import java.util.*;

public class hashset {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(1);

        // System.out.println(set);
        // set.remove(4);

        // if(set.contains(1)){
        // System.out.println("set containes");
        // }
        // set.clear();
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());

        // Iterator

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Bombay");
        cities.add("Noida");
        cities.add("Bengalaru");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
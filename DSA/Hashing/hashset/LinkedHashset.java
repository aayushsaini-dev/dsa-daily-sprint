import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Bombay");
        cities.add("Noida");
        cities.add("Bengalaru");

        System.out.print(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bombay");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.print(lhs);
    }
}

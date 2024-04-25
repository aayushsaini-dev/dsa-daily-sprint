import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // operations
        list.add(1); // time complexity for add = O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        // to add element at particular index
        list.add(1, 9); // this takes O(n)
        System.out.println(list);

        // get operation time complexity for get = O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove / delete operation time complexity for remove = O(n)
        list.remove(2);
        System.out.println(list);

        // SetElement at Index time complexity for setElement at index = O(n)
        list.set(2, 10);
        System.out.println(list);

        // contains Element time complexity for contains Element = O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

        // size of Arraylist
        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(1);
        List2.add(22);
        List2.add(3);
        List2.add(4);
        List2.add(5);
        System.out.println(List2.size());
    }
}
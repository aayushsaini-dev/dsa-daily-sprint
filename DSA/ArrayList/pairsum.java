import java.util.ArrayList;

public class pairsum {
    // brute force
    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 pointer approch question 2
    public static boolean pairsum2(ArrayList<Integer> list2, int Target) {
        int bp = -1;
        int n = list2.size();
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > list2.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case1
            if (list2.get(lp) + list2.get(rp) == Target) {
                return true;
            }
            // case2
            if (list2.get(lp) + list2.get(rp) < Target) {
                lp = (lp + 1) % n;
            }
            // case3
            else {
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        // System.out.println(pairsum1(list, target));

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int Target = 16;

        System.out.println(pairsum2(list2, Target));

    }
}

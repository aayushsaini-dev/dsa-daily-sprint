import java.util.ArrayList;

public class mostwater {

    // public static int storewater(ArrayList<Integer> height) {
    // int max = 0;
    // // brute force
    // for (int i = 0; i < height.size(); i++) {
    // for (int j = i + 1; j < height.size(); j++) {
    // int ht = Math.min(height.get(i), height.get(j));
    // int wt = j - i;
    // int currwater = ht * wt;
    // max = Math.max(max, currwater);
    // }
    // }
    // return max;
    // }
    public static int Storewater(ArrayList<Integer> height) {
        int max = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            max = Math.max(max, currwater);
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println(storewater(height));
        System.out.println(Storewater(height));
    }
}

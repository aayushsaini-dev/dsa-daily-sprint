public class Tilling {
    public static int tilingProblrm(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kam
        // vertical choices
        int fnm1 = tilingProblrm(n - 1);
        // horizontal choices
        int fnm2 = tilingProblrm(n - 2);

        int total = fnm1 + fnm2;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblrm(5));
    }
}

public class fastexponation {
    public static void main(String[] args) {
        System.out.println(Fastexponation(3, 5));
    }

    public static int Fastexponation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;

    }
}

public class countsetbit {
    public static void main(String[] args) {
        System.out.println(Countsetbit(10));
    }

    public static int Countsetbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // it checks LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

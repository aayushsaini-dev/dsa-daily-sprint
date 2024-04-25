public class powerof2 {
    public static void main(String[] args) {
        System.out.println(ispower2(8));
    }

    public static boolean ispower2(int n) {
        return (n & n - 1) == 0;
    }
}

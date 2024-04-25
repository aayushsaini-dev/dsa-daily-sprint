public class fibbonacci {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);

        int fib = fib(n - 1) + fib(n - 2);
        return fib;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}

public class basics {
    public static void printDec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    // public static int factorial(int n) {
    // if (n == 0) {
    // return 1;
    // }
    // // int fnm1 = factorial(n - 1);
    // int fn = n * factorial(n - 1);
    // return fn;
    // }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;

        printDec(n);
        printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sum(n));
    }
}
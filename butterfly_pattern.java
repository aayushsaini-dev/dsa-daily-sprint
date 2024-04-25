public class butterfly_pattern {

    public static void butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {

            // starting stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // last stars on row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {

            // starting stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // last stars on row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterfly(4);

    }
}

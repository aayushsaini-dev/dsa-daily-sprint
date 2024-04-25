public class palindrome {
    public static void main(String args[]) {
        String str = "AAyush";

        System.out.print(ispalindrome(str));
    }

    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }
}

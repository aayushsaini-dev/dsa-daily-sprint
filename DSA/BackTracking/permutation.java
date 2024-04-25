public class permutation {

    public static void find_permutation(String abc, String ans) {
        // base case
        if (abc.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < abc.length(); i++) {
            char curr = abc.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String Newabc = abc.substring(0, i) + abc.substring(i + 1, abc.length());

            find_permutation(Newabc, ans + curr);
        }
    }

    public static void main(String[] args) {
        String abc = "ABC";
        find_permutation(abc, " ");
    }
}

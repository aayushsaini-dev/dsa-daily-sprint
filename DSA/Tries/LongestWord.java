public class LongestWord {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;

    }

    public static String ans = " ";

    public static void Longestword(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) { // agar lexographicaaly larger puche to is loop ko ultra karna hai ; abhi ye
                                       // smaller dega ans = apple{small}; larger ans =apply{large}
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                Longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        Longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}

import java.util.*;

public class kth_levelOf_Tree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void Klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        Klevel(root.left, level + 1, k);
        Klevel(root.right, level + 1, k);

    }

    public static void main(String[] args) {
        // orignal tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 3;
        Klevel(root, 1, k);
    }
}

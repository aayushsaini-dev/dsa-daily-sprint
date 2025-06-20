import java.util.*;

public class diameter {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int H;
        H = Math.max(lh, rh) + 1;
        return H;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int lefth = height(root.left);
        int rightDiam = diameter(root.right);
        int righth = height(root.right);

        int selfDiam = lefth + righth + 1;

        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));

    }

    static class info {
        int diam;
        int ht;

        public info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

    }

    public static info Diameter2(Node root) {
        if (root == null) {
            return new info(0, 0);
        }
        info leftInfo = Diameter2(root.left);
        info rightInfo = Diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new info(diam, ht);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));

        System.out.println(Diameter2(root).ht);
    }
}
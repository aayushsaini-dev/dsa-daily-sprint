
public class NodeCount {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int lcount = count(root.left);
        int Rcount = count(root.right);
        return lcount + Rcount + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(count(root));
    }
}

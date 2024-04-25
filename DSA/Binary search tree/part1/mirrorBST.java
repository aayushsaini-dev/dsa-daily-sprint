public class mirrorBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node miroor(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMiror = miroor(root.left);
        Node rightMiror = miroor(root.right);

        root.left = rightMiror;
        root.right = leftMiror;
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        preorder(root);
        System.out.println();
        root = miroor(root);
        preorder(root);
    }

}

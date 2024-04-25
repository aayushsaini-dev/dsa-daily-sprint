public static Node lca(Node root, int n1, int n2) {
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();

    getPath(root, n1, path1);
    getPath(root, n2, path2);

    int i = 0;
    for (; i < path1.size() && i < path2.size(); i++) {
        if (path1.get(i) != path2.get(i)) {
            break;
        }
    }

    // Last equal node -> i-1th
    Node lca = path1.get(i - 1);
    return lca;
}

import java.util.*;

public class TopologicalSort {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 -vertex

        // 1 - vertex

        // 2 vertex
        graph[2].add(new Edge(2, 3));

        // 3 vertex
        graph[3].add(new Edge(3, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // 5 vertex
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topsort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topsortUtil(graph, i, vis, s); // modofied dfs
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void topsortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topsortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topsort(graph);
    }
}

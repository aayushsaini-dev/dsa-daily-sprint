import java.util.ArrayList;

public class cycleDetection {

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
        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // 1 - vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // 2 vertex
        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4 vertex
        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int current, int parent) {
        visited[current] = true;

        for (Edge edge : graph[current]) {
            if (!visited[edge.dest]) {
                if (detectCycleUtil(graph, visited, edge.dest, current)) {
                    return true;
                }
            } else if (edge.dest != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
         * 0--------3
         * /| |
         * / | |
         * 1 | 4
         * \ |
         * \ |
         * 2
         */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}

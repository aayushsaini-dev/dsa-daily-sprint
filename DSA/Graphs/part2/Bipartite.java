import java.util.*;

public class Bipartite {

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
        graph[0].add(new Edge(0, 2));

        // 1 - vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4)); // Commented out to break the cycle

        // 3 vertex
        graph[3].add(new Edge(3, 1));
       // graph[3].add(new Edge(3, 4)); // Commented out to break the cycle

        // 4 vertex
        graph[4].add(new Edge(4, 2));
        //graph[4].add(new Edge(4, 3)); // Commented out to break the cycle
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] col = new int[graph.length];
        Arrays.fill(col, -1); // Initialize all vertices as uncolored (-1)

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) { // Perform BFS for each unvisited vertex
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i); // Start BFS from vertex i
                col[i] = 0; // Color the starting vertex

                while (!queue.isEmpty()) {
                    int curr = queue.poll();

                    for (Edge e : graph[curr]) {
                        if (col[e.dest] == -1) { // If neighbor is not visited
                            col[e.dest] = 1 - col[curr]; // Assign opposite color to the neighbor
                            queue.add(e.dest);
                        } else if (col[e.dest] == col[curr]) { // If neighbor has same color as current vertex
                            return false; // Graph is not bipartite
                        }
                    }
                }
            }
        }
        return true; // Graph is bipartite
    }

    public static void main(String[] args) {
        // if graph does not contain cycle its bipartite
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}

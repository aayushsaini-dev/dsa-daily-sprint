import java.util.ArrayList;

public class CycleDetetctionforDirected {
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
        graph[0].add(new Edge(0, 2));

        // 1 - vertex
        graph[1].add(new Edge(1, 0));

        // 2 vertex
        graph[2].add(new Edge(2, 3));

        // 3 vertex
        graph[3].add(new Edge(3, 0));

    }
    public static boolean iscycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(iscycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean iscycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ // cycle
                return true;
            }
            if(!vis[e.dest] && iscycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(iscycle(graph));
    }
}

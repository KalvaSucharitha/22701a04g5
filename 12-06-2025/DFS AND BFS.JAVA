import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5, false); // 5 vertices: 0 to 4
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.printGraph();
        System.out.println("DFS:");
        graph.dfs(0, new boolean[5]);
        System.out.println("\nBFS:");
        graph.bfs();
    }
}
class Graph {
    ArrayList<HashSet<Integer>> graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new HashSet<>());
        }
    }
    void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).add(dest);
            if (!isDirected) {
                graph.get(dest).add(src);
            }
        } else {
            System.out.println("Invalid source and destination.");
            System.out.println("Available vertices: 0 to " + (vertices - 1));
        }
    }
    void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).remove(dest);
            if (!isDirected) {
                graph.get(dest).remove(src);
            }
        } else {
            System.out.println("Invalid source and destination.");
            System.out.println("Available vertices: 0 to " + (vertices - 1));
        }
    }
    public ArrayList<Integer> neighbours(int node) {
        HashSet<Integer> neighboursSet = graph.get(node);
        return new ArrayList<>(neighboursSet);
    }
    boolean havingEdge(int src, int dest) {
        return graph.get(src).contains(dest);
    }
    HashSet<Integer> getNeighbours(int src) throws IndexOutOfBoundsException {
        if (src >= 0 && src < vertices) {
            return graph.get(src);
        }
        throw new IndexOutOfBoundsException("Invalid source: " + src);
    }
    boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }
    void printGraph() {
        System.out.println("Graph adjacency list:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbour : graph.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }
    void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        HashSet<Integer> neighbours = getNeighbours(start);
        for (int neighbour : neighbours) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }
    }
    void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        q.add(0); 
        while (!q.isEmpty()) {
            int current = q.poll();
            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");
                HashSet<Integer> neighbours = getNeighbours(current);
                for (int neighbour : neighbours) {
                    q.add(neighbour);
                }
            }
        }
    }
}

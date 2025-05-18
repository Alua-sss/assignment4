import java.util.Map;
public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> A = graph.addVertex("A");
        Vertex<String> B = graph.addVertex("B");
        Vertex<String> C = graph.addVertex("C");
        Vertex<String> D = graph.addVertex("D");

        graph.addEdge(A, B, 5);
        graph.addEdge(A, C, 2);
        graph.addEdge(B, D, 1);
        graph.addEdge(C, D, 7);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        System.out.println("BFS:");
        bfs.bfs(A);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        System.out.println("\nDijkstra:");
        Map<Vertex<String>, Double> result = dijkstra.dijkstra(A);
        result.forEach((v, dist) -> System.out.println(v + " => " + dist));
    }
}

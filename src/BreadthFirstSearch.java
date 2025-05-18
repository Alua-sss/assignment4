import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
public class BreadthFirstSearch<V> {
    public void bfs(Vertex<V> start) {
        Set<Vertex<V>> visited = new HashSet<>();
        Queue<Vertex<V>> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            System.out.println("Visited: " + current);

            for (Vertex<V> neighbor : current.getAdjacents().keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}

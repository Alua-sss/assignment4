import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Comparator;
public class DijkstraSearch<V> {
    public Map<Vertex<V>, Double> dijkstra(Vertex<V> source) {
        Map<Vertex<V>, Double> distance = new HashMap<>();
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparingDouble(distance::get));
        Set<Vertex<V>> visited = new HashSet<>();

        distance.put(source, 0.0);
        pq.add(source);

        while (!pq.isEmpty()) {
            Vertex<V> current = pq.poll();
            if (!visited.add(current)) continue;

            for (Map.Entry<Vertex<V>, Double> neighborEntry : current.getAdjacents().entrySet()) {
                Vertex<V> neighbor = neighborEntry.getKey();
                double weight = neighborEntry.getValue();
                double newDist = distance.get(current) + weight;

                if (newDist < distance.getOrDefault(neighbor, Double.POSITIVE_INFINITY)) {
                    distance.put(neighbor, newDist);
                    pq.add(neighbor);
                }
            }
        }

        return distance;
    }
}

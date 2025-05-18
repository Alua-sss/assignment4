import java.util.Set;
import java.util.HashSet;
public class WeightedGraph<V> {
    private Set<Vertex<V>> vertices = new HashSet<>();

    public Vertex<V> addVertex(V data) {
        Vertex<V> vertex = new Vertex<>(data);
        vertices.add(vertex);
        return vertex;
    }

    public void addEdge(Vertex<V> from, Vertex<V> to, double weight) {
        from.addAdjacentVertex(to, weight);
    }

    public Set<Vertex<V>> getVertices() {
        return vertices;
    }
}

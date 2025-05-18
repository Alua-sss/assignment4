import java.util.Map;
import java.util.HashMap;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices = new HashMap<>();

    public Vertex(V data) {
        this.data = data;
    }

    public V getData() { return data; }

    public void addAdjacentVertex(Vertex<V> dest, double weight) {
        adjacentVertices.put(dest, weight);
    }

    public Map<Vertex<V>, Double> getAdjacents() {
        return adjacentVertices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex<?> v)) return false;
        return data.equals(v.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

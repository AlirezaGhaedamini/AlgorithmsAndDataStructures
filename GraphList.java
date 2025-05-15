import java.util.*;

public class GraphList {
    private Map<String, List<String>> adjacencyList = new HashMap<>();

    public void addVertex(String label) {
        adjacencyList.putIfAbsent(label, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        if (!adjacencyList.containsKey(from) || !adjacencyList.containsKey(to))
            throw new IllegalArgumentException("Vertex not found.");

        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from);
    }

    public boolean hasEdge(String from, String to) {
        return adjacencyList.containsKey(from) && adjacencyList.get(from).contains(to);
    }

    public void print() {
        for (var vertex : adjacencyList.keySet()) {
            System.out.println(vertex + " → " + adjacencyList.get(vertex));
        }
    }
}

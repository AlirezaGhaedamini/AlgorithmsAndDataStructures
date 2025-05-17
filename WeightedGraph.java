import java.util.*;

class WeightedGraph {
    private Map<String, List<Edge>> graph;

    public WeightedGraph() {
        graph = new HashMap<>();
    }

    public void addNode(String node) {
        graph.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight) {
        addNode(from);
        addNode(to);
        graph.get(from).add(new Edge(to, weight));
    }

    public List<Edge> getNeighbors(String node) {
        return graph.getOrDefault(node, new ArrayList<>());
    }

    public void display() {
        for (String node : graph.keySet()) {
            for (Edge edge : graph.get(node)) {
                System.out.println(node + " --(" + edge.weight + ")--> " + edge.to);
            }
        }
    }

    static class Edge {
        String to;
        int weight;

        Edge(String to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}

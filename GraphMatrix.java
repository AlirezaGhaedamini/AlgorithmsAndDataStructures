import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GraphMatrix {
    private boolean[][] matrix;
    private Map<String, Integer> nodeIndices = new HashMap<>();
    private String[] indexToNode;
    private int size;
    private int nextIndex = 0;

    public GraphMatrix(int size) {
        this.size = size;
        matrix = new boolean[size][size];
        indexToNode = new String[size];
    }

    public void addVertex(String label) {
        if (nextIndex >= size)
            throw new IllegalStateException("Maximum number of vertices reached");

        nodeIndices.put(label, nextIndex);
        indexToNode[nextIndex] = label;
        nextIndex++;
    }

    public void addEdge(String from, String to) {
        int i = nodeIndices.get(from);
        int j = nodeIndices.get(to);
        matrix[i][j] = true;
        matrix[j][i] = true;
    }

    public boolean hasEdge(String from, String to) {
        return matrix[nodeIndices.get(from)][nodeIndices.get(to)];
    }

    public void print() {
        System.out.println("  " + Arrays.toString(indexToNode));
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(indexToNode[i] + " ");
            for (int j = 0; j < nextIndex; j++) {
                System.out.print((matrix[i][j] ? "1 " : "0 "));
            }
            System.out.println();
        }
    }
}

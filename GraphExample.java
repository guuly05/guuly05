import java.util.*;

class Graph<T> {
    private Map<T, List<T>> adjVertices = new HashMap<>();

    public void addEdge(T src, T dest) {
        adjVertices.putIfAbsent(src, new ArrayList<>());
        adjVertices.putIfAbsent(dest, new ArrayList<>());
        adjVertices.get(src).add(dest);
        adjVertices.get(dest).add(src); // Undirected graph
    }

    public List<T> getAdjVertices(T vertex) {
        return adjVertices.getOrDefault(vertex, new ArrayList<>());
    }

    public void printGraph() {
        for (T vertex : adjVertices.keySet()) {
            System.out.println(vertex + " -> " + adjVertices.get(vertex));
        }
    }
}

public class GraphExample {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        // Add edges to the graph
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Carol");
        graph.addEdge("Alice", "David");
        graph.addEdge("Carol", "David");

        // Print the graph
        System.out.println("The graph:");
        graph.printGraph();

        // Get and print Bob's friends
        System.out.println("\nBob's friends:");
        List<String> bobFriends = graph.getAdjVertices("Bob");
        for (String friend : bobFriends) {
            System.out.println(friend);
        }
    }
}
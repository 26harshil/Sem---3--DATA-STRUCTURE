import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Scanner;

class Graph {
    HashMap<Integer, List<Integer>> adjList = new HashMap<>();

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    private void dfsHelper(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (int neighbour : adjList.get(vertex)) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbour : adjList.get(vertex)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }
}

public class Lab_85{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.print("Enter the number of edges: ");
        int numberOfEdges = scanner.nextInt();

        for (int i = 0; i < numberOfEdges; i++) {
            System.out.print("Enter edge (u v): ");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        System.out.print("Enter the starting vertex for DFS: ");
        int startDfs = scanner.nextInt();
        System.out.println("DFS starting from vertex " + startDfs + ":");
        graph.dfs(startDfs); // Output for DFS

        System.out.print("\nEnter the starting vertex for BFS: ");
        int startBfs = scanner.nextInt();
        System.out.println("BFS starting from vertex " + startBfs + ":");
        graph.bfs(startBfs); // Output for BFS

        scanner.close();
    }
}

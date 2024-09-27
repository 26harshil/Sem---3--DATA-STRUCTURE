import java.util.*;

public class Main {

    // Depth First Search to explore nodes
    private static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    // Function to find the number of connected components
    private static int findConnectedComponents(int N, int[] W) {
        // Create an adjacency list for the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list based on the condition
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (j - i != W[j] - W[i]) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        // To keep track of visited nodes
        boolean[] visited = new boolean[N];
        int connectedComponents = 0;

        // Perform DFS for each node to count connected components
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                connectedComponents++;
                dfs(i, adj, visited);
            }
        }

        return connectedComponents;
    }

    // Main method to handle input and output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Number of nodes
            int[] W = new int[N];
            for (int i = 0; i < N; i++) {
                W[i] = scanner.nextInt();  // Weights of nodes
            }

            // Find and print the number of connected components for each test case
            System.out.println(findConnectedComponents(N, W));
        }

        scanner.close();
    }
}

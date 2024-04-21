import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create an adjacency list representation of the graph
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]); // For bidirectional edges
        }
        
        // Perform depth-first search from the source vertex
        boolean[] visited = new boolean[n];
        return dfs(adjacencyList, visited, source, destination);
    }
    
    private boolean dfs(List<List<Integer>> adjacencyList, boolean[] visited, int current, int destination) {
        if (current == destination) {
            return true; // If the destination is reached, return true
        }
        visited[current] = true;
        for (int neighbor : adjacencyList.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(adjacencyList, visited, neighbor, destination)) {
                    return true; // If a path is found from neighbor to destination, return true
                }
            }
        }
        return false; // If destination cannot be reached from any neighbor, return false
    }
}

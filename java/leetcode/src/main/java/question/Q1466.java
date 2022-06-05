package question;

import java.util.ArrayList;
import java.util.List;

public class Q1466 {
    public int minReorder(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] c : connections) {
            graph.get(c[0]).add(c[1]);
            graph.get(c[1]).add(-c[0]);
        }

        return dfs(graph, visited, 0);
    }

    public int dfs(List<List<Integer>> graph, boolean[] visited, int from) {
        int change = 0;

        visited[from] = true;

        for (int to : graph.get(from)) {
            if (visited[Math.abs(to)]) continue;

            if (to > 0) change++;

            change += dfs(graph, visited, Math.abs(to));
        }

        return change;
    }
}

/*
1466. Reorder Routes to Make All Paths Lead to the City Zero
 */

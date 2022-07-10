package question;

import java.util.ArrayList;
import java.util.List;

public class Q2065 {
    int result = 0;

    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        List<List<int[]>> graph = new ArrayList<>();
        int n = values.length;

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(new int[]{e[1], e[2]});
            graph.get(e[1]).add(new int[]{e[0], e[2]});
        }

        dfs(graph, values, new int[n], 0, 0, maxTime);

        return result;
    }

    public void dfs(List<List<int[]>> graph, int[] values, int[] visited, int node, int sum, int time) {
        if (++visited[node] == 1) {
            sum += values[node];
        }

        if (node == 0) {
            result = Math.max(result, sum);
        }

        for (int[] e : graph.get(node)) {
            int neighbor = e[0];
            int timeUsage = e[1];

            if (time - timeUsage >= 0) {
                dfs(graph, values, visited, neighbor, sum, time - timeUsage);
            }
        }

        --visited[node];
    }
}
/*
2065. Maximum Path Quality of a Graph
 */

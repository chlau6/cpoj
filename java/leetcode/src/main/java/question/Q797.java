package question;

import java.util.ArrayList;
import java.util.List;

public class Q797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<>(List.of(0)), graph, 0);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> path, int[][] graph, int node) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
        }

        for (int v : graph[node]) {
            path.add(v);

            dfs(result, path, graph, v);

            path.remove(path.size() - 1);
        }
    }
}

/*
797. All Paths From Source to Target
 */

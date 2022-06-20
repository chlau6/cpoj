package question;

import java.util.ArrayList;
import java.util.List;

public class Q2192 {
    List<List<Integer>> result = new ArrayList<>();
    List<List<Integer>> graph = new ArrayList<>();

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            result.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];

            graph.get(from).add(to);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, i);
        }

        return result;
    }

    public void dfs(int start, int curr) {
        for (int child : graph.get(curr)) {
            List<Integer> ancestors = result.get(child);

            if (ancestors.isEmpty() || ancestors.get(ancestors.size() - 1) != start) {
                result.get(child).add(start);
                dfs(start, child);
            }
        }
    }
}

/*
2192. All Ancestors of a Node in a Directed Acyclic Graph
 */

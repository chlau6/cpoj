package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1968 {
    public int[] restoreArray(int[][] adjacentPairs) {
        if (adjacentPairs.length == 1) return adjacentPairs[0];

        int n = adjacentPairs.length;
        int[] result = new int[n + 1];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] adj : adjacentPairs) {
            map.putIfAbsent(adj[0], new ArrayList<>());
            map.putIfAbsent(adj[1], new ArrayList<>());
            map.get(adj[0]).add(adj[1]);
            map.get(adj[1]).add(adj[0]);
        }

        int start = 0;

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> neighbors = entry.getValue();

            if (neighbors.size() == 1) {
                start = entry.getKey();
            }
        }

        dfs(map, result, Integer.MIN_VALUE, start, 0);

        return result;
    }

    public void dfs(Map<Integer, List<Integer>> map, int[] result, int prev, int curr, int i) {
        result[i++] = curr;

        if (i == result.length) return;

        for (int v : map.get(curr)) {
            if (v != prev) {
                dfs(map, result, curr, v, i);
            }
        }
    }
}

/*
1743. Restore the Array From Adjacent Pairs
 */

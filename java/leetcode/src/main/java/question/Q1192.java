package question;

import java.util.ArrayList;
import java.util.List;

public class Q1192 {
    int timestamp = 1;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();
        int[] low = new int[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        helper(result, graph, time, low, -1, 0);

        return result;
    }

    public void helper(List<List<Integer>> result, List<List<Integer>> graph, int[] time, int[] low, int prev, int curr) {
        time[curr] = low[curr] = timestamp++;

        for (int v : graph.get(curr)) {
            if (time[v] == 0) {
                helper(result, graph, time, low, curr, v);
                low[curr] = Math.min(low[curr], low[v]);
            } else if (v != prev) {
                low[curr] = Math.min(low[curr], time[v]);
            }

            if (low[v] > time[curr]) {
                result.add(List.of(curr, v));
            }
        }
    }
}

/*
1192. Critical Connections in a Network
 */

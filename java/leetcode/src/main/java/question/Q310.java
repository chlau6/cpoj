
package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);

        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[n];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            inDegree[edge[0]]++;
            inDegree[edge[1]]++;
        }

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 1) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int node = queue.remove();

                list.add(node);
                for (int v : graph.get(node)) {
                    if (--inDegree[v] == 1) {
                        queue.add(v);
                    }
                }
            }

            result = list;
        }

        return result;
    }
}

/*
310. Minimum Height Trees
 */

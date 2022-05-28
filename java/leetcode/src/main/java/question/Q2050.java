package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q2050 {
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : relations) {
            graph.get(e[0] - 1).add(e[1] - 1);
            inDegree[e[1] - 1]++;
        }


        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[n];

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                dist[i] = time[i];
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : graph.get(u)) {
                dist[v] = Math.max(dist[v], dist[u] + time[v]);

                if (--inDegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        int result = 0;

        for (int d : dist) {
            result = Math.max(result, d);
        }

        return result;
    }
}

/*
2050. Parallel Courses III
 */

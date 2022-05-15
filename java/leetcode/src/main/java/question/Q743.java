package question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Q743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        int result = 0;

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] time : times) {
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();

            int currNode = current[0];
            int currWeight = current[1];

            if (visited[currNode]) continue;

            visited[currNode] = true;
            result = currWeight;

            n--;

            for (int[] next : graph.get(currNode)) {
                int nextNode = next[0];
                int nextWeight = next[1];
                pq.add(new int[]{nextNode, currWeight + nextWeight});
            }
        }

        return n == 0 ? result : -1;
    }
}

/*
743. Network Delay Time
 */

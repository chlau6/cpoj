package question;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q1090 {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int n = values.length;
        int[][] pairs = new int[n][2];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int result = 0;

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{values[i], labels[i]});
        }

        while (!pq.isEmpty() && numWanted > 0) {
            int[] pair = pq.poll();

            int counts = map.getOrDefault(pair[1], 0);

            if (counts == useLimit) continue;

            map.put(pair[1], ++counts);

            result += pair[0];

            numWanted--;
        }

        return result;
    }
}

/*
1090. Largest Values From Labels
 */

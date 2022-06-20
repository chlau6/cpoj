package question;

import java.util.Arrays;

public class Q924 {
    int[] root;

    public int minMalwareSpread(int[][] graph, int[] initial) {
        int n = graph.length;
        int[] groupSize = new int[n];
        int[] infection = new int[n];
        root = new int[n];

        for (int i = 0; i < n; i++) {
            root[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (graph[i][j] == 1) {
                    root[find(i)] = find(j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            groupSize[find(i)]++;
        }

        for (int init : initial) {
            infection[find(init)]++;
        }

        int result = -1;
        int maxSize = 0;

        Arrays.sort(initial);
        for (int init : initial) {
            int root = find(init);

            if (infection[root] == 1 && groupSize[root] > maxSize) {
                result = init;
                maxSize = groupSize[root];
            }
        }

        if (maxSize > 0) return result;

        return initial[0];
    }

    public int find(int x) {
        return x == root[x] ? x : find(root[x]);
    }
}

/*
924. Minimize Malware Spread
 */

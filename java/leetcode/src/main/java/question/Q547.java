package question;

import java.util.HashSet;
import java.util.Set;

public class Q547 {
    int[] parents;

    public int findCircleNum(int[][] isConnected) {
        Set<Integer> set = new HashSet<>();

        int n = isConnected.length;
        parents = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    union(i + 1, j + 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            set.add(find(i));
        }

        return set.size();
    }

    public void union(int u, int v) {
        int uParent = find(u);
        int vParent = find(v);

        parents[vParent] = uParent;
    }

    public int find(int u) {
        return parents[u] == u ? u : find(parents[u]);
    }
}

/*
547. Number of Provinces
 */

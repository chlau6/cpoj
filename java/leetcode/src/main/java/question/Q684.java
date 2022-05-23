package question;

public class Q684 {
    int[] parents;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parents = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int[] edge : edges) {
            if (!union(edge[0], edge[1])) {
                return edge;
            }
        }

        return new int[]{-1, -1};
    }

    public boolean union(int u, int v) {
        int uParent = find(u);
        int vParent = find(v);

        if (uParent == vParent) {
            return false;
        } else {
            parents[vParent] = uParent;
            return true;
        }

    }

    public int find(int u) {
        return parents[u] == u ? u : find(parents[u]);
    }
}

/*
684. Redundant Connection
 */

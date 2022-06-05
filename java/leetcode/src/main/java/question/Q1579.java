package question;

public class Q1579 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int count1 = 0;
        int count2 = 0;
        int result = 0;

        UnionFind unionFind = new UnionFind(n + 1);

        for (int[] edge : edges) {
            if (edge[0] != 3) continue;

            if (unionFind.union(edge[1], edge[2])) {
                count1++;
                count2++;
            } else {
                result++;
            }
        }

        int[] parentCopy = unionFind.parent.clone();
        int[] rankCopy = unionFind.rank.clone();

        for (int[] edge : edges) {
            if (edge[0] != 1) continue;

            if (unionFind.union(edge[1], edge[2])) {
                count1++;
            } else {
                result++;
            }
        }

        unionFind.parent = parentCopy;
        unionFind.rank = rankCopy;

        for (int[] edge : edges) {
            if (edge[0] != 2) continue;

            if (unionFind.union(edge[1], edge[2])) {
                count2++;
            } else {
                result++;
            }
        }

        return count1 == n - 1 && count2 == n - 1 ? result : -1;
    }

    class UnionFind {
        int[] parent;
        int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public boolean union(int u, int v) {
            int uRoot = find(u);
            int vRoot = find(v);

            if (uRoot == vRoot) return false;

            if (rank[uRoot] >= rank[vRoot]) {
                parent[vRoot] = uRoot;
                rank[uRoot]++;
            } else {
                parent[uRoot] = vRoot;
                rank[vRoot]++;
            }

            return true;
        }

        public int find(int u) {
            return parent[u] == u ? u : find(parent[u]);
        }
    }
}

/*
1579. Remove Max Number of Edges to Keep Graph Fully Traversable
 */

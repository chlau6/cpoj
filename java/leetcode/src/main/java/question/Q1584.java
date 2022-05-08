package question;

import java.util.PriorityQueue;

public class Q1584 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int result = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = getDist(points[i], points[j]);
                pq.add(new int[]{dist, i, j});
            }
        }

        DisjointSetUnion dsu = new DisjointSetUnion(n);
        int count = 0;

        while (count < n - 1) {
            int[] edge = pq.poll();

            if (dsu.find(edge[1]) != dsu.find(edge[2])) {
                result += edge[0];
                count++;
                dsu.union(edge[1], edge[2]);
            }
        }

        return result;
    }

    public int getDist(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }


    public class DisjointSetUnion {
        int[] parent;

        DisjointSetUnion(int n) {
            parent = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int u, int v) {
            int uRoot = find(u);
            int vRoot = find(v);

            parent[uRoot] = vRoot;
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }
    }
}

/*
1584. Min Cost to Connect All Points
 */

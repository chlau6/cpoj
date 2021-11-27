package question;

import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.Graph;

@DepthFirstSearch
@BreadthFirstSearch
@Graph
public class Q1971 {
    /*
    Disjoint Set Union
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean validPath(int n, int[][] edges, int start, int end) {
        var dsu = new DisjointSetUnion(n);

        for (int[] edge : edges) {
            dsu.union(edge[0], edge[1]);
        }

        return dsu.find(start, end);
    }

    public class DisjointSetUnion {
        int[] dsu;

        public DisjointSetUnion(int size) {
            dsu = new int[size];

            for (int i = 0; i < size; i++) {
                dsu[i] = i;
            }
        }

        public void union(int u, int v) {
            int uRoot = root(u);
            int vRoot = root(v);

            dsu[uRoot] = vRoot;
        }

        public boolean find(int u, int v) {
            return root(u) == root(v);
        }

        public int root(int u) {
            while (dsu[u] != u) {
                u = dsu[u];
            }

            return u;
        }
    }
}
/*
1971. Find if Path Exists in Graph
 */

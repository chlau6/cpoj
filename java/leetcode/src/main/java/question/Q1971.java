package question;

import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.Graph;

@DepthFirstSearch
@BreadthFirstSearch
@Graph
public class Q1971 {
    /*
    Disjoint Union Set
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean validPath(int n, int[][] edges, int start, int end) {
        var set = new DisjointSetUnion(n);

        for (int[] edge : edges) {
            set.union(edge[0], edge[1]);
        }

        return set.find(start, end);
    }

    class DisjointSetUnion {
        int[] disjointSet;

        public DisjointSetUnion(int num) {
            disjointSet = new int[num];

            for (int i = 0; i < num; i++) {
                disjointSet[i] = i;
            }
        }

        public boolean find(int u, int v) {
            return root(u) == root(v);
        }

        public void union(int u, int v) {
            int uRoot = root(u);
            int vRoot = root(v);

            disjointSet[uRoot] = vRoot;
        }

        public int root(int node) {
            while (disjointSet[node] != node) {
                node = disjointSet[node];
            }

            return node;
        }
    }
}
/*
1971. Find if Path Exists in Graph
 */

package graph;

public class DisjointSetUnion {
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
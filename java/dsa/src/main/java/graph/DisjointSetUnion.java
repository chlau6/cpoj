package graph;

public class DisjointSetUnion {
    int[] parent;

    public DisjointSetUnion(int num) {
        parent = new int[num];

        for (int i = 0; i < num; i++) {
            parent[i] = i;
        }
    }

    public boolean isJoin(int u, int v) {
        return root(u) == root(v);
    }

    public void union(int u, int v) {
        int uRoot = root(u);
        int vRoot = root(v);

        parent[uRoot] = vRoot;
    }

    public int root(int node) {
        while (parent[node] != node) {
            node = parent[node];
        }

        return node;
    }
}
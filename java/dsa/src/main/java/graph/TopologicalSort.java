package graph;

import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {
    public int[] inDegree;
    public List<List<Integer>> graphs = new ArrayList<>();
    public List<Integer> order = new ArrayList<>();

    public TopologicalSort(int vertex, int[][] edges) {
        inDegree = new int[vertex];

        for (int i = 0; i < vertex; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            inDegree[edge[1]]++;
            graphs.get(edge[0]).add(edge[1]);
        }

    }

    public static void main(String[] args) {
        var topologicalSort = new TopologicalSort(6, new int[][]{{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}});
        topologicalSort.sort();
    }

    public void sort() {
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                order.add(i);
            }
        }

        for (int i = 0; i < order.size(); i++) {
            for (int vertex : graphs.get(order.get(i))) {
                if (--inDegree[vertex] == 0) {
                    order.add(vertex);
                }
            }
        }

        System.out.println(order);
    }
}

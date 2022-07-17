package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
    private int[] inDegree;
    private List<List<Integer>> graph = new ArrayList<>();
    private List<Integer> order = new ArrayList<>();
    private Queue<Integer> queue = new LinkedList<>();

    public TopologicalSort(int vertex, int[][] edges) {
        inDegree = new int[vertex];

        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            inDegree[edge[1]]++;
            graph.get(edge[0]).add(edge[1]);
        }

    }

    public static void main(String[] args) {
        var topologicalSort = new TopologicalSort(6, new int[][]{{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}});
        topologicalSort.sort();
    }

    public void sort() {
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
                order.add(i);
            }
        }

        for (int i = 0; i < order.size(); i++) {
            int node = queue.remove();

            for (int v : graph.get(node)) {
                if (--inDegree[v] == 0) {
                    queue.add(v);
                    order.add(v);
                }
            }
        }

        System.out.println(order);
    }
}

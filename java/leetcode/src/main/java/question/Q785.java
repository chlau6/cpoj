package question;

import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.Graph;
import annotation.UnionFind;
import company.Facebook;

import java.util.LinkedList;
import java.util.Queue;

@DepthFirstSearch
@BreadthFirstSearch
@UnionFind
@Graph
@Facebook
public class Q785 {
    /*
    BFS
    Time Complexity: (V + E)    Space Complexity: O(V)
     */
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];


        for (int i = 0; i < graph.length; i++) {
            if (colors[i] != 0) continue;
            colors[i] = 1;
            Queue<Integer> nodes = new LinkedList<>();
            nodes.add(i);

            while (!nodes.isEmpty()) {
                int node = nodes.remove();

                for (int neighbor : graph[node]) {
                    if (colors[neighbor] == 0) {
                        colors[neighbor] = -colors[node];
                        nodes.add(neighbor);
                    } else if (colors[neighbor] == colors[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /*
    DFS
    Time Complexity: (V * E)    Space Complexity: O(V)
     */
    public boolean isBipartite2(int[][] graph) {
        int[] colors = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0 && !isValidColor(graph, colors, 1, i)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidColor(int[][] graph, int[] colors, int correctColor, int node) {
        if (colors[node] != 0 && colors[node] != correctColor) return false;

        colors[node] = correctColor;

        for (int v : graph[node]) {
            if (!isValidColor(graph, colors, -correctColor, v)) {
                return false;
            }
        }
        return true;
    }
}

/*
785. Is Graph Bipartite?
 */

package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q207 {
    /*
     Kahn's Algorithm
     Time Complexity: O(V + E)  Space Complexity: O(V + E)
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> bfs = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
            inDegree[edge[0]]++;
        }

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                bfs.add(i);
            }
        }

        while (!bfs.isEmpty()) {
            int vertex = bfs.poll();
            order.add(vertex);

            for (int v : graph.get(vertex)) {
                if (--inDegree[v] == 0) {
                    bfs.add(v);
                }
            }
        }

        return order.size() == numCourses;
    }

    public static void main(String[] args) {
        System.out.println(new Q207().canFinish(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}}));
    }
}

/*
207. Course Schedule
 */

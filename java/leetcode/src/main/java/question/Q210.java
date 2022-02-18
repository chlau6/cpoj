package question;

import java.util.*;

public class Q210 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q210().findOrder(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}})));
    }

    /*
     Kahn's Algorithm (Topological Sort)
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[numCourses];
        int index = 0;

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.remove();

            result[index++] = node;

            for (int v : graph.get(node)) {
                if (--inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        return index == numCourses ? result : new int[]{};
    }
}

/*
210. Course Schedule II
 */

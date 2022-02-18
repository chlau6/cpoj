package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q207 {
    /*
     Kahn's Algorithm
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> queue = new LinkedList<>();
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];

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

            for (int v : graph.get(node)) {
                if (--inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        for (int in : inDegree) {
            if (in > 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Q207().canFinish(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}}));
    }
}

/*
207. Course Schedule
 */

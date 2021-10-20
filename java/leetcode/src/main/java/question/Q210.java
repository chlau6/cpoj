package question;

import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.Graph;
import annotation.TopologicalSort;
import company.Facebook;

import java.util.*;

@DepthFirstSearch
@BreadthFirstSearch
@Graph
@TopologicalSort
@Facebook
public class Q210 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q210().findOrder(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}})));
    }

    /*
     Kahn's Algorithm (Topological Sort)
     Time Complexity: O(V + E)  Space Complexity: O(V + E)
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        List<Integer> order = new ArrayList<>();
        Queue<Integer> bfs = new LinkedList<>();
        int[] inDegrees = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int from = pre[1];
            int to = pre[0];
            graph.get(from).add(to);
            inDegrees[to]++;
        }

        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0) {
                bfs.add(i);
            }
        }

        while (!bfs.isEmpty()) {
            int course = bfs.poll();
            order.add(course);

            for (int v : graph.get(course)) {
                if (--inDegrees[v] == 0) {
                    bfs.add(v);
                }
            }
        }

        if (order.size() == numCourses) {
            int[] ans = new int[numCourses];

            for (int i = 0; i < order.size(); i++) {
                ans[i] = order.get(i);
            }
            return ans;
        } else {
            return new int[]{};
        }
    }
}

/*
210. Course Schedule II
 */

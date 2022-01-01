package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1376 {
    public static void main(String[] args) {
        System.out.println(new Q1376().numOfMinutes(7, 6, new int[]{1, 2, 3, 4, 5, 6, -1}, new int[]{0, 6, 5, 4, 3, 2, 1}));
    }

    /*
    DFS
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> subordinates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            subordinates.add(new ArrayList<>());
        }

        for (int i = 0; i < manager.length; i++) {
            if (manager[i] != -1) {
                subordinates.get(manager[i]).add(i);
            }
        }

        return dfs(subordinates, informTime, headID);
    }

    private int dfs(List<List<Integer>> subordinates, int[] informTime, int id) {
        int max = 0;
        if (subordinates.get(id).size() == 0) {
            return max;
        }

        for (int subordinate : subordinates.get(id)) {
            max = Math.max(max, dfs(subordinates, informTime, subordinate));
        }

        return max + informTime[id];
    }

    /*
    BFS
    Time Complexity: O(n)   Space Complexity: O(w)
     */
    public int numOfMinutes2(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> subordinates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            subordinates.add(new ArrayList<>());
        }

        for (int i = 0; i < manager.length; i++) {
            if (manager[i] != -1) {
                subordinates.get(manager[i]).add(i);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{headID, 0});
        int totalTime = 0;

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int man = node[0];
            int time = node[1];

            totalTime = Math.max(totalTime, time);
            for (int subordinate : subordinates.get(man)) {
                q.offer(new int[]{subordinate, time + informTime[man]});
            }
        }

        return totalTime;
    }
}

/*
1376. Time Needed to Inform All Employees
 */

package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q1306 {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int curr = q.poll();

                if (arr[curr] == 0) return true;

                int backward = curr - arr[curr];
                int forward = curr + arr[curr];

                if (backward >= 0 && !visited[backward]) {
                    visited[backward] = true;
                    q.add(backward);
                }

                if (forward < n && !visited[forward]) {
                    visited[forward] = true;
                    q.add(forward);
                }
            }
        }

        return false;
    }
}

/*
1306. Jump Game III
 */

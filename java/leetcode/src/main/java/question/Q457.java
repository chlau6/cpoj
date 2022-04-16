package question;

public class Q457 {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;

            boolean[] innerVisited = new boolean[n];
            int curr = i;

            while (true) {
                int next = ((curr + nums[curr]) % n + n) % n;
                if (next == curr || nums[next] * nums[curr] < 0) break;
                if (innerVisited[next]) return true;

                innerVisited[next] = true;
                curr = next;
                visited[next] = true;
            }

        }

        return false;
    }
}

/*
457. Circular Array Loop
 */

package question;

public class Q1066 {
    public int assignBikes(int[][] workers, int[][] bikes) {
        int n = bikes.length;
        int[] dp = new int[1 << n];

        return dfs(workers, bikes, dp, 0, 0);
    }

    private int dfs(int[][] workers, int[][] bikes, int[] dp, int workerIndex, int state) {
        if (workerIndex == workers.length) {
            return 0;
        }

        if (dp[state] != 0) {
            return dp[state];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < bikes.length; i++) {
            if ((state & (1 << i)) == 0) {
                int newState = state | (1 << i);
                min = Math.min(min, dist(workers[workerIndex], bikes[i]) + dfs(workers, bikes, dp, workerIndex + 1, newState));
            }
        }

        dp[state] = min;
        return min;
    }

    private int dist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}

/*
1066. Campus Bikes II
 */

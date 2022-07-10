package question;

public class Q1473 {
    int[][][] dp;
    int MAX = 1000001;

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new int[m][target + 1][n + 1];

        int result = dfs(houses, cost, 0, target, 0);

        return result == MAX ? -1 : result;
    }

    int dfs(int[] houses, int[][] cost, int i, int target, int lastColor) {
        if (i >= houses.length || target < 0) return target == 0 ? target : MAX;

        if (dp[i][target][lastColor] > 0) return dp[i][target][lastColor];

        if (houses[i] != 0) {
            return dfs(houses, cost, i + 1, target - (lastColor != houses[i] ? 1 : 0), houses[i]);
        }

        int result = MAX;

        for (int color = 1; color <= cost[i].length; color++) {
            result = Math.min(result, cost[i][color - 1] + dfs(houses, cost, i + 1, target - (lastColor != color ? 1 : 0), color));
        }

        return dp[i][target][lastColor] = result;
    }
}

/*
1473. Paint House III
 */

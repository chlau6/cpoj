package question;

import java.util.Arrays;

public class Q1928 {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int cities = passingFees.length;
        int maxFee = 1000000;
        int[][] dp = new int[maxTime + 1][cities];

        for (int[] ints : dp) {
            Arrays.fill(ints, maxFee);
        }

        dp[0][0] = passingFees[0];

        for (int i = 1; i <= maxTime; i++) {
            for (int[] edge : edges) {
                if (edge[2] > i) {
                    continue;
                }

                int city1 = edge[0];
                int city2 = edge[1];
                int time = edge[2];

                dp[i][city1] = Math.min(dp[i][city1], dp[i - time][city2] + passingFees[city1]);
                dp[i][city2] = Math.min(dp[i][city2], dp[i - time][city1] + passingFees[city2]);
            }

        }

        int minCost = maxFee;
        for (int i = 0; i <= maxTime; i++) {
            minCost = Math.min(minCost, dp[i][cities - 1]);
        }

        return minCost == maxFee ? -1 : minCost;
    }
}
/*
1971. Find if Path Exists in Graph
 */

package question;

import java.util.Arrays;

public class Q787 {
    /*
    Bellman Ford
     */
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[src] = 0;

        for (int i = 1; i < k + 2; i++) {
            int[] nextDP = new int[n];
            Arrays.fill(nextDP, Integer.MAX_VALUE);
            nextDP[src] = 0;

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                if (dp[from] != Integer.MAX_VALUE) {
                    nextDP[to] = Math.min(nextDP[to], dp[from] + price);
                }
            }
            dp = nextDP;
        }
        return dp[dst] == Integer.MAX_VALUE ? -1 : dp[dst];
    }

    /*
    Bellman Ford
     */
    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[k + 2][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[0][src] = 0;

        for (int i = 1; i < k + 2; i++) {
            dp[i][src] = 0;

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                if (dp[i - 1][from] != Integer.MAX_VALUE) {
                    dp[i][to] = Math.min(dp[i][to], dp[i - 1][from] + price);
                }
            }
        }
        return dp[k + 1][dst] == Integer.MAX_VALUE ? -1 : dp[k + 1][dst];
    }
}

/*
787. Cheapest Flights Within K Stops
 */

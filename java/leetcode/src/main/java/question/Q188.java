package question;

public class Q188 {
    public int maxProfit(int k, int[] prices) {
        if (k > prices.length) return maxProfit(prices);

        int n = prices.length;

        int[][] localMax = new int[n][k + 1];
        int[][] globalMax = new int[n][k + 1];

        for (int i = 1; i < n; i++) {
            int diff = prices[i] - prices[i - 1];

            for (int j = 1; j <= k; j++) {
                localMax[i][j] = Math.max(globalMax[i - 1][j - 1] + Math.max(0, diff), localMax[i - 1][j] + diff);
                globalMax[i][j] = Math.max(globalMax[i - 1][j], localMax[i][j]);
            }
        }

        return globalMax[n - 1][k];
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            int diff = prices[i] - prices[i - 1];

            if (diff > 0) {
                result += diff;
            }
        }

        return result;
    }
}

/*
188. Best Time to Buy and Sell Stock IV
 */

/*

dp[i][j] = maximum profit from at most i transactions using prices[0..j]

A transaction is defined as one buy + sell.

Now on day j, we have two options

1. Do nothing (or buy) which doesn't change the acquired profit : dp[i][j] = dp[i][j-1]

2. Sell the stock: In order to sell the stock, you must've bought it on a day t=[0..j-1]. Maximum profit that can be attained is t:0->j-1 max(prices[j]-prices[t]+dp[i-1][t-1]) where prices[j]-prices[t] is the profit from buying on day t and selling on day j. dp[i-1][t-1] is the maximum profit that can be made with at most i-1 transactions with prices prices[0..t-1].

Time complexity of this approach is O(n^2 * k).

In order to reduce it to O(nk), we must find t:0->j-1 max(prices[j]-prices[t]+dp[i-1][t-1]) this expression in constant time. If you see carefully,

t:0->j-1 max(prices[j]-prices[t]+dp[i-1][t-1]) is same as

prices[j] + t:0->j-1 max(dp[i-1][t-1]-prices[t])

Second part of the above expression maxTemp = t:0->j-1 max(dp[i-1][t-1]-prices[t]) can be included in the dp loop by keeping track of the maximum value till j-1.

Base case:

dp[0][j] = 0; dp[i][0] = 0

DP loop:

for i : 1 -> k
    maxTemp = -prices[0];
    for j : 1 -> n-1
        dp[i][j] = max(dp[i][j-1], prices[j]+maxTemp);
        maxTemp = max(maxTemp, dp[i-1][j-1]-prices[j]);
return dp[k][n-1];
 */
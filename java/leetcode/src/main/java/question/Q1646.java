package question;

public class Q1646 {
    public int getMaximumGenerated(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        int result = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = i % 2 == 0 ? dp[i / 2] : dp[i / 2] + dp[i / 2 + 1];

            result = Math.max(result, dp[i]);
        }

        return result;
    }
}

/*
1640. Check Array Formation Through Concatenation
 */

package question;

public class Q790 {
    public int numTilings(int n) {
        int mod = 1000000007;

        long[] dp = new long[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        if (n <= 3) return (int) dp[n];

        for (int i = 4; i <= n; i++) {
            dp[i] = 2 * dp[i - 1] + dp[i - 3];
            dp[i] %= mod;
        }

        return (int) dp[n];
    }
}

/*
790. Domino and Tromino Tiling
 */

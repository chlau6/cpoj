package question;

public class Q2320 {
    public int countHousePlacements(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        long mod = 1000000007;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return (int) (dp[n] * dp[n] % mod);
    }
}

/*
2320. Count Number of Ways to Place Houses
 */

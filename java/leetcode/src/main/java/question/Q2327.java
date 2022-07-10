package question;

public class Q2327 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1];
        long mod = 1000000007;
        long people = 0;
        long result = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            people = (people + dp[Math.max(i - delay, 0)] - dp[Math.max(i - forget, 0)] + mod) % mod;
            dp[i] = people;
        }

        for (int i = n - forget + 1; i <= n; i++) {
            result = (result + dp[i]) % mod;
        }

        return (int) result;
    }
}

/*
2327. Number of People Aware of a Secret
 */

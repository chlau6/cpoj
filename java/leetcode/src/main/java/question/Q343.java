package question;

import java.util.Arrays;

public class Q343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        return dp[n];
    }
}

/*
343. Integer Break
 */

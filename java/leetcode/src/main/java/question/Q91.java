package question;

public class Q91 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;

        int n = s.length();
        char[] c = s.toCharArray();

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] += c[i - 1] == '0' ? 0 : dp[i - 1];

            if (i > 1 && (c[i - 2] == '1' || c[i - 2] == '2' && c[i - 1] <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}

/*
90. Subsets II
 */

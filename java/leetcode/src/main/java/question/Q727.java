package question;

import java.util.Arrays;

public class Q727 {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int start = -1;
        int minLen = Integer.MAX_VALUE;
        int[][] dp = new int[m + 1][n + 1];

        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= Math.min(i, n); j++) {
                dp[i][j] = s.charAt(i - 1) == t.charAt(j - 1) ? dp[i - 1][j - 1] : dp[i - 1][j];
            }

            if (dp[i][n] != -1) {
                int len = i - dp[i][n];

                if (len < minLen) {
                    minLen = len;
                    start = dp[i][n];
                }
            }
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}

/*
727. Minimum Window Subsequence
 */

package question;

public class Q132 {
    public int minCut(String s) {
        int n = s.length();

        boolean[][] stringDP = new boolean[n][n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = i;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || stringDP[j + 1][i - 1])) {
                    stringDP[j][i] = true;
                    dp[i] = (j == 0) ? 0 : Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }

        return dp[n - 1];
    }
}
/*
132. Palindrome Partitioning II
 */
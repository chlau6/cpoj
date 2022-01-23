package question;

public class Q10 {
    public boolean isMatch(String s, String p) {
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();

        int m = ss.length;
        int n = pp.length;
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (pp[j - 1] == '*') {
                    dp[i][j] = (dp[i][j - 2] || (i > 0 && dp[i - 1][j] && (ss[i - 1] == pp[j - 2] || pp[j - 2] == '.')));
                } else {
                    dp[i][j] = (i > 0 && dp[i - 1][j - 1] && (ss[i - 1] == pp[j - 1] || pp[j - 1] == '.'));
                }
            }
        }

        return dp[m][n];
    }
}

/*
10. Regular Expression Matching
 */

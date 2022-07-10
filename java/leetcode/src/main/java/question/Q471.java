package question;

public class Q471 {
    public static void main(String[] args) {
        System.out.println(new Q471().encode("abbbabbbcabbbabbbc"));
    }

    public String encode(String s) {
        int n = s.length();
        String[][] dp = new String[n][n];

        for (int step = 1; step <= n; step++) {
            for (int i = 0; i + step - 1 < n; ++i) {
                int j = i + step - 1;
                dp[i][j] = s.substring(i, i + step);
                String t = s.substring(i, j + 1);
                String replace = "";

                int pos = (t + t).indexOf(t, 1);
                if (pos < t.length()) {
                    replace = t.length() / pos + "[" + dp[i][i + pos - 1] + "]";

                    if (replace.length() < dp[i][j].length()) dp[i][j] = replace;
                    continue;
                }

                for (int k = i; k < j; ++k) {
                    String left = dp[i][k], right = dp[k + 1][j];
                    if (left.length() + right.length() < dp[i][j].length()) {
                        dp[i][j] = left + right;
                    }
                }
            }
        }

        return dp[0][n - 1];
    }
}

/*
471. Encode String with Shortest Length
 */

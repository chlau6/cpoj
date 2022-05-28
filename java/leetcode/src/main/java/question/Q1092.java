package question;

public class Q1092 {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        String[][] dp = new String[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = "";
            }
        }


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + str1.charAt(i - 1);
                } else {
                    dp[i][j] = dp[i - 1][j].length() > dp[i][j - 1].length() ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }

        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();

        for (char c : dp[m][n].toCharArray()) {
            while (i < m && str1.charAt(i) != c) {
                result.append(str1.charAt(i++));
            }

            while (j < n && str2.charAt(j) != c) {
                result.append(str2.charAt(j++));
            }

            result.append(c);
            i++;
            j++;
        }

        return result + str1.substring(i) + str2.substring(j);
    }
}

/*
1092. Shortest Common Supersequence
 */

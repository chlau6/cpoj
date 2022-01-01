package question;

public class Q5 {
    /*
    Time Complexity: O(n^2)  Space Complexity: O(n^2)
     */
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        char[] str = s.toCharArray();
        int left = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i] = str[i] == str[j] && (i - j < 3 || dp[j + 1][i - 1]);

                if (dp[j][i] && i - j + 1 > maxLength) {
                    left = j;
                    maxLength = i - j + 1;
                }
            }
        }

        return s.substring(left, left + maxLength);
    }
}

/*
5. Longest Palindromic Substring
 */

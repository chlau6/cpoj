package question;

public class Q639 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;

        int n = s.length();
        char[] str = s.toCharArray();
        int mod = 1000000007;

        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = str[0] == '*' ? 9 : 1;

        for (int i = 2; i <= n; i++) {
            if (str[i - 1] == '0') {
                if (str[i - 2] == '1' || str[i - 2] == '2') {
                    dp[i] += dp[i - 2];
                } else if (str[i - 2] == '*') {
                    dp[i] += 2 * dp[i - 2];
                } else {
                    return 0;
                }
            } else if (str[i - 1] >= '1' && str[i - 1] <= '9') {
                dp[i] += dp[i - 1];

                if (str[i - 2] == '1' || (str[i - 2] == '2' && str[i - 1] == '6')) {
                    dp[i] += dp[i - 2];
                } else if (str[i - 2] == '*') {
                    dp[i] += (str[i - 1] <= '6') ? 2 * dp[i - 2] : dp[i - 2];
                }
            } else {
                dp[i] += 9 * dp[i - 1];

                if (str[i - 2] == '1') {
                    dp[i] += 9 * dp[i - 2];
                } else if (str[i - 2] == '2') {
                    dp[i] += 6 * dp[i - 2];
                } else if (str[i - 2] == '*') {
                    dp[i] += 15 * dp[i - 2];
                }
            }

            dp[i] %= mod;
        }

        return (int) dp[n];
    }
}

/*
639. Decode Ways II
 */

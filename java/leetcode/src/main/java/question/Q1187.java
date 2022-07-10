package question;

import java.util.Arrays;
import java.util.TreeSet;

public class Q1187 {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        int n = arr1.length;

        if (n == 1) return 0;

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        int[][] dp = new int[n + 1][n + 1];

        for (int[] d : dp) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }

        dp[0][0] = Integer.MIN_VALUE;

        for (int j = 1; j <= n; j++) {
            for (int i = 0; i <= j; i++) {
                if (arr1[j - 1] > dp[i][j - 1]) {
                    dp[i][j] = arr1[j - 1];
                }

                if (i > 0) {
                    Integer required = set.higher(dp[i - 1][j - 1]);

                    if (required != null) {
                        dp[i][j] = Math.min(dp[i][j], required);
                    }
                }

                if (j == n && dp[i][j] != Integer.MAX_VALUE) return i;
            }
        }

        return -1;
    }
}

/*
1187. Make Array Strictly Increasing
 */

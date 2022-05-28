package question;

import java.util.Arrays;

public class Q1262 {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];

        for (int num : nums) {
            int[] temp = Arrays.copyOf(dp, 3);

            for (int i : temp) {
                dp[(num + i) % 3] = Math.max(dp[(num + i) % 3], num + i);
            }
        }

        return dp[0];
    }
}

/*
1262. Greatest Sum Divisible by Three
 */

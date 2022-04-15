package question;

import java.util.HashMap;

public class Q446 {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        int n = nums.length;
        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long delta = (long) nums[i] - nums[j];

                if (delta < Integer.MIN_VALUE || delta > Integer.MAX_VALUE) continue;

                int diff = (int) delta;
                dp[i].compute(diff, (k, v) -> v == null ? 1 : v + 1);

                if (dp[j].containsKey(diff)) {
                    int count = dp[j].get(diff);

                    result += count;
                    dp[i].compute(diff, (k, v) -> v + count);
                }
            }
        }

        return result;
    }
}

/*
446. Arithmetic Slices II - Subsequence
 */

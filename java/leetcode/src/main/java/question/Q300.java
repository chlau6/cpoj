package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q300 {
    /*
    Binary Search + DP
     */
    public int lengthOfLIS(int[] nums) {
        List<Integer> dp = new ArrayList<>();

        for (int num : nums) {
            int left = 0;
            int right = dp.size();

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (dp.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (right == dp.size()) {
                dp.add(num);
            } else {
                dp.set(right, num);
            }
        }

        return dp.size();
    }

    public int lengthOfLIS2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int result = 0;

        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            result = Math.max(result, dp[i]);
        }

        return result;
    }
}

/*
300. Longest Increasing Subsequence
 */


package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int[] dp = new int[n];
        int[] subset = new int[n];
        List<Integer> result = new ArrayList<>();

        int index = 0;
        int maxSize = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (nums[j] % nums[i] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    subset[i] = j;

                    if (maxSize < dp[i]) {
                        maxSize = dp[i];
                        index = i;
                    }

                }
            }
        }

        for (int i = 0; i < maxSize; i++) {
            result.add(nums[index]);
            index = subset[index];
        }

        return result;
    }
}

/*
368. Largest Divisible Subset
 */

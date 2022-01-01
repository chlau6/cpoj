package question;

import java.util.Arrays;

public class Q16 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n)
     */
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }

        return result;
    }
}

/*
16. 3Sum Closest
 */

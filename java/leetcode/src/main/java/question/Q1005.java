package question;

import java.util.Arrays;

public class Q1005 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length && k > 0 && nums[i] < 0; i++, k--) {
            nums[i] = -nums[i];
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }

        return sum - (k % 2) * 2 * min;
    }
}

/*
1005. Maximize Sum Of Array After K Negations
 */

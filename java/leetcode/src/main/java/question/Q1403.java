package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int suffixSum = 0;

        Arrays.sort(nums);

        for (int num : nums) {
            sum += num;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result.add(nums[i]);
            suffixSum += nums[i];

            if (suffixSum * 2 > sum) break;
        }

        return result;
    }
}

/*
1403. Minimum Subsequence in Non-Increasing Order
 */

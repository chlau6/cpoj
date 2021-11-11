package question;

import annotation.Array;
import annotation.Greedy;
import annotation.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Array
@Greedy
@Sorting
public class Q1403 {
    /*
    Time Complexity: O(n log n)  Space Complexity: O(n)
     */
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

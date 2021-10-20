package question;

import annotation.Array;
import annotation.DynamicProgramming;
import company.Facebook;

@Array
@DynamicProgramming
@Facebook
public class Q689 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] ans = new int[3];
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] += prefixSum[i - 1] + nums[i - 1];
        }

        int leftSum = 0, leftMiddleSum = 0, leftMiddleRightSum = 0;
        int index1 = -1, index2 = -1, index3 = -1;
        for (int i = 0; i <= nums.length - 3 * k; i++) {         //start of 1st arr
            int leftTemp = prefixSum[i + k] - prefixSum[i];
            if (leftTemp > leftSum) {
                leftSum = leftTemp;
                index1 = i;
            }


            int leftMiddleTemp = leftSum + prefixSum[i + 2 * k] - prefixSum[i + k];
            if (leftMiddleTemp > leftMiddleSum) {
                leftMiddleSum = leftMiddleTemp;
                index2 = index1;
                index3 = i + k;
            }

            int leftMiddleRightTemp = leftMiddleSum + prefixSum[i + 3 * k] - prefixSum[i + 2 * k];
            if (leftMiddleRightTemp > leftMiddleRightSum) {
                leftMiddleRightSum = leftMiddleRightTemp;
                ans[0] = index2;
                ans[1] = index3;
                ans[2] = i + 2 * k;
            }
        }
        return ans;
    }
}
// https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/discuss/745591/intuitive-figure-for-sliding-window-method-python-code-with-explanations

/*
689. Maximum Sum of 3 Non-Overlapping Subarrays
 */


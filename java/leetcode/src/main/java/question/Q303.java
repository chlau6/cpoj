package question;

import annotation.Array;
import annotation.Design;
import annotation.PrefixSum;

@Array
@Design
@PrefixSum
public class Q303 {
    /*
    constructor:    Time Complexity: O(n)   Space Complexity: O(n)
    sumRange:       Time Complexity: O(1)   Space Complexity: O(1)
     */
    class NumArray {
        int[] prefixSum;

        public NumArray(int[] nums) {
            prefixSum = new int[nums.length + 1];

            for (int i = 0; i < nums.length; i++) {
                prefixSum[i + 1] = prefixSum[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSum[right + 1] - prefixSum[left];
        }
    }
}
/*
303. Range Sum Query - Immutable
 */

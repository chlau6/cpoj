package question;

import annotation.Array;
import annotation.PrefixSum;

@Array
@PrefixSum
public class Q724 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }

        if (right == 0) return 0;

        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];
            right -= nums[i];

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}

/*
724. Find Pivot Index
 */

package question;

import annotation.Array;
import annotation.Sorting;

@Array
@Sorting
public class Q747 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? index : -1;
    }
}

/*
747. Largest Number At Least Twice of Others
 */

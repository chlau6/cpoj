package question;

import annotation.Array;
import annotation.TwoPointers;

@Array
@TwoPointers
public class Q27 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}

/*
27. Remove Element
 */

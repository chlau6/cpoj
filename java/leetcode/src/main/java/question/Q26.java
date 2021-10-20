package question;

import annotation.Array;
import annotation.TwoPointers;

@Array
@TwoPointers
public class Q26 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i == 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}

/*
26. Remove Duplicates from Sorted Array
 */

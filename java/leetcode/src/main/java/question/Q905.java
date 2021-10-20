package question;

import annotation.Array;
import annotation.Sorting;
import annotation.TwoPointers;

@Array
@TwoPointers
@Sorting
public class Q905 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
        return nums;
    }
}

/*
905. Sort Array By Parity
 */

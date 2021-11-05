package question;

import annotation.Array;
import annotation.Sorting;
import annotation.TwoPointers;

@Array
@TwoPointers
@Sorting
public class Q922 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int length = nums.length;

        while (i < length && j < length) {
            if (nums[i] % 2 == 0) {
                i += 2;
            } else if (nums[j] % 2 == 1) {
                j += 2;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }
}

/*
922. Sort Array By Parity II
 */

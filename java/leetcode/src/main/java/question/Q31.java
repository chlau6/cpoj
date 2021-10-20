package question;

import annotation.Array;
import annotation.TwoPointers;
import company.Facebook;

@Array
@TwoPointers
@Facebook
public class Q31 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public void nextPermutation(int[] nums) {
        int k;
        for (k = nums.length - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) {
                break;
            }
        }

        int m = nums.length - 1;
        if (k < 0) {
            reverseArray(nums, 0, m);
        } else {
            int i;
            for (i = m; i > k; i--) {
                if (nums[i] > nums[k]) break;
            }

            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;

            reverseArray(nums, k + 1, m);
        }
    }

    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}

/*
31. Next Permutation
 */

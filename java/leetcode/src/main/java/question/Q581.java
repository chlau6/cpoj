package question;

import java.util.Arrays;

public class Q581 {
    /*
    Two Pointer
     */
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int start = -1;
        int end = -2;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            if (max > nums[i]) {
                end = i;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);

            if (min < nums[i]) {
                start = i;
            }
        }

        return end - start + 1;
    }

    /*
    Sorting
     */
    public int findUnsortedSubarray2(int[] nums) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);

        Arrays.sort(copy);

        int i = 0;
        int j = n - 1;

        while (i < n && nums[i] == copy[i]) {
            i++;
        }

        while (j >= 0 && nums[j] == copy[j]) {
            j--;
        }

        return i == n ? 0 : j - i + 1;
    }
}

/*
581. Shortest Unsorted Continuous Subarray
 */

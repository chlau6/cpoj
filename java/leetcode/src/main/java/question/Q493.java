package question;

import java.util.Arrays;

public class Q493 {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }

    public int mergesort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        int count = mergesort(nums, left, mid) + mergesort(nums, mid + 1, right);

        for (int i = left, j = mid + 1; i <= mid; i++) {
            while (j <= right && nums[i] / 2.0 > nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        Arrays.sort(nums, left, right + 1);

        return count;
    }
}

/*
493. Reverse Pairs
 */

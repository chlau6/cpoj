package question;

import java.util.Arrays;

public class Q1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;

        Arrays.sort(arr2);

        for (int num : arr1) {
            if (isBetweenRange(arr2, num - d, num + d)) result++;
        }

        return result;
    }

    public boolean isBetweenRange(int[] nums, int from, int to) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= from && nums[mid] <= to) {
                return false;
            } else if (nums[mid] < from) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }
}

/*
1385. Find the Distance Value Between Two Arrays
 */

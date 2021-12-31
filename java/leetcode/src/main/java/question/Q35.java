package question;

import annotation.Array;
import annotation.BinarySearch;

@Array
@BinarySearch
public class Q35 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}

/*
35. Search Insert Position
 */

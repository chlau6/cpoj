package question;

import annotation.Array;
import annotation.BinarySearch;
import company.Facebook;

@Array
@BinarySearch
@Facebook
public class Q154 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
    Worst O(n)
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }

        return nums[right];
    }
}

/*
154. Find Minimum in Rotated Sorted Array II
 */
package question;

import annotation.Array;
import annotation.Sorting;
import annotation.TwoPointers;

@Array
@TwoPointers
@Sorting
public class Q88 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;

        m--;
        n--;

        while (m >= 0 && n >= 0) {
            nums1[index--] = nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[index--] = nums2[n--];
        }
    }
}

/*
88. Merge Sorted Array
 */

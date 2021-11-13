package question;

import annotation.Array;
import annotation.BinarySearch;

@Array
@BinarySearch
public class Q1539 {
    /*
    Time Complexity: O(log n)  Space Complexity: O(1)
     */
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + k;
    }
}

/*
1539. Kth Missing Positive Number
 */

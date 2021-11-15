
package question;

import annotation.Array;
import annotation.BinarySearch;
import annotation.Sorting;

@Array
@BinarySearch
@Sorting
public class Q1608 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n + 1];

        for (int num : nums) {
            if (num > n) {
                counts[n]++;
            } else {
                counts[num]++;
            }
        }

        for (int i = n; i > 0; i--) {
            if (counts[i] == i) return i;

            counts[i - 1] += counts[i];
        }

        return -1;
    }
}

/*
1608. Special Array With X Elements Greater Than or Equal X
 */
